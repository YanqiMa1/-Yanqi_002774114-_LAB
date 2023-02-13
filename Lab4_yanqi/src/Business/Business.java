/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Customer.CustomerDirectory;
import Restaurant.DeliveryAgentDirectory;
import Services.MasterOrderDirectory;

/**
 *
 * @author Ma2017
 */
public class Business {
    private UserAccountDirectory useraccountDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryAgentDirectory deliverAgentDirectory;
    private MasterOrderDirectory allOrders;
    
    public Business(){
        this.useraccountDirectory = new UserAccountDirectory();
        this.customerDirectory=new CustomerDirectory();
        this.deliverAgentDirectory=new DeliveryAgentDirectory();
        this.allOrders = new MasterOrderDirectory();
        
        //create a manager
        UserAccount user = this.useraccountDirectory.createUserAccount("admin", "admin", "manager");
    }
    
    public static Business getBusinessInstance(){
        return new Business();
        
    }

    public UserAccountDirectory getUseraccountDirectory() {
        return useraccountDirectory;
    }

    public void setUseraccountDirectory(UserAccountDirectory useraccountDirectory) {
        this.useraccountDirectory = useraccountDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public DeliveryAgentDirectory getDeliverAgentDirectory() {
        return deliverAgentDirectory;
    }

    public void setDeliverAgentDirectory(DeliveryAgentDirectory deliverAgentDirectory) {
        this.deliverAgentDirectory = deliverAgentDirectory;
    }

    public MasterOrderDirectory getAllOrders() {
        return allOrders;
    }

    public void setAllOrders(MasterOrderDirectory allOrders) {
        this.allOrders = allOrders;
    }
    
    
    
    
}
