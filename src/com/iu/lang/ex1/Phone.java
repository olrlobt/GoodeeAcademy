package com.iu.lang.ex1;

public class Phone {

   private int price;
   private int size;
   
   @Override
   public boolean equals(Object obj) { // obj  p2 
	   	
	  Phone p2 = (Phone) obj;
	  
	  if(p2.price == this.price && p2.size == this.size) {
		  
		  return true;
	  }
	  
      return false;
   }
   public int getPrice() {
      return price;
   }
   public void setPrice(int price) {
      this.price = price;
   }
   public int getSize() {
      return size;
   }
   public void setSize(int size) {
      this.size = size;
   }
   
}