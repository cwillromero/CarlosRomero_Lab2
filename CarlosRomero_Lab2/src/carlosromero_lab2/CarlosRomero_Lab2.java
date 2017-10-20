/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosromero_lab2;

import Clases.Clases;
import Clases.Maestros;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Will
 */
public class CarlosRomero_Lab2 {
    static ArrayList clases=new ArrayList();
    static ArrayList Maetros=new ArrayList();
    static Maestros maestro=new Maestros(); 
    static Clases c=new Clases();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String opcion="";
       while(!opcion.equals("d")){
           opcion=JOptionPane.showInputDialog(""+
                   "A-Administración \n"+
                   "B-Matricula \n"+
                   "C-Log in \n"+
                   "D-Salir \n");
           
           if (opcion.equals("a") || opcion.equals("A")) {
               Administracion();
           }
       }
    }
    
    public static void Administracion(){
        String op="";
        while(!op.equals("d")){
           op=JOptionPane.showInputDialog(""+
                   "A-Añadir Maestros \n"+
                   "B-Crear Clases \n"+
                   "C-Listar clases \n"+
                   "C-Salir \n");
           
           if(op.equals("a") || op.equals("A")){
              
           }
           if(op.equals("b") || op.equals("B")){
                String m=maestro.nombre;
                int alumnos=c.getCantidadDeClases();
                String nombre=JOptionPane.showInputDialog("Ingrese El Nombre:");
                String seccion=JOptionPane.showInputDialog("Ingrese El Nombre De Seccion:");
                int max=Integer.parseInt(JOptionPane.showInputDialog("Ingrese La cantidad maxima de Alumnos:"));
                int v=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Las Unidades Valorativas:")); 
                clases.add(new Clases(nombre,seccion,max,m,v));
           }
           if(op.equals("c") || op.equals("c")){
            String s="";
               for (Object t : clases) {
                   if (t instanceof Clases) {
                    s+=""+clases.indexOf(t)+""+"-"+t+"\n";    
                   }
               }
               JOptionPane.showMessageDialog(null,s);  
           }
       }
        
    }
    
}
