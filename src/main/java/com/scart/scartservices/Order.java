package com.scart.scartservices;

public class Order {
    private int orderId;
    private String buyerName;
    private String shippingAddress;
    private Item[] items;
   public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int id) {
        this.orderId = id;
    }
    public String getBuyerName() {
        return buyerName;
    }
    public void setBuyerName(String name) {
        this.buyerName = name;
    }
    public String getShippingAddress() {
        return shippingAddress;
    }
    public void setShippingAddress(String address) {
        this.shippingAddress = address;
    }
    public Item[] getItems() {
        return items;
    }
    public void setItems(Item[] items) {
        this.items = items;
    }
 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n----- Order Information-----\n");
        sb.append("Order ID: " + getOrderId() + "\n");
        sb.append("Buyer Name: " + getBuyerName() + "\n");
        sb.append("Shipping Address: " + getShippingAddress() + "\n");
        sb.append("Items:" + getItems() + "\n");
        sb.append("*****************************");
        return sb.toString();
    }
}
