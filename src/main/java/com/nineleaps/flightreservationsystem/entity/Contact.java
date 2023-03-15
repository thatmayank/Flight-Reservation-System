package com.nineleaps.flightreservationsystem.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String addressLine;
    private String zipCode;
    private String city;
    private String state;
    private String country;
    private long mobileNo;

    public Contact() {
    }


    public Contact(Long id, String type, String addressLine, String zipCode, String city, String state, String country, long mobileNo) {
        this.id = id;
        this.type = type;
        this.addressLine = addressLine;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
        this.country = country;
        this.mobileNo = mobileNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", type='" + type + '\'' + ", addressLine='" + addressLine + '\'' + ", zipCode='" + zipCode + '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' + ", country='" + country + '\'' + ", mobileNo=" + mobileNo + '}';
    }
}
