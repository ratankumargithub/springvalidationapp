package com.ratan;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateProperty extends PropertyEditorSupport {
    @Override
    public String getAsText() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //String ret = sdf.format(new Date());
       String ret=null;
        
        Object value = this.getValue();
        if(value!=null)
        {
            if(value instanceof Date) {
                ret = sdf.format((Date)value);
            }
        }
        return ret;
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = sdf.parse(text);
            this.setValue(date);
        }catch(ParseException e){
        	System.out.println("wrong format");
            date = null;
            this.setValue(text);
        }
    }
}