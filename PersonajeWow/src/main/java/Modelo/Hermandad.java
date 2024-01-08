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
public class Hermandad implements Serializable {
    private static int lastIdHermandad = 0;
    String nombreHermandad;
    String servidorHermandad;
    int numeroMiembros;
    ArrayList<Personaje> listaMiembros;
    String idHermandad;
    
    public void setNombreHermandad(String nombre){
        nombreHermandad = nombre;
    }
    
    public String getNombreHermandad(){
        return nombreHermandad;
    }
    
    public void setServidorHermandad(String nombreHermandadSet){
        servidorHermandad = nombreHermandadSet;
    }
    
    public String getServidorHermandad(){
        return servidorHermandad;
    }
    
    public void setNumeroMiembros(int numero){
        numeroMiembros = numero;
    }
    
    public int getNumeroMiembros(){
        return numeroMiembros;
    }
    
    public void setListaMiembros(ArrayList<Personaje> vector){
        listaMiembros = vector;
    }
    
    public ArrayList<Personaje> getListaMiembros(){
        return listaMiembros;
    }
    
    public void setIdHermandad(String idHermandadSet){
        idHermandad = idHermandadSet;
    }
    
    public String getIdHermandad(){
        return idHermandad;
    }
    
    public Hermandad(){
        ArrayList <Personaje> listaDeMiembros = new ArrayList<>();
        setNombreHermandad(null);
        setServidorHermandad(null);
        setNumeroMiembros(0);
        setListaMiembros(listaDeMiembros);
        setIdHermandad(generateNewIdHermandad());
       
    }
    
    public Hermandad(String nombre, String servidor, int numero, ArrayList<Personaje> vector){
        setNombreHermandad(nombre);
        setServidorHermandad(servidor);
        setNumeroMiembros(numero);
        setListaMiembros(vector);
        setIdHermandad(generateNewIdHermandad());
    }
    
    public String generateNewIdHermandad() {
        lastIdHermandad++; // Incrementa el valor del último idPersonaje
        String idGenerada = "GUILD" + lastIdHermandad;
        return idGenerada;
    }
    
    public String toString(){
        
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre de Hermandad: ").append((getNombreHermandad())).append("\n");
        sb.append("Servidor Hermandad: ").append(getServidorHermandad()).append("\n");
        sb.append("Numero de miembros: ").append(getNumeroMiembros()).append("\n");

        for (int i = 0; i < getListaMiembros().size(); i++) {
            sb.append(getListaMiembros().get(i)).append("\n");
        }
            return sb.toString();
    }
}
