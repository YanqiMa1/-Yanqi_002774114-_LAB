/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import AppSystem.Library;
import AppSystem.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author Ma2017
 */
public abstract class Role {
    static String[] roles = {"System admin", "Customer", "Librarian" };

    public static String[] getRoles() {
        return roles;
    }
    
    
    public abstract JFrame getWorkArea(Library li, UserAccount useraccount);
}
