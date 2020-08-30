/*
 * Creation : 30 Aug 2020
 */
package entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="food_details")
public class FoodEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="food_Id")
    private Integer id;
    @Column(name="item_name")
    private String name;
    private Integer price;
    private Integer rating;
    @ManyToOne
    @JoinColumn(name="price_adjustment")
    private PriceAdjustment priceAdjust;
    
    @ManyToMany(mappedBy="foods", fetch=FetchType.LAZY)
    private Set<RestaurantEntity> restaurants= new HashSet<>();
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getRating() {
        return rating;
    }
    public void setRating(Integer rating) {
        this.rating = rating;
    }
    public PriceAdjustment getPriceAdjust() {
        return priceAdjust;
    }
    public void setPriceAdjust(PriceAdjustment priceAdjust) {
        this.priceAdjust = priceAdjust;
    }
    
    
}
