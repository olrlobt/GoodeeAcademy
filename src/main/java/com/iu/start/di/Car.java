package com.iu.start.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Car {

	
	
	 //Car는  Engine이 없으면 X
	   //Car는 Engine에 의존적
	   
	   private Engine engine;
	   private Wheel leftWheel;
	   private Wheel rightWheel;
	   
	   public Car(Wheel leftWheel, Wheel rightWheel) {
		   
		   this.leftWheel = leftWheel;
		   this.rightWheel = rightWheel;
		   
	   }

	   public Engine getEngine() {
	      return engine;
	   }

	   @Autowired
	   public void setEngine(Engine engine) {
	      this.engine = engine;
	   }
	   
	   
	   //멤버변수 초기화
	   // 1. private Engine engine = new Engine();
	   
	   // Car car = new Car();
	   
	   
	  
	   

	
	
}
