/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Ma2017
 */
public class MedicineCatalog {
    
    ArrayList<Medicine> medicineList;
    
    public MedicineCatalog(){
        this.medicineList = new ArrayList<Medicine>();
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
    
    public Medicine createMedicine(String name, double dosage){
        Medicine medicine = new Medicine();
        medicine.setMedicineName(name);
        medicine.setDosage(dosage);
        
        this.medicineList.add(medicine);
        
        return medicine;
        
    }
    
    
    public Boolean checkIfMedicineUnique(String name){
        for (Medicine med : this.medicineList ){
            if(med.getMedicineName().equals(name)){
                return false;
            }
        }
        return true;
    }
  
    //delete a medicine from the catalog
    public void removeMedicne(String name){
        //finde the medicine obj in the arraylist with this name
        for (Medicine med : this.medicineList){
            if(med.getMedicineName().equals(name)){
                this.medicineList.remove(med);
                break;
            }
        }
    }
    
}
