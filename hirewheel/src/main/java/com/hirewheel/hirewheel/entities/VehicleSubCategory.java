package com.hirewheel.hirewheel.entities;

import javax.persistence.*;

@Entity
@Table(name = "vehicle_subcategory")
public class VehicleSubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleSubcategoryId ;

    @Column(nullable = false, length = 50, unique = true)
    private String vehicleSubcategoryName ;

    @Column(nullable = false)
    private double pricePerDay ;

    public int getVehicleSubcategoryId() {
        return vehicleSubcategoryId;
    }

    public void setVehicleSubcategoryId(int vehicleSubcategoryId) {
        this.vehicleSubcategoryId = vehicleSubcategoryId;
    }

    public String getVehicleSubcategoryName() {
        return vehicleSubcategoryName;
    }

    public void setVehicleSubcategoryName(String vehicleSubcategoryName) {
        this.vehicleSubcategoryName = vehicleSubcategoryName;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public VehicleSubCategory(int vehicleSubcategoryId, String vehicleSubcategoryName, double pricePerDay) {
        this.vehicleSubcategoryId = vehicleSubcategoryId;
        this.vehicleSubcategoryName = vehicleSubcategoryName;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        return "VehicleSubCategory{" +
                "vehicleSubcategoryId=" + vehicleSubcategoryId +
                ", vehicleSubcategoryName='" + vehicleSubcategoryName + '\'' +
                ", pricePerDay=" + pricePerDay +
                '}';
    }
}
