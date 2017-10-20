/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosromero_lab2;

import Clases.Alumnos;
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
    static ArrayList alumnos=new ArrayList();
    static int din=1250;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String opcion="";
       while(!opcion.equals("d")){
           opcion=JOptionPane.showInputDialog("BIENVENIDO\n"+
                   "A-Administración \n"+
                   "B-Matricula \n"+
                   "C-Log in \n"+
                   "D-Salir \n");
           
           if (opcion.equals("a") || opcion.equals("A")) {
               Administracion();
           }
           if (opcion.equals("b") || opcion.equals("B")) {
               matricula();
           }
           if (opcion.equals("c") || opcion.equals("C")) {
               logIn();
           }
       }
    }
    
    public static void Administracion(){
        String op="";
        while(!op.equals("d")){
           op=JOptionPane.showInputDialog("ADMINISTRACION\n"+
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
                while(!seccion.contains(secc)){
                   JOptionPane.showMessageDialog(null,"Seccion no existe."); 
                   secc=JOptionPane.showInputDialog("Ingrese la seccion:\n"+seccion+""); 
                }
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
            op=JOptionPane.showInputDialog("LOGIN\n"+
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
            opcion=JOptionPane.showInputDialog("MAESTROS\n"+
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
                    n=JOptionPane.showInputDialog("Nuevo Nombre");
               ((Maestros) Maetros.get(x)).setNombre(n);
                }
                if(p.equals("b")){
                    int x;
                    String m;
                    x=Integer.parseInt(JOptionPane.showInputDialog("Posicion a Modificar"));
                    m=JOptionPane.showInputDialog("Nuevo Titulo");
               ((Maestros) Maetros.get(x)).setTitulo(m);
                }
                if(p.equals("c")){
                    int z;
                    String l;
                    z=Integer.parseInt(JOptionPane.showInputDialog("Posicion a Modificar"));
                    l=JOptionPane.showInputDialog("Nueva Maestria");
               ((Maestros) Maetros.get(z)).setNombre(l);
                }
                if(p.equals("d")){
                    int x;
                    String n;
                    x=Integer.parseInt(JOptionPane.showInputDialog("Posicion a Modificar"));
                    n=JOptionPane.showInputDialog("Nuevo Usuario");
               ((Maestros) Maetros.get(x)).setNombre(n);
                }
                if(p.equals("e")){
                    int x;
                    String n;
                    x=Integer.parseInt(JOptionPane.showInputDialog("Posicion a Modificar"));
                    n=JOptionPane.showInputDialog("Nuevo Contraseña");
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
            if(opcion.equals("c") || opcion.equals("C")){
                int k;
                k=Integer.parseInt(JOptionPane.showInputDialog("Posicion para Eliminar"));
                Maetros.remove(k);
            }
        }
    }
    
    public static void matricula(){
        String nombre=JOptionPane.showInputDialog("Ingrese El Nombre:");
        int cuenta=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de cuenta:"));
        String carrera=JOptionPane.showInputDialog("Ingrese Carrera:");
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese La edad:"));
        int dinero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dinero"));
        String usuario=JOptionPane.showInputDialog("Ingrese El usuario:");
        String contra=JOptionPane.showInputDialog("Ingrese El contraseña:");
        String clases=JOptionPane.showInputDialog("Ingrese las clases separadas por comas");
        String[] split=clases.split(",");
        int total=din*split.length;
        if((dinero-total)<0){
            JOptionPane.showMessageDialog(null,"Dinero insuficiente! No puede matricularse");
        }
        alumnos.add(new Alumnos(nombre,cuenta,carrera,edad,dinero,usuario,contra,clases));  
        din=din+((din/100)*20);
        }
        
    }



    

