/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Will
 */
public class Alumnos {
    public String nombre="";
    public int cuenta;
    public String carrera;
    public int edad;
    public int dinero;
    public String usuario;
    public String contra;
    public String clases;
    
    public Alumnos(){
        
    }
    
    public Alumnos(String n, int c, String car, int e, int d, String u, String con, String clas){
        n=nombre;
        c=cuenta;
        e=edad;
        u=usuario;
        con=contra;
        clas=clases;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setCarrera(String carrera){
        this.carrera=carrera;
    }
    public String getCarrera(){
        return carrera;
    }
    public void setCuenta(int cuenta){
        this.cuenta=cuenta;
    }
    public int getCuenta(){
        return cuenta;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setDinero(int dinero){
        this.dinero=dinero;
    }
    public int getDinero(){
        return dinero;
    }
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    public String getUsuario(){
        return usuario;
    }
    public void setContraseña(String contra){
        this.contra=contra;
    }
    public String getContraseña(){
        return contra;
    }
    
    @Override
    public String toString(){
        return "Nombre :"+nombre+" Carrera: "+carrera+" Cuenta: "+cuenta+"  Usuario:"+usuario
                +"  Dinero: "+dinero+"  Edad: "+edad+"  Contraseña: "+contra+
                "  Clases: "+clases;
    }
}
