package Views;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import Models.Entity;
import Models.Members.Member;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author jprod
 */
public interface View<Type> {
    public static void maximize(JFrame frm){
        frm.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public static void showInternal(JDesktopPane desk,JInternalFrame frm){
        int desktopWidth = desk.getWidth();
        int desktopHeight = desk.getHeight();
        int internalFrameWidth = frm.getWidth();
        int internalFrameHeight = frm.getHeight();
        int x = (desktopWidth - internalFrameWidth) / 2;
        int y = (desktopHeight - internalFrameHeight) / 2;
        frm.setLocation(x, y);
        desk.add(frm);
        frm.setVisible(true);
    }
    
    public void clear();
    public void display(Type regs);
    public void displayAll(Type[] regs);
    public void displayMessage(String msj);
    public boolean displayConfirmMessage(String msj);
    public void displayErrorMessage(String msj);    
}
