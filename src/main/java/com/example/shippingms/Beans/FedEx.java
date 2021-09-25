package com.example.shippingms.Beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fedex")
public class FedEx implements shipment {

    @Id
    @Column(name="ID")
    private int ID;

    @Column(name="carrierServiceID")
    private String carrierServiceID;

    @Column(name="width")
    private Double width;

    @Column(name="height")
    private Double height ;

    @Column(name="length")
    private Double length;

    @Column(name="weight")
    private Double weight ;


    public FedEx(){}

    public FedEx( String carrierServiceID, Double width, Double height, Double length, Double weight) {
        this.carrierServiceID = carrierServiceID;
        this.width = width;
        this.height = height;
        this.length = length;
        this.weight = weight;
    }

    public String getCarrierServiceID() {
        return carrierServiceID;
    }

    public void setCarrierServiceID(String carrierServiceID) {
        this.carrierServiceID = carrierServiceID;
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
}
