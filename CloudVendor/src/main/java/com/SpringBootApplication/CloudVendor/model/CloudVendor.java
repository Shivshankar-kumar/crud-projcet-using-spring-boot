package com.SpringBootApplication.CloudVendor.model;

public class CloudVendor {

    private Integer vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorCity;
    private String vendorMobile;

    
    public CloudVendor() {
    }
    
    public CloudVendor(Integer vendorId, String vendorName, String vendorAddress, String vendorCity, String vendorMobile) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorCity = vendorCity;
        this.vendorMobile = vendorMobile;
    }

    public Integer getVendorId() {
        return vendorId;
    }
    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }
    public String getVendorName() {
        return vendorName;
    }
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    public String getVendorAddress() {
        return vendorAddress;
    }
    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }
    public String getVendorCity() {
        return vendorCity;
    }
    public void setVendorCity(String vendorCity) {
        this.vendorCity = vendorCity;
    }
    public String getVendorMobile() {
        return vendorMobile;
    }
    public void setVendorMobile(String vendorMobile) {
        this.vendorMobile = vendorMobile;
    }
    
}
