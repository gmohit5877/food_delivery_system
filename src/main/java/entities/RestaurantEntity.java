/*
 * Creation : 30 Aug 2020
 */
package entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="restaurant")
public class RestaurantEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="restaurant_Id")
 private Integer id;
 private String name;
 @ManyToOne
 @JoinColumn(name="location_id", nullable = false)
 private Location location;
 private Integer rating;
 private Long contact;
 @ManyToMany
 @JoinTable(name="restaurant_food", joinColumns ={   @JoinColumn(referencedColumnName="restaurant_Id", name="restaurant_Id", nullable=false,updatable=false)  },
 inverseJoinColumns = {
         @JoinColumn(referencedColumnName="food_Id", name="food_Id", nullable= false, updatable= false)
 }
 )
 private Set<FoodEntity> foods = new HashSet<>();
 
public Set<FoodEntity> getFoods() {
    return foods;
}
public void setFoods(Set<FoodEntity> foods) {
    this.foods = foods;
}
public Integer getId() {
    return id;
}
public void setId(Integer restaurantId) {
    this.id = restaurantId;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public Location getLocation() {
    return location;
}
public void setLocation(Location location) {
    this.location = location;
}
public Integer getRating() {
    return rating;
}
public void setRating(Integer rating) {
    this.rating = rating;
}
public Long getContact() {
    return contact;
}
public void setContact(Long contact) {
    this.contact = contact;
}
 
 
}
