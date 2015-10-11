/*
 * DateFormatter.java
 *
 * Created on January 8, 2005, 9:20 AM
 */

package com.afrisoftech.lib;

/**
 *
 * @author  root
 */
public class DateFormatter extends java.text.SimpleDateFormat {
    
    java.util.Date dateObject = null;
    
    java.lang.String dateStringFormat = null;
    
    /** Creates a new instance of DateFormatter */
    public DateFormatter(java.util.Date date2Format, java.lang.String dateFormat) {
        
        super(dateFormat);
        
        dateObject = date2Format;
        
        dateStringFormat = dateFormat;
        
        this.applyPattern(dateStringFormat);
      
    }
    
            
        public java.lang.String getDateString(){
            
                  return(this.format(dateObject));
            
        }
    
}
