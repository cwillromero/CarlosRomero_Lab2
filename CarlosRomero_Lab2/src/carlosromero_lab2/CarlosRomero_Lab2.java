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
    static String seccion="";
    static ArrayList Maetros=new ArrayList();
    static Maestros maestro=new Maestros(); 
    static Clases c=new Clases();
    static ArrayList s=new ArrayList();
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
           if (opcion.equals("c") || opcion.equals("C")) {
               logIn();
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
                   "D-Salir \n");
           
           if(op.equals("a") || op.equals("A")){
               if(seccion==""){
                JOptionPane.showMessageDialog(null,"Primero debe crear clases.");
                break;
               }else{
                  String Nombre=JOptionPane.showInputDialog("Ingrese El Nombre:");
                int Salario;
                String titulo=JOptionPane.showInputDialog("Ingrese El Titulo:");
                String usuario=JOptionPane.showInputDialog("Ingrese El Usuario:");
                String maestria=JOptionPane.showInputDialog("Ingrese la Maestria:");
                String contrasena=JOptionPane.showInputDialog("Ingrese la contraseña:");
                int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese La cantidad maxima de clases:"));
                String secc=JOptionPane.showInputDialog("Ingrese la seccion:\n"+seccion+""); 
                Maetros.add(new Maestros(Nombre,titulo,usuario,maestria,contrasena,cantidad,secc));  
               }
                
           }
           if(op.equals("b") || op.equals("B")){
                String m=maestro.nombre;
                int alumnos=c.getCantidadDeClases();
                String nombre=JOptionPane.showInputDialog("Ingrese El Nombre:");
                String seccion=JOptionPane.showInputDialog("Ingrese El Nombre De Seccion:");
                int max=Integer.parseInt(JOptionPane.showInputDialog("Ingrese La cantidad maxima de Alumnos:"));
                int v=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Las Unidades Valorativas:")); 
                clases.add(new Clases(nombre,seccion,max,m,v));                
                System.out.print(seccion);
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
       seccion+=""+((Clases) clases.get(clases.size()-1)).getSeccion()+"\n";
        }    
    }
    
    public static void logIn(){
        String op="";
        while(!op.equals("c")){
            op=JOptionPane.showInputDialog(""+
                   "A-Maestros \n"+
                   "B-Alumnos \n"+
                   "C-Salir \n");
            if(op.equals("a") || op.equals("A")){
                maestros();           
            }
        }
    }
    
    public static void maestros(){
        String opcion="";
        while(!opcion.equals("d")){
            opcion=JOptionPane.showInputDialog(""+
                            "A-Listar Maestros \n"+
                            "B-Modificar Maetros\n"+
                            "C-Eliminar Maestros\n"+
                            "D-Salir\n"+
                            "");
            if(opcion.equals("b") || opcion.equals("B")){
                String p="";
                while(!p.equals("f")){
                p=JOptionPane.showInputDialog(""+
                            "A-Nombre \n"+
                            "B-Titulo\n"+
                            "C-Maestria\n"+
                            "D-Usuario\n"+
                            "E-Contraseña\n"+
                            "F-Salir\n"+
                            "");
                if(p.equals("a")){
                    int x;
                    String n;
                    x=Integer.parseInt(JOptionPane.showInputDialog("Posicion a Modificar"));
                    n=JOptionPane.showInputDialog("Nuevo nombre");
               ((Maestros) Maetros.get(x)).setNombre(n);
                }
                }
            }
            if(opcion.equals("a") || opcion.equals("A")){
                String s="";
                for (Object t : Maetros) {
                   if (t instanceof Maestros) {
                    s+=""+Maetros.indexOf(t)+""+"-"+t+"\n";    
                   }
               }
               JOptionPane.showMessageDialog(null,s);
            }
        }
    }
}
    

