/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asveni
 */
public class DataEngine {
      
    private String FileName;
    public DataEngine(String FileName) {
        this.FileName = FileName;  
    }
    
    public Boolean Append (String Input) { //try and catch
        try {
        FileWriter fw = new FileWriter(FileName, true);
        fw.append(Input+"\r\n");
        fw.close();
        return true;
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
        public static Boolean Append (String Input, String FileName) {
        try {  //polymor overloading with one more parameter
        FileWriter fw = new FileWriter(FileName, true);
        fw.append(Input+"\r\n");
        fw.close();
        return true;
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean Delete (String Input) { 
        try { // 
            List<String> Lines = new ArrayList(); // goin stored all the linelist
            BufferedReader br = new BufferedReader(new FileReader(FileName));
            String Line = null;
            while ((Line = br.readLine())!=null) {
                if (!Line.contains(Input)) {
                    Lines.add(Line);
                }
            }
            br.close();
            File file = new File (FileName);
            file.delete(); // 
            FileWriter fw = new FileWriter(FileName);
            for (String _Line : Lines) { //call for each loop 
                fw.append(_Line+"\r\n"); // for each line in the list do something 
            }   
            fw.close(); 
            return true; 
        }
        catch (Exception e) {return false;}
    
    } 
    
    public Boolean Update (String Input, String Criteria) {
        try { // new value
            if (Delete(Criteria) == true) { // simply delete old value and append new value
                Append (Input);             // criteria is primary key
            }
            else {
                System.out.println("Error on File Delete");
            }
            return true;
        }
        catch (Exception e) {return false;}
    
    }
    
    public List<String[]> ReadFile () { //stored in list as an array
        try{
            List<String[]> Lines = new ArrayList();
            BufferedReader br = new BufferedReader(new FileReader(FileName));
            String Line = null;
            while ((Line = br.readLine())!=null) {
                String[] Temp = Line.split("\t"); 
                Lines.add(Temp);
            }
            br.close();
            return Lines;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return new ArrayList();
        }
    }
    
        public List<String[]> ReadFile (String Criteria) { //search the files polymor overloading
        try{
            List<String[]> Lines = new ArrayList();
            BufferedReader br = new BufferedReader(new FileReader(FileName));
            String Line = null;
            while ((Line = br.readLine())!=null) {
                if (Line.contains(Criteria)){ //storing lines 
                String[] Temp = Line.split("\t");
                Lines.add(Temp);
                }
            }
            br.close();
            return Lines;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return new ArrayList();
        }
    }
        public Boolean Validate (String Criteria) { // 
            return (ReadFile(Criteria).size() > 0 ? true : false); // if size of file > 0 otherway to write
        }
    
}
