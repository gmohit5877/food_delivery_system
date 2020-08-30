package controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import beans.Booked;
//import beans.Order;
import business.LocationBusiness;
import dtos.Order;
import entities.FoodEntity;
import entities.OrderEntity;
import entities.RestaurantEntity;
import entities.UserEntity;
import repository.FoodRepository;
import repository.OrderRepository;
import repository.RestaurantRepository;
import repository.UserRepository;

@RestController
@RequestMapping("/booking")
public class BookingController {
	private static Integer counter=1000;
    
	@Autowired
	LocationBusiness business;
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	OrderRepository orderRepo;
	
	@Autowired
	RestaurantRepository restRepo;
	
	@Autowired
	FoodRepository foodRepo;
	
	@PostMapping
	public String bookOrder(@RequestBody Order order){
		System.out.println(order.getFoodItems());
		OrderEntity orderEntity= new OrderEntity();
		Optional<UserEntity> userObj = userRepo.findById(order.getUserId());
		if(userObj.isPresent()){
		    UserEntity user= userObj.get();
		    Optional<RestaurantEntity> restOptional= restRepo.findById(order.getRestaurantId());
		    if(restOptional.isPresent()) {
		        RestaurantEntity restEntity = restOptional.get();
		        List<Integer> availableFoods= new ArrayList<>();
		        for(FoodEntity foodItem: restEntity.getFoods()) {
		            availableFoods.add(foodItem.getId());
		        }
		        if(!availableFoods.containsAll(order.getFoodItems())) {
                    return "Food is not available in this restaurant!";
                }
		        List<FoodEntity> foodItems = foodRepo.findByIdIn(order.getFoodItems());
		        
		        orderEntity.setAddress(order.getDeliveryAddress());
		        orderEntity.setOrderDate(new Date());
		        orderEntity.setRest(restEntity);
		        orderEntity.setStatus("in Progress");
		        orderEntity.setUser(user);
		        orderEntity.setFoods(new HashSet(foodItems));
		        orderEntity.setId(counter++);
		        orderRepo.save(orderEntity);
		    }else {
		        return "Please provide the correct restaurant detail";
		    }
		}else {
		    return "Please sign up before order";
		}
		return "Order successful with Order ID :- "+orderEntity.getId();
	}
	@GetMapping("/{orderId}")
	public Order getOrderDetail(@PathVariable Integer orderId){
	    Optional<OrderEntity> entity= orderRepo.findById(orderId);
	    Order order=null;
	    if(entity.isPresent()) {
	        OrderEntity orderEntity= entity.get();
	        order= new Order();
	        order.setDeliveryAddress(orderEntity.getAddress());
	        order.setRestaurantId(orderEntity.getRest().getId());
	        order.setStatus(orderEntity.getStatus());
	        order.setUserId(orderEntity.getUser().getId());
	        order.setFoodItems(new ArrayList<>());
	        for(FoodEntity food: orderEntity.getFoods()) {
	            order.getFoodItems().add(food.getId());
	        }
	    }
		return order;
	}
	
	@DeleteMapping("/{orderId}")
	public String deleteOrder(@PathVariable Integer orderId){
	    orderRepo.deleteById(orderId);
		return "Order deleted successfully";
	}
	@PutMapping
	public String updateOrder(@RequestBody Order order){
		return "Order updated successfully";
	}
}