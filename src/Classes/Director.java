/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Asveni
 */
public class Director extends JFrame { //polymorhic
    public Boolean FieldValidation (JLabel[] Labels, JTextField[] TextFields) throws Exception {
        Boolean b = true;
        if (Labels.length != TextFields.length) {
            throw new Exception ("Invalid Mapping");
        }
        else {
            for (int i = 0; i < TextFields.length; i++) {
                if (TextFields[i].getText().length()<=0) {
                    Labels[i].setForeground(Color.red);
                    b = false;
                }
            }
        }
        return b;
    }

        public Boolean FieldValidation (String[] DefaultValues, JTextField[] TextFields) throws Exception {
        Boolean b = true;
        if (DefaultValues.length != TextFields.length) { 
            throw new Exception ("Invalid Mapping"); // if the two diff label
        }
        else {
            for (int i = 0; i < TextFields.length; i++) {
                if (TextFields[i].getText().equals(DefaultValues[i])) {
                    TextFields[i].setForeground(Color.red);
                    b = false; 
                }
            }
        }
        return b;
    }
    
    public Boolean DateValidation (String Input) {
        try {
            Date date = new Date ();
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            date = sdf.parse(Input);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
    
    public Date DateConvert (String Input) { 
        try {
            Date date = new Date ();
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            date = sdf.parse(Input);
            return date;
        }
        catch (Exception e) {
            return null;
        }
    }
        public String Date2String (Date Input) {
            String s = "";
            Calendar c = Calendar.getInstance();
            c.setTime(Input);
            s = Integer.toString(c.get(Calendar.MONTH)+1)+"/"+ c.get(Calendar.DAY_OF_MONTH)+"/"+ c.get(Calendar.YEAR);
            return s;
    }
    
    public Boolean IntValidation (String Input) { // must b a integer
        try {
            Integer.parseInt(Input);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    } 
    
    public void  Activate (JComponent... Objects) { // parametric polymorphic
        for (JComponent J : Objects) {  // polymorhic overloading
            J.setEnabled(true);
            J.setForeground(Color.black);
        }
    }
   
    public void  Activate (JButton... Objects) {
        for (JButton J : Objects) {
            J.setEnabled(true);

        }
    } 
    
   public void  DeActivate (JComponent... Objects) {
        for (JComponent J : Objects) {
            J.setEnabled(false);       
            J.setForeground(Color.black);
        }
    }
   public void  DeActivate (JButton...Objects) {
        for (JButton J : Objects) {
            J.setEnabled(false);
        }
    }
   
   public void Reset (JTextField[] Objects) {
        for (JTextField J : Objects) {
            J.setText("");
        }
    }
   
    public void Distinct (List<String> In) { // duplicate value 
        HashSet hs = new HashSet(); // cannt contain duplicate
        hs.addAll(In);
        In.clear();
        In.addAll(hs);
    }
    
    public List<Date> Ranger (String Start, String End) { // somebody book at same cant book again
        String[] start = Start.split("/"); // any overlapping any dat
        String[] end = End.split("/");
        int TotalStartDays = 0;
        int TotalEndDays = 0;
        int[] LMonths = new int[] {31,29,31,30,31,30,31,31,30,31,30,31};
        int[] Months = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};  
        
        if (Integer.parseInt(start[2]) % 4 == 0) {
            TotalStartDays = Integer.parseInt(start[1]) + (Integer.parseInt(start[0])*LMonths[Integer.parseInt(start[0])-1]);          
        }
        else {
            TotalStartDays = Integer.parseInt(start[1]) + (Integer.parseInt(start[0])*Months[Integer.parseInt(start[0])-1]);                            
        }
        
        if (Integer.parseInt(end[2]) % 4 == 0) {
            TotalEndDays = Integer.parseInt(end[1]) + (Integer.parseInt(end[0])*LMonths[Integer.parseInt(end[0])-1]);          
        }
        else {
            TotalEndDays = Integer.parseInt(end[1]) + (Integer.parseInt(end[0])*Months[Integer.parseInt(end[0])-1]);                            
        }
        
        int Range = TotalEndDays - TotalStartDays;
        Range = (Range > 0 ? Range : -Range) + (Year2Day(Integer.parseInt(end[2]))-Year2Day(Integer.parseInt(start[2])));
        Date _Start = DateConvert(Start);
        Calendar cal = Calendar.getInstance();
        cal.setTime(_Start);
        List<Date> DateRange = new ArrayList();
        for (int i = 1; i <=Range; i++){
            cal.add(Calendar.DATE, 1);  
            DateRange.add(cal.getTime());
        }
        return DateRange;
    }
   public int Year2Day(int Year) {
        int Value = 0;
        for (int i = 1; i <=Year; i++) {
            if (i % 4 == 0) {Value +=366;}
            else {Value +=365;}
        }
        return Value;
    }
}
