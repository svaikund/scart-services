package com.scart.scartservices;

public class ShippingRate {
    private String type;
    private Integer price;
    
	public ShippingRate() {
	}
 
    public ShippingRate(String type, Integer price) {
        super();
        this.type = type;
        this.price = price;
    }
   
    //Getters and setters
    public String getType() {
        return type;
     }
     public void setType(String type) {
        this.type = type;
     }
     public Integer getPrice() {
        return price;
     }
     public void setPrice(Integer price) {
        this.price = price;
     }
        
    @Override
    public String toString() {
        return "ShippingRate [type=" + type + ", price=" + price + "]";
    }
}
