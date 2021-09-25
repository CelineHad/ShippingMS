package com.example.shippingms.Beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UPS implements shipment{

    @Id
    @Column(name="ID")
    private int ID;

    @Column(name="shipmentServiceID")
    private String shipmentServiceID;

    @Column(name="width")
    private Double width;

    @Column(name="height")
    private Double height ;

    @Column(name="length")
    private Double length;

    @Column(name="weight")
    private Double weight ;

    public String getShipmentServiceID() {
        return shipmentServiceID;
    }

    public void setShipmentServiceID(String shipmentServiceID) {
        this.shipmentServiceID = shipmentServiceID;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public UPS(){}

    public UPS(String shipmentServiceID, Double width, Double height, Double length, Double weight) {

        this.shipmentServiceID = shipmentServiceID;
        this.width = width;
        this.height = height;
        this.length = length;
        this.weight = weight;
    }
}
