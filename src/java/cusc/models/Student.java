/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cusc.models;

import java.util.LinkedHashMap;

/**
 *
 * @author HP
 */
public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String[] operatingSystems;
    private String[] getOperatingSystems(){
        return operatingSystems;
    }
    public void setOperatingSystems(String[] operatingSystems){
        this.operatingSystems = operatingSystems;
    }
    private LinkedHashMap<String,String> countryOptions;
    public Student(){
        countryOptions= new LinkedHashMap<>();
        countryOptions.put("VN", "Viet Nam");
        countryOptions.put("LA", "Laos");
        countryOptions.put("CA", "Cambodia");
        countryOptions.put("CN", "China");
        countryOptions.put("IN", "Indonesia");
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public LinkedHashMap<String, String> getCountryOptions(){
        return countryOptions;
    }
    public void  setCountryOptions(LinkedHashMap<String, String> countryOptions){
        this.countryOptions=countryOptions;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
}
