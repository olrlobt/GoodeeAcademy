package com.iu.lang.ex1;

public class EqualMain {
   public static void main(String[] args) {
   

      Phone p1 = new Phone();
      p1.setPrice(100);
      p1.setSize(50);
      
      Phone p2 = new Phone();
      p2.setPrice(100);
      p2.setSize(50);
      
      System.out.println(p1 == p2); //false
      //참조변수? 주소비교
      System.out.println(p1.equals(p2));
      //오버라이딩으로 두개의 값이 같으면 true;
      
   }
}