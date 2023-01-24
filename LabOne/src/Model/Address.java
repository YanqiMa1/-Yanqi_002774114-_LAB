/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

/**
 *
 * @author Ma2017
 */
public class Address {
    
    String currentStreet;
    long currentAptNo;
    String currentCityOrState;
    long currentZipCode;
    String perStreet;
    long perAptNo;
    String perCityOrState;
    long perZipCode;
    
    public Address(){
        this.currentStreet = "";
        this.currentAptNo = 0;
        this.currentCityOrState = "";
        this.currentZipCode = 0;
        this.perStreet = "";
        this.perAptNo = 0;
        this.perCityOrState = "";
        this.perZipCode = 0;
    }
    
    public String getCurrentStreet() {
        return currentStreet;
    }

    public void setCurrentStreet(String currentStreet) {
        this.currentStreet = currentStreet;
    }

    public long getCurrentAptNo() {
        return currentAptNo;
    }

    public void setCurrentAptNo(long currentAptNo) {
        this.currentAptNo = currentAptNo;
    }

    public String getCurrentCityOrState() {
        return currentCityOrState;
    }

    public void setCurrentCityOrState(String currentCityOrState) {
        this.currentCityOrState = currentCityOrState;
    }

    public long getCurrentZipCode() {
        return currentZipCode;
    }

    public void setCurrentZipCode(long currentZipCode) {
        this.currentZipCode = currentZipCode;
    }

    public String getPerStreet() {
        return perStreet;
    }

    public void setPerStreet(String perStreet) {
        this.perStreet = perStreet;
    }

    public long getPerAptNo() {
        return perAptNo;
    }

    public void setPerAptNo(long perAptNo) {
        this.perAptNo = perAptNo;
    }

    public String getPerCityOrState() {
        return perCityOrState;
    }

    public void setPerCityOrState(String perCityOrState) {
        this.perCityOrState = perCityOrState;
    }

    public long getPerZipCode() {
        return perZipCode;
    }

    public void setPerZipCode(long perZipCode) {
        this.perZipCode = perZipCode;
    }
    
   
        
    

   
  
    
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
