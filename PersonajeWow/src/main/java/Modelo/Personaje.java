/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author AdrianNS
 */
public class Personaje implements Serializable {
    private static int lastIdPersonaje = 0; // Variable de rastreo del último idPersonaje asignado
    String nombre;
    String servidor;
    String faccion; //Alianza u Horda
    String raza; 
    int nivel; //1-80
    Inventario inventarioPersonaje;
    String idPersonaje;
    ArrayList<Hermandad> listaHermandades;
    
    public void setNombre(String nombreSet){
        nombre = nombreSet;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setServidor(String servidorSet){
        servidor = servidorSet;
    }
    
    public String getServidor(){
        return servidor;
    }
    
    public void setFaccion(String faccionSet){
        faccion = faccionSet;
    }
    
    public String getFaccion(){
        return faccion;
    }
    
    public void setRaza(String razaSet){
        raza = razaSet;
    }
    
    public String getRaza(){
        return raza;
    }
    
    public void setNivel(int nivelSet){
        nivel = nivelSet;
    }
    
    public int getNivel(){
        return nivel;
    }
    
    public void setInventario(Inventario inventarioSet){
        inventarioPersonaje = inventarioSet;
    }
    
    public Inventario getInventario(){
        return inventarioPersonaje;
    }
    
    public void setIdPersonaje(String idPersonajeSet){
        idPersonaje = idPersonajeSet;
    }
    
    public String getIdPersonaje(){
        return idPersonaje;
    }

    public void setListaHermandades(ArrayList <Hermandad> vectorHermandad){
        listaHermandades = vectorHermandad;
    }
    
    public ArrayList <Hermandad> getListaHermandadades(){
        return listaHermandades;
    }
    
    public Personaje(){
        Inventario inventario = new Inventario();
        ArrayList <Hermandad> hermandades = new  ArrayList<>();
        setIdPersonaje(generateNewIdPersonaje());
        setNombre(null);
        setServidor(null);
        setFaccion(null);
        setRaza(null);
        setNivel(1);
        setInventario(inventario);
        setListaHermandades(hermandades);
        
    }
    
    public Personaje(String idPersonaje, String nombre, String servidor, String faccion, String raza, int nivel, Inventario inventario, ArrayList<Hermandad> listaHermandad){
        setIdPersonaje(idPersonaje);
        setNombre(nombre);
        setServidor(servidor);
        setFaccion(faccion);
        setRaza(raza);
        setNivel(nivel);
        setInventario(inventario);
        setListaHermandades(listaHermandad);
    }
    
     public String generateNewIdPersonaje() {
        lastIdPersonaje++; // Incrementa el valor del último idPersonaje
        String idGenerada = "PJ" + lastIdPersonaje;  
        return idGenerada;
    }

  
    
    public void setAñadirInventarioaPersonaje(Inventario inventario){
        if(this.getInventario()!= null){
            this.setInventario(inventario);
            inventario.setIdPersonaje(this.getIdPersonaje());
            System.out.println("Se ha generado el inventario");
        }
        else{
            System.out.println("Este personaje ya tiene un inventario!");
        }
    }
    
    
    
    @Override
    public String toString(){
        return "Nombre: " + getNombre() + "\nServidor: " + getServidor() + "\nFaccion: " + getFaccion() + "\nRaza: " + getRaza() + "\nNivel: " + getNivel()+ "\nId Inventario: " + getInventario().getIdInventario();
    }
}
