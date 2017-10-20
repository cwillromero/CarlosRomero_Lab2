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
public class Clases {
    public String nombre;
    public String seccion;
    public int max;
    public String maestro;
    public int v;
    public ArrayList<String> alumnos=new ArrayList();
    
    public Clases(String nombre, String seccion, int max, String maestro, int v, ArrayList<String> alumnos){
        this.nombre=nombre;
        this.seccion=seccion;
        this.max=max;
        this.maestro=maestro;
        this.v=v;
        this.alumnos=alumnos;       
    }//Constructor
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }//Mutadores
    
    public void setSeccion(String seccion){
        this.seccion=seccion;
    }
    public String getSeccion(){
        return seccion;
    }//Mutadores
    
    public void setCantidadMaxima(int max){
        this.max=max;
    }
    public int getCantidadMaxima(){
        return max;
    }
    
    public void setMaestro(String maestro){
        this.maestro=maestro;
    }
    public String getMestría(){
        return maestro;
    }
    
    public void setUnidadesValorativas(int v){
        this.v=v;
    }
    public int getCantidadDeClases(){
        return v;
    }
    
    public void  setAlumnos(ArrayList<String> alumnos){
        this.alumnos=alumnos;
    }
    public ArrayList<String> getAlumnos(){
        return alumnos;
    }
    
    @Override
    public String toString(){
        return "Nombre :"+nombre+"  Seccion:"+seccion+"  Cantidad Maxima de Alumnos:"+max
                +"  Mestro: "+maestro+"  Unidades Valorativas:"+v+
                "  Alumnos Matriculados:"+alumnos.size();
    }//Metodo para dar formato a la salidad
}
