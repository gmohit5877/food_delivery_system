/*
 * Creation : 30 Aug 2020
 */
package dtos;

import java.util.Date;

public class Booked {
    private long bookingId;
    private String status;
    private Date bookingDate;
    public void setStatus(String status) {
        this.status = status;
    }
    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }
    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }
    public String getStatus() {
        return status;
    }
    public long getBookingId() {
        return bookingId;
    }
    public Date getBookingDate() {
        return bookingDate;
    } 
}
