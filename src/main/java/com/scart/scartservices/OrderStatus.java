package com.scart.scartservices;

public class OrderStatus {
	  private int orderId;
	  private String buyerName;
	  private String shippingAddress;
	  private boolean status;
	  public OrderStatus(Order ord) {
		  this.orderId=ord.getOrderId();
		  this.buyerName=ord.getBuyerName();
		  this.shippingAddress=ord.getShippingAddress();
	  }
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
	    public boolean getStatus() {
	        return status;
	    }
	    public void setStatus(boolean status) {
	        this.status = status;
	    }
	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("\n----- Order Status Information-----\n");
	        sb.append("Order ID: " + getOrderId() + "\n");
	        sb.append("Buyer Name: " + getBuyerName() + "\n");
	        sb.append("Shipping Address: " + getShippingAddress() + "\n");
	        sb.append("Status:" + getStatus() + "\n");
	        sb.append("*****************************");
	        return sb.toString();
	    }
}
