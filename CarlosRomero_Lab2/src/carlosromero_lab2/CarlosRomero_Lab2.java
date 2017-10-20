/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosromero_lab2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Will
 */
public class CarlosRomero_Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList lista=new ArrayList();
        String opcion="";
       while(!opcion.equals("d")){
           opcion=JOptionPane.showInputDialog(""+
                   "A-Administración \n"+
                   "B-Matricula \n"+
                   "C-Log in \n"+
                   "D-Salir \n");
       }
    }
    
}
