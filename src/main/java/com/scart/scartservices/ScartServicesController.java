package com.scart.scartservices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ScartServicesController {
   private static Map<String, ShippingRate> shippingRateRepo = new HashMap<>();
   static {
      ShippingRate oned = new ShippingRate();
      oned.setType("One-day-Delivery");
      oned.setPrice(30);
      shippingRateRepo.put(oned.getType(), oned);
      
      ShippingRate twod = new ShippingRate();
      twod.setType("Two-day-Delivery");
      twod.setPrice(20);
      shippingRateRepo.put(twod.getType(), twod);
      
      ShippingRate nrd = new ShippingRate();
      nrd.setType("No-rush-Delivery");
      nrd.setPrice(10);
      shippingRateRepo.put(nrd.getType(), nrd);
   }

   @CrossOrigin
   @RequestMapping(value = "/shippingrates")
   public ResponseEntity<Object> getShippingRates() {
      return new ResponseEntity<>(shippingRateRepo.values(), HttpStatus.OK);
   }
	@CrossOrigin
	@PostMapping(path= "/submitorder", consumes = "application/json", produces = "application/json")
	public ResponseEntity<OrderStatus> getProduct(@RequestBody Order ord) {
		System.out.println("ORDER ID" + ord.getOrderId() );
		OrderStatus os = new OrderStatus(ord);
		os.setStatus(true);
	    return new ResponseEntity<OrderStatus>(os, HttpStatus.OK);
	}
	
	 private static Map<String, Product> productRepo = new HashMap<>();
	   
	 static {
	 
		  Product onep = new Product();
	      onep.setName("Google Pixel 5");
	      onep.setPrice(799.0);
	      onep.setDescription("A large phone with one of the best cameras");
	      productRepo.put(onep.getName(), onep);
	      
	      Product twop = new Product();
	      twop.setName("IPhone XR");
	      twop.setPrice(699.0);
	      twop.setDescription("Great phone, a beauty");
	      productRepo.put(twop.getName(), twop);
	      
	      Product threep = new Product();
	      threep.setName("OnePlus 7 Pro");
	      threep.setPrice(599.0);
	      threep.setDescription("An Allrounder, Absolute value for money");
	      productRepo.put(threep.getName(), threep);
	   }

	  /* @CrossOrigin
	   @GetMapping(value = "/products", produces = "application/json")
	   public ResponseEntity<Object> getProducts() {
	      return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
	   }*/

	   @CrossOrigin
	   @GetMapping(value = "/products", produces = "application/json")
	   @ResponseBody
	   public List<Product> returnProducts() {
	      return new ArrayList<Product>(productRepo.values());
	   }


}