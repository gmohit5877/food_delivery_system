/*
 * Creation : 30 Aug 2020
 */
package entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="location_id")
    private Integer id;
    private String area;
    private String city;
    @OneToMany(mappedBy="location")
    private List<RestaurantEntity> restaurants; 
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public List<RestaurantEntity> getRestaurants() {
        return restaurants;
    }
    public void setRestaurants(List<RestaurantEntity> restaurants) {
        this.restaurants = restaurants;
    }
    public void setLocationId(Integer locationId) {
        this.id = locationId;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public Integer getLocationId() {
        return id;
    }
    public String getCity() {
        return city;
    }
    public String getArea() {
        return area;
    } 
}
