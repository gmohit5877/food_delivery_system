/*
 * Creation : 30 Aug 2020
 */
package controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dtos.Restaurant;
import entities.RestaurantEntity;
import repository.LocationRepository;
import repository.RestaurantRepository;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
    
    @Autowired
    RestaurantRepository repo;
    @Autowired
    LocationRepository locRepo;
    
    @GetMapping("/{locationId}")
    public List<Restaurant> getAllRestaurant(@PathVariable Integer locationId){
            List<RestaurantEntity> entities = locRepo.findById(locationId).get().getRestaurants();
            System.out.println(entities.get(0).getName());
            List<Restaurant> list= new ArrayList<>();
            entities.forEach(x -> {
                Restaurant rest=new Restaurant();
                rest.setArea(x.getLocation().getArea());
                rest.setCity(x.getLocation().getCity());
                rest.setName(x.getName());
                rest.setRestaurnatID(x.getId());
                rest.setRating(x.getRating());
                list.add(rest);
            });
        return list;
    }
}
