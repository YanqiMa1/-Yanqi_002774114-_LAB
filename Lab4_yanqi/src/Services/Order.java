/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Customer.Customer;
import Restaurant.DeliveryAgent;

/**
 *
 * @author Ma2017
 */
public class Order {
    Customer customer;
    DeliveryAgent agent;
    private static int count = 0 ;
    String orderID;
    String status;
    
    public Order(){
        this.customer = new Customer();
        this.agent = new DeliveryAgent();
        this.status = "Created";
        this.count++;
        this.orderID="ORDER"+this.count;        
          
    }
    public Order(Customer customer,DeliveryAgent agent){
        this.customer = customer;
        this.agent = agent;
        this.status = "Created";
        this.count++;
        this.orderID="ORDER"+this.count; 
    }
    

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public DeliveryAgent getAgent() {
        return agent;
    }

    public void setAgent(DeliveryAgent agent) {
        this.agent = agent;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Order.count = count;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return this.orderID;
    }
   
    
    
    
}
