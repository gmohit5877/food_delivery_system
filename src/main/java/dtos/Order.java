/*
 * Creation : 30 Aug 2020
 */
package dtos;

import java.util.List;

public class Order {
    private Integer userId;
    private Integer restaurantId;
    private List<Integer> foodItems;
    private String deliveryAddress;
    private String status;
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getRestaurantId() {
        return restaurantId;
    }
    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }
    public List<Integer> getFoodItems() {
        return foodItems;
    }
    public void setFoodItems(List<Integer> foodItems) {
        this.foodItems = foodItems;
    }
    public String getDeliveryAddress() {
        return deliveryAddress;
    }
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
}
