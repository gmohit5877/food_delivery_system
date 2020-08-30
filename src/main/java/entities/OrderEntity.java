/*
 * Creation : 30 Aug 2020
 */
package entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="order_Details")
public class OrderEntity {
    @Id
    @Column(name="order_Id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name="user_Id")
    private UserEntity user;
    @ManyToOne
    @JoinColumn(name="restaurant_Id")
    private RestaurantEntity rest;
    private String status;
    private String address;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="order_Date")
    private Date orderDate;
    @OneToMany
    @JoinTable(name="order_food", joinColumns ={   @JoinColumn(referencedColumnName="order_Id", name="order_Id", nullable=false,updatable=false)  },
            inverseJoinColumns = {
                    @JoinColumn(referencedColumnName="food_Id", name="food_Id", nullable= false, updatable= false)
            })
    private Set<FoodEntity> foods= new HashSet<>();
    
    public Set<FoodEntity> getFoods() {
        return foods;
    }
    public void setFoods(Set<FoodEntity> foods) {
        this.foods = foods;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public UserEntity getUser() {
        return user;
    }
    public void setUser(UserEntity user) {
        this.user = user;
    }
    public RestaurantEntity getRest() {
        return rest;
    }
    public void setRest(RestaurantEntity rest) {
        this.rest = rest;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    

}
