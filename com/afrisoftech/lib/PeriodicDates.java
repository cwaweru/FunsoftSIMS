/*
 * PeriodicDates.java
 *
 * Created on April 4, 2004, 5:58 PM
 */

package com.afrisoftech.lib;

/**
 *
 * @author  root
 */
public class PeriodicDates {
    
    java.util.Vector datesVector = null;
    
    java.util.Vector datesChildVector = null;
    
    java.util.Date defaultDate = null;
    
    java.util.Calendar calDates = null;
    
    java.lang.Object[][] dateRanges = null;
    
    int intervals = 1;
    
    /** Creates a new instance of PeriodicDates */
    public PeriodicDates(java.util.Date dateDefault, int intervalRange) {
        
        datesVector = new java.util.Vector(1,1);
        
        datesChildVector = new java.util.Vector(1,1);
        
        defaultDate = dateDefault;
        
        if (intervalRange > 0) {
            
            intervals = intervalRange;
            
        }
        
        if (defaultDate == null) {
            
            calDates = java.util.Calendar.getInstance();
            
        } else {
            
            calDates = java.util.Calendar.getInstance();
            
            calDates.setTime(defaultDate);
            
        }
        
        System.out.println("Datestamp is ["+calDates.getTime().toString()+"]");
        
    }
    
    public java.lang.Object[][] getWeeklyDates() {
        
        datesVector.removeAllElements();
        
        datesChildVector.removeAllElements();
        
        int dayofWeek = calDates.get(calDates.DAY_OF_WEEK);
        
        datesChildVector.addElement(calDates.getTime().toString());
        System.out.print("Last day of Week is ["+calDates.getTime().toString()+"]");
        calDates.add(java.util.Calendar.DATE, -(dayofWeek - 1));
        
        datesChildVector.addElement(calDates.getTime().toString());
        System.out.print(" and first day of Week ["+calDates.getTime().toString()+"]\n");
        
        
        datesVector.addElement(datesChildVector);
        
        for (int i = 0; i < intervals; i++) {
            
            calDates.add(java.util.Calendar.DATE, -1);
            
            datesChildVector = new java.util.Vector(1,1);
            
            datesChildVector.addElement(calDates.getTime().toString());
            System.out.print("Last day of Week is ["+calDates.getTime().toString()+"]");
            calDates.add(java.util.Calendar.DATE, -6);
            
            datesChildVector.addElement(calDates.getTime().toString());
            
            datesVector.addElement(datesChildVector);
            
            System.out.print(" and first day of Week ["+calDates.getTime().toString()+"]\n");
            
            
        }
        
        System.out.println(dayofWeek);
        
        dateRanges = getDatesArray(datesVector);
        
        return dateRanges;
        
    }
    
    public java.lang.Object[][] getMonthlyDates() {
        
        datesVector.removeAllElements();
        
        datesChildVector.removeAllElements();
        
        //        int dayofMonth = calDates.get(calDates.DAY_OF_WEEK);
        
        datesChildVector.addElement(calDates.getTime().toString());
        System.out.print("Day of Month is ["+calDates.getTime().toString()+"]");
        //        calDates.add(java.util.Calendar.DATE, ));
        calDates.set(java.util.Calendar.DATE, calDates.getActualMinimum(java.util.Calendar.DATE));
        
        String firstDayofMonth = calDates.getTime().toString();
        datesChildVector.addElement(firstDayofMonth);
        System.out.print(" and first day of Month ["+calDates.getTime().toString()+"]\n");
        
        
        datesVector.addElement(datesChildVector);
        
        for (int i = 0; i < intervals; i++) {
            
            calDates.add(java.util.Calendar.MONTH, -1);
            
            datesChildVector = new java.util.Vector(1,1);
            
            calDates.set(java.util.Calendar.DATE, calDates.getActualMaximum(java.util.Calendar.DATE));
            
            String lastDayofMonth = calDates.getTime().toString();
            
            datesChildVector.addElement(lastDayofMonth);
            
            System.out.print("Last day of Month is ["+lastDayofMonth+"]");
            //        calDates.add(java.util.Calendar.DATE, -6);
            
            calDates.set(java.util.Calendar.DATE, calDates.getActualMinimum(java.util.Calendar.DATE));
            
            firstDayofMonth = calDates.getTime().toString();
            
            datesChildVector.addElement(firstDayofMonth);
            
            datesVector.addElement(datesChildVector);
            
            System.out.print(" and first day of Month ["+firstDayofMonth+"]\n");
            
            
        }
        
        dateRanges = getDatesArray(datesVector);
        
        return dateRanges;
        
    }
    
    public java.lang.Object[][] getDailyDates() {
        
        
        
        return dateRanges;
        
    }
    
    public java.lang.Object[][] getYearlyDates() {
        
        datesVector.removeAllElements();
        
        datesChildVector.removeAllElements();
        
        //        int dayofMonth = calDates.get(calDates.DAY_OF_WEEK);
        
        datesChildVector.addElement(calDates.getTime().toString());
        System.out.print("Day of Year is ["+calDates.getTime().toString()+"]");
        //        calDates.add(java.util.Calendar.DATE, ));
        calDates.set(java.util.Calendar.DATE, calDates.getActualMinimum(java.util.Calendar.DATE));
        
        String firstDayofYear = calDates.getTime().toString();
        datesChildVector.addElement(firstDayofYear);
        System.out.print(" and first day of Year ["+calDates.getTime().toString()+"]\n");
        
        
        datesVector.addElement(datesChildVector);
        
        for (int i = 0; i < intervals; i++) {
            
            calDates.add(java.util.Calendar.YEAR, -1);
            
            datesChildVector = new java.util.Vector(1,1);
            
            calDates.set(java.util.Calendar.DATE, calDates.getActualMaximum(java.util.Calendar.DATE));
            
            String lastDayofYear = calDates.getTime().toString();
            
            datesChildVector.addElement(lastDayofYear);
            
            System.out.print("Last day of Year is ["+lastDayofYear+"]");
            //        calDates.add(java.util.Calendar.DATE, -6);
            
            calDates.set(java.util.Calendar.DATE, calDates.getActualMinimum(java.util.Calendar.DATE));
            
            firstDayofYear = calDates.getTime().toString();
            
            datesChildVector.addElement(firstDayofYear);
            
            datesVector.addElement(datesChildVector);
            
            System.out.print(" and first day of Year ["+firstDayofYear+"]\n");
            
            
        }
        
        dateRanges = getDatesArray(datesVector);
        
        return dateRanges;
        
    }
    
    public static void main(java.lang.String[] args) {
        
        PeriodicDates periodicDates =  new PeriodicDates(null, 20);
        
        //        periodicDates.getWeeklyDates();
        
        System.out.println("Printing Monthly dates \n");
        
        periodicDates.getMonthlyDates();
       // periodicDates.getYearlyDates();
        
    }
    
    private java.lang.Object[][] getDatesArray(java.util.Vector vector2Process) {
        
        java.lang.Object[][] string2Return = null;
        
        java.util.Vector childVector = null;
        
        int vectorSize = vector2Process.size();
        
        string2Return = new java.lang.Object[vectorSize][2];
        
        for (int i = 0; i < vectorSize; i++) {
            
            childVector = (java.util.Vector)vector2Process.get(i);
            
            for (int j = 0; j < childVector.size(); j++) {
                
                string2Return[i][j] = childVector.get(j);
                
            }
            
            
        }
        
        for (int k = 0; k < vectorSize; k++) {
            
            for (int m = 0; m < 2; m++) {
                
                System.out.print("["+string2Return[k][m].toString()+"] ");
                
            }
            
            System.out.println();
            
        }
        
        return string2Return;
        
        
        
    }
    
}
