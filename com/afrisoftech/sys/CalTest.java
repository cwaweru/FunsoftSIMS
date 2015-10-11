/*
 * CalTest.java
 *
 * Created on April 26, 2003, 5:43 PM
 */

package com.afrisoftech.sys;

/**
 *
 * @author  postgres
 */
public class CalTest {
    
    /** Creates a new instance of CalTest */
    public CalTest() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.roll(java.util.Calendar.YEAR, -1);
     //   calendar.roll(java.util.Calendar.MONTH, -2);
     //   calendar.set(java.util.Calendar.DAY_OF_MONTH, 1);
        System.out.println(calendar.get(java.util.Calendar.DAY_OF_WEEK)+"\t"+calendar.get(java.util.Calendar.DAY_OF_MONTH));
        System.out.println("\t"+calendar.get(java.util.Calendar.MONTH)+"\t"+calendar.get(java.util.Calendar.YEAR));
        System.out.println("Integer Representation for Sunday : "+java.util.Calendar.SUNDAY);        
        System.out.println(calendar.getTime().toString());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new CalTest();
        
    }
    
}
