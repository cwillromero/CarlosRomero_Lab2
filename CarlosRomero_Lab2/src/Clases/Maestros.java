/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Will
 */
public class Maestros {
    public String nombre;
    public String titulo;
    public String usuario;
    public String maestria;
    public String contrasena;
    public int cantidad;
    public ArrayList<String> secciones=new ArrayList();
    
    public Maestros(String nombre, String titulo, String usuario, String maestria, String contrasena, int cantidad, ArrayList<String> secciones){
        this.nombre=nombre;
        this.titulo=titulo;
        this.cantidad=cantidad;
        this.contrasena=contrasena;
        this.secciones=secciones;
        this.usuario=usuario;
        this.maestria=maestria;
    }//Constructor
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }//Mutadores
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    public String getUsuario(){
        return usuario;
    }
    
    public void setMaestria(String maestria){
        this.maestria=maestria;
    }
    public String getMestría(){
        return maestria;
    }
    
    public void setContraseña(String contrasena){
        this.contrasena=contrasena;
    }
    public String getContraseña(){
        return contrasena;
    }
    
    public void setCantidadDeClases(int cantidad){
        this.cantidad=cantidad;
    }
    public int getCantidadDeClases(){
        return cantidad;
    }
    
    public void  setSecciones(ArrayList<String> secciones){
        this.secciones=secciones;
    }
    public ArrayList<String> getSecciones(){
        return secciones;
    }
    
    @Override
    public String toString(){
        return "Nombre :"+nombre+"  Titulo"+titulo+"  Usuario:"+usuario
                +"  Mestría: "+maestria+"  Contraseña:"+contrasena+
                "  Cantidad Maxima de Clases:"+cantidad+"  Secciones:"+secciones.size();
    }//Metodo para dar formato a la salidad
}
