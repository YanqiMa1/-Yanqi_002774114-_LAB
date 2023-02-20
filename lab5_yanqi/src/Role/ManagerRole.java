/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import AppSystem.Library;
import AppSystem.UserAccount;
import UI.AdminWorkArea.AdminJFrame;
import javax.swing.JFrame;

/**
 *
 * @author Ma2017
 */
public class ManagerRole extends Role {
    public ManagerRole() {
    }

    
    @Override
    public JFrame getWorkArea(Library li, UserAccount useraccount) {
        return new AdminJFrame(li, useraccount);
    }
}
