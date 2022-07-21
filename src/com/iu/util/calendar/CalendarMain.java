package com.iu.util.calendar;

import java.util.Calendar;

public class CalendarMain {
   public static void main(String[] args) {
   
      Calendar ca = Calendar.getInstance();
      System.out.println(ca);
      ca.set(Calendar.MONTH,11);
      

      int y = ca.get(Calendar.YEAR);
      int m = ca.get(Calendar.MONTH);
      int d = ca.get(Calendar.DAY_OF_MONTH);
      int h = ca.get(Calendar.HOUR);
      
      System.out.println(m);
      
      
      long a = ca.getTimeInMillis();
      System.out.println(a);
      
   }
}