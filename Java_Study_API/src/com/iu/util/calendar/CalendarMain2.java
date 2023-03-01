package com.iu.util.calendar;

import java.util.Calendar;

public class CalendarMain2 {

   public static void main(String[] args) {
      Calendar now = Calendar.getInstance();
      
      Calendar future = Calendar.getInstance();
      future.set(Calendar.MINUTE, 15);
      
      long n = now.getTimeInMillis();
      long f = future.getTimeInMillis();
      Calendar birth = Calendar.getInstance();
      
   }
}