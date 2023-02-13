/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Customer.Customer;
import Restaurant.DeliveryAgent;
import java.util.ArrayList;

/**
 *
 * @author Ma2017
 */
public class MasterOrderDirectory {
    ArrayList<Order> orderlist;


    
    public MasterOrderDirectory(){
        this.orderlist = new ArrayList<Order>();
    }
    
    public Order createOrder(Customer customer, DeliveryAgent del){
        Order o = new Order(customer,del);
        this.orderlist.add(o);
        return o;
    }
    
    public Order requestOrder(Customer customer){
        Order o = new Order();
        o.setCustomer(customer);
        this.orderlist.add(o);
        return o;
        
    }
    
    public Order assignOrder(Order o,DeliveryAgent del){
        o.setAgent(del);
        return o;
    }
    
    public ArrayList<Order> getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(ArrayList<Order> orderlist) {
        this.orderlist = orderlist;
    }
            
    
    
}
