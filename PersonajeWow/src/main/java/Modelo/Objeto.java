/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author AdrianNS
 */
public class Objeto implements Serializable {
    private static int lastIdObjeto = 0; // Variable de rastreo del último idPersonaje asignado
    String idObjeto;
    String rareza;//Comun, raro, epico, legendario
    String descripcion;
    double precio;//En monedas de oro
    String nombreObjeto;
    
    public void setIdObjeto(String id){
        idObjeto = id;
    }
    
    public String getIdObjeto(){
        return idObjeto;
    }
    
    public void setRareza(String rarezaSet){
        rareza = rarezaSet;
    }
    
    public String getRareza(){
        return rareza;
    }
    
    public void setDescripcion(String descripcionSet){
        descripcion = descripcionSet;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setPrecio(double precioSet){
        precio = precioSet;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setNombreObjeto(String objetoSet){
        nombreObjeto = objetoSet;
    }
    
    public String getNombreObjeto(){
        return nombreObjeto;
    }
    
    public Objeto(){
        setIdObjeto(generateNewIdObjeto());
        setRareza(null);
        setDescripcion(null);
        setPrecio(0.0);
        setNombreObjeto(null);
    }
    
    public Objeto(String id, String rarezaSet, String descripcionSet, Double precioSet, String nombre){
        setIdObjeto(generateNewIdObjeto());
        setRareza(rarezaSet);
        setDescripcion(descripcionSet);
        setPrecio(precioSet);
        setNombreObjeto(nombre);
    }
    
    public String generateNewIdObjeto(){
        lastIdObjeto++;
        String idGenerada = "OB" + lastIdObjeto;
        return idGenerada;
    }
    
    @Override
    public String toString(){
            return "Id Objeto: " + getIdObjeto() + "\nRareza: " + getRareza() + "\nDescripcion: " + getDescripcion() + "\nPrecio: " + getPrecio() + "\nNombre Objeto: " + getNombreObjeto();
    }
}
