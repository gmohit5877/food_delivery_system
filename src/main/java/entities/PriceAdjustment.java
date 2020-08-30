/*
 * Creation : 30 Aug 2020
 */
package entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="PRICE_ADJUSTMENT")
public class PriceAdjustment {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="price_Id")
    private Integer id;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="start_time")
    private Date starTime;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="end_time")
    private Date endTime;
    private Integer price;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Date getStarTime() {
        return starTime;
    }
    public void setStarTime(Date starTime) {
        this.starTime = starTime;
    }
    public Date getEndTime() {
        return endTime;
    }
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    
}
