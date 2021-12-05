package com.hirewheel.hirewheel.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId ;

    @Column(nullable = false)
    private LocalDateTime pickupDate ;

    @Column(nullable = false)
    private LocalDateTime dropOffDate ;

    @Column(nullable = false)
    private LocalDateTime bookingDate ;

    @Column(nullable = false)
    private double amount ;

    @ManyToOne
    @JoinColumn(name = "locationId", nullable = false)
    private Location location ;

    @ManyToOne
    @JoinColumn(name = "vehicleId", nullable = false)
    private Vehicle vehicleWithBooking ;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private Users user ;


    public Location getLocation() {
        return location;
    }


    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", pickupDate=" + pickupDate +
                ", dropOffDate=" + dropOffDate +
                ", bookingDate=" + bookingDate +
                ", amount=" + amount +
                ", location=" + location +
                '}';
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDateTime getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(LocalDateTime pickupDate) {
        this.pickupDate = pickupDate;
    }

    public LocalDateTime getDropOffDate() {
        return dropOffDate;
    }

    public void setDropOffDate(LocalDateTime dropOffDate) {
        this.dropOffDate = dropOffDate;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
