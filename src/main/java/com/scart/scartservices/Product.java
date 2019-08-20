package com.scart.scartservices;

public class Product {
    private String name;
    private Double price;
    private String description;
    
	public Product() {
	}
 
    public Product(String name, Double price, String description) {
        
        this.name = name;
        this.price = price;
        this.description = description;
    }
   
    //Getters and setters
    public String getName() {
        return name;
     }
     public void setName(String name) {
        this.name = name;
     }
     public Double getPrice() {
        return price;
     }
     public void setPrice(Double price) {
        this.price = price;
     }
     public String getDescription() {
         return description;
      }
      public void setDescription(String description) {
         this.description = description;
      }
        
    @Override
    public String toString() {
        return "Product [ name=" + name + ", price=" + price + ",description=" + description +"]";
    }
}
