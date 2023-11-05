/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.*;
import Vista.Ventana1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.tools.DocumentationTool;

//***************Imports para escribir y leer xml *******************************

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.Result;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;
import org.w3c.dom.Document;

/******************************************

/**
 *
 * @author AdrianNS
 */
public final class Controller implements Serializable {
    private Inventario inventario;
    private Objeto objeto;
    private Personaje personaje;
    private Hermandad hermandad;
    private Ventana1 ventana;
    public ArrayList <Personaje> ArrayDePersonajesSistema;
    private ArrayList <Hermandad> ArrayDeHermandadesSistema;
    private ArrayList <Objeto> ArrayDeObjetosSistema;
    private ArrayList<Inventario> ArrayDeInventariosSistema;
    private Ventana1 vista;
    
   
    public Controller(Ventana1 vistaSet){
        ArrayList<Personaje> nuevoArray = new ArrayList<>();
        ArrayList<Objeto> arrayObjeto = new ArrayList<>();
        ArrayList<Inventario> arrayInventario = new ArrayList<>();
        ArrayList<Hermandad> arrayHermandad = new ArrayList<>();
        this.vista = vistaSet;
        this.ArrayDePersonajesSistema = nuevoArray;
        this.ArrayDeObjetosSistema = arrayObjeto;
        this.ArrayDeHermandadesSistema = arrayHermandad;
        this.ArrayDeInventariosSistema = arrayInventario;
        
        deserializadorObjetos();
        deserializarInventariosSistema();   
        deserializarPersonaje();
        deserializarHermandades();
        cargarObjetoEnTabla(ArrayDeObjetosSistema);
        cargarInventariosSistmemaEnTabla(ArrayDeInventariosSistema);
        cargarPersonajesEnTabla(ArrayDePersonajesSistema);
        cargarHermandadesEnTabla(ArrayDeHermandadesSistema);
        
        if (ArrayDePersonajesSistema != null && !ArrayDePersonajesSistema.isEmpty()) {
            System.out.println("El array esta lleno");
        } else {
            System.out.println("El array esta vacio");
        }
    }
    
    public void setArrayDePersonajesDeSistema(ArrayList<Personaje> array){
        ArrayDePersonajesSistema = array;
    }
    
    public ArrayList<Personaje> getArrayDePersonajesDeSistema(){
        return ArrayDePersonajesSistema;
    }
    
    public void setArrayDeHermandadesSistema( ArrayList<Hermandad> array){
        ArrayDeHermandadesSistema = array;
    }
    
    public ArrayList<Hermandad> getArrayDeHermandadesSistema(){
        return ArrayDeHermandadesSistema;
    }
    
    public void setArrayDeObjetosSistema(ArrayList<Objeto> array){
        ArrayDeObjetosSistema = array;
    }
    
    public ArrayList<Objeto> getArrayDeObjetosSistema(){
        return ArrayDeObjetosSistema;
    }
    
    public void setArrayDeInventariosSistema(ArrayList<Inventario> array){
        ArrayDeInventariosSistema = array;
    }
    
    public ArrayList<Inventario> getArrayDeInventariosSistema(){
        return ArrayDeInventariosSistema;
    }
    //Funciones de los objetos******************************************************************************************
    public void añadirObjeto(String nombreObjeto, String rareza, String precio, String descipcion, String IdObjeto){
        Objeto objeto = new Objeto();
        try{
            if(nombreObjeto != null && rareza != null && precio != null && descipcion != null){
                    objeto.setNombreObjeto(nombreObjeto);
                    objeto.setRareza(rareza);
                    objeto.setDescripcion(descipcion);
                    objeto.setPrecio(Integer.parseInt(precio));
                    ArrayDeObjetosSistema.add(objeto);
                    serializarObjetosSistema(ArrayDeObjetosSistema);
                    cargarObjetoEnTabla(ArrayDeObjetosSistema);
                    JOptionPane.showMessageDialog(vista, "Objeto añadido con exito", "OK", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(vista, "No puede haber campos vacios!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
         catch(NumberFormatException formatoIncorrecto){
            System.out.println(formatoIncorrecto.getMessage());
        }
    }
    
    //TODO los datos no se leen del xml despues de actualizarlos al borrar algo.
    public void borrarObjeto(String idObjetoaBorrar){
        Objeto objetoaBorrar = new Objeto();
         for(Objeto objeto : ArrayDeObjetosSistema){
             if(objeto.getIdObjeto().equals(idObjetoaBorrar)){
                 objetoaBorrar = objeto;
             }
         }
        for (Inventario inventario : getArrayDeInventariosSistema()) {
            if (inventario.getObjetosInventario().contains(objetoaBorrar)) {
                inventario.getObjetosInventario().remove(objetoaBorrar);
                inventario.setEspaciosOcupados(inventario.getObjetosInventario().size());
            }
        }
        ArrayDeObjetosSistema.remove(objetoaBorrar);
        serializarObjetosSistema(ArrayDeObjetosSistema);
        serializarInventariosSistema(ArrayDeInventariosSistema);
        serializarPersonajesSistema();
        cargarObjetoEnTabla(ArrayDeObjetosSistema);
        cargarInventariosSistmemaEnTabla(ArrayDeInventariosSistema);
    }

    public void borrarObjetoInventario(String idObjeto, String idInventario){
        int posicionObjeto = getPosicionObjetoById(idObjeto);
        int posicionInventario = buscarInventarioPorId(idInventario);
        if(posicionObjeto != -1 && posicionInventario != -1){
            if(getArrayDeInventariosSistema().get(posicionInventario).comprobarSiObjetoEnInventario(getObjetoById(idObjeto))){
                getArrayDeInventariosSistema().get(posicionInventario).getObjetosInventario().remove(getObjetoById(idObjeto));
                getArrayDeInventariosSistema().get(posicionInventario).setEspaciosOcupados(getArrayDeInventariosSistema().get(posicionInventario).getObjetosInventario().size());
                serializarInventariosSistema(ArrayDeInventariosSistema);
                serializarPersonajesSistema();
                cargarInventariosSistmemaEnTabla(ArrayDeInventariosSistema);
                cargarPersonajesEnTabla(ArrayDePersonajesSistema);
                cargarInventarioPersonajeEnTabla(idInventario);
                JOptionPane.showMessageDialog(vista, "Objeto borrado correctamente", "OK", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(vista, "El objeto no existe en el inventario", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            System.out.println("No se ha encontrado el objeto o el inventario");
        }
    }
    
    public Objeto getObjetoById(String id){
        for(Objeto objeto : ArrayDeObjetosSistema){
            if(objeto.getIdObjeto().equals(id)){
                return objeto;
            }
        }
        return null;
    }
    
     public int getPosicionObjetoById(String id){
         int posicion = -1;
        for(Objeto objeto : ArrayDeObjetosSistema){
            if(objeto.getIdObjeto().equals(id)){
                posicion = ArrayDeObjetosSistema.indexOf(objeto);
                
            }
        }
        return posicion;
     }
    
    public void modificarObjeto(String id, String nombre, String rareza, String precio, String descripcion){
        if(getPosicionObjetoById(id) !=-1){
            if(getArrayDeObjetosSistema().get(getPosicionObjetoById(id)) != null){
                getArrayDeObjetosSistema().get(getPosicionObjetoById(id)).setNombreObjeto(nombre);
                getArrayDeObjetosSistema().get(getPosicionObjetoById(id)).setRareza(rareza);
                getArrayDeObjetosSistema().get(getPosicionObjetoById(id)).setPrecio(Double.parseDouble(precio));
                getArrayDeObjetosSistema().get(getPosicionObjetoById(id)).setDescripcion(descripcion);
                serializarObjetosSistema(ArrayDeObjetosSistema);
                cargarObjetoEnTabla(ArrayDeObjetosSistema);
                JOptionPane.showMessageDialog(vista, "Objeto modificado correctamente", "OK", JOptionPane.INFORMATION_MESSAGE);

            }
        }
    }
    
    public void cargarObjetoEnTabla(ArrayList<Objeto> ArrayDeObjetos) {
        DefaultTableModel model = (DefaultTableModel) vista.jTable_objeto_objeto.getModel();

        // Limpia la tabla 
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        // Llena el modelo con los datos de tu ArrayList
        for (Objeto objeto : ArrayDeObjetos) {
            Object[] rowData = {objeto.getIdObjeto(), objeto.getNombreObjeto(), objeto.getRareza(), objeto.getPrecio()};
            model.addRow(rowData);
        }

        // Asigna el modelo a la JTable
        vista.jTable_objeto_objeto.setModel(model);
    }
    //******************************************************************************************************************************************
    
    public void cargarInventariosSistmemaEnTabla(ArrayList<Inventario> arrayDeInventarios){
        DefaultTableModel model = (DefaultTableModel) vista.jTable_inventario_objetos.getModel();
        
        while(model.getRowCount()  > 0){
            model.removeRow(0);
        }
        
        for(Inventario inventario : arrayDeInventarios){
            Object[] rowData = {inventario.getIdInventario(), inventario.getIdPersonaje(), inventario.getEspaciosOcupados()};
            model.addRow(rowData);
        }
         vista.jTable_inventario_objetos.setModel(model);
    }
    
    public void setVista(Ventana1 vistaSet){
        vista = vistaSet;
    }
    
    public Ventana1 getVista(){
        return vista;
    }

    public void cargarInventarioPersonajeEnTabla(String idPersonaje){
        DefaultTableModel model = (DefaultTableModel) vista.jTable_inventario_personaje.getModel();
        while(model.getRowCount()  > 0){
            model.removeRow(0);
        }
        
        for(Inventario inventario : getArrayDeInventariosSistema()){
            if(inventario.getIdPersonaje().equals(idPersonaje)){
                for(Objeto objeto : inventario.getObjetosInventario()){
                    Object[] rowData = {objeto.getIdObjeto(), objeto.getNombreObjeto(), objeto.getRareza(), objeto.getPrecio()};
                    model.addRow(rowData);
                }
            }
        }
         vista.jTable_inventario_personaje.setModel(model);
    }
    
    //Agrega un personaje a una hermandad si hay espacio
    public void agregarUnPersonajeaHermandad(Personaje personaje, Hermandad hermandad){
            if(hermandad.getListaMiembros().size() <= 100){
                hermandad.getListaMiembros().add(personaje);
                hermandad.setNumeroMiembros(hermandad.getNumeroMiembros()+1);
            }
            else{
                System.out.println("La hermandad esta llena!");
            }
        }
    
    
    //*************************************FUNCIONES INVENTARIO****************************************************
    
    public void añadirInventario( String nombrePersonaje, String servidorPersonaje ){
            int posicionPersonaje = buscarPersonajeEnSistema(nombrePersonaje, servidorPersonaje);
            
            if(posicionPersonaje != -1){
                Inventario inventario = new Inventario();
                ArrayList<Objeto> vectorObjetos = new ArrayList<>();
                inventario.setEspaciosOcupados(0);
                inventario.setObjetosInventario(vectorObjetos);
                inventario.setIdPersonaje(getArrayDePersonajesDeSistema().get(posicionPersonaje).getIdPersonaje());
                getArrayDeInventariosSistema().add(inventario);
                serializarInventariosSistema(ArrayDeInventariosSistema);
                serializarPersonajesSistema();
                cargarInventariosSistmemaEnTabla(ArrayDeInventariosSistema);
               
            }
            else{
                System.out.println("Personaje no encontrado");
            } 
    }
    
   
    //Se realizan comprobaciones para ver si el objeto existe, si el inventario existe y si el objeto existe dentro del inventario
    public void añadirObjetoaInventario(String idObjeto, String idInventario){
        int posicionObjeto =  getPosicionObjetoById(idObjeto);
        int posicionInventario = buscarInventarioPorId(idInventario);
        if(posicionObjeto != -1 && posicionInventario != -1){
            if(!getArrayDeInventariosSistema().get(posicionInventario).comprobarSiObjetoEnInventario(getObjetoById(idObjeto))){
                getArrayDeInventariosSistema().get(posicionInventario).getObjetosInventario().add(getArrayDeObjetosSistema().get(posicionObjeto));
                getArrayDeInventariosSistema().get(posicionInventario).setEspaciosOcupados(getArrayDeInventariosSistema().get(posicionInventario).getObjetosInventario().size());
                serializarInventariosSistema(ArrayDeInventariosSistema);
                serializarPersonajesSistema();
                cargarInventariosSistmemaEnTabla(ArrayDeInventariosSistema);
                cargarPersonajesEnTabla(ArrayDePersonajesSistema);
                //Mensaje informativo de que se ha añadido correctamente
                JOptionPane.showMessageDialog(vista, "Objeto añadido correctamente", "OK", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                //Mensaje de error de que el objeto ya existe en el inventario
                JOptionPane.showMessageDialog(vista, "El objeto ya existe en el inventario", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            System.out.println("No se ha encontrado el objeto o el inventario");
        }
    }
    
    public void vaciarInventario(String idInventario){
        
        for(Inventario inventario : getArrayDeInventariosSistema()){
            if(inventario.getIdInventario().equals(idInventario)){
                inventario.getObjetosInventario().removeAll(inventario.getObjetosInventario());
                inventario.setEspaciosOcupados(0);
                serializarInventariosSistema(ArrayDeInventariosSistema);
                serializarPersonajesSistema();
                cargarInventariosSistmemaEnTabla(ArrayDeInventariosSistema);
            }
        }
        
    }
    
    //Busca el inventario por el id en el vector de inventarios del sistema.
    public int buscarInventarioPorId(String idInventario){
        int posicion = -1;
        for(Inventario inventario : getArrayDeInventariosSistema()){
            if(inventario.getIdInventario().equals(idInventario)){
                posicion = getArrayDeInventariosSistema().indexOf(inventario);
            }
        }
        return posicion;
    }
   
    //****************************Funciones del PERSONAJE*****************************************************************
    //Esto se ejecuta en el boton de guardar.
    public void añadirPersonaje(String nombre, String servidor, String Raza, String nivel, String faccion  ){
        try{
            Inventario inventarioNuevo = new Inventario();
            int nivelParseado = Integer.parseInt(nivel);
            Personaje personajeAñadir = new Personaje();
            personajeAñadir.setNombre(nombre);
            personajeAñadir.setServidor(servidor);
            personajeAñadir.setRaza(Raza);
            personajeAñadir.setNivel(nivelParseado);
            personajeAñadir.setFaccion(faccion);
            personajeAñadir.setAñadirInventarioaPersonaje(inventarioNuevo);
            
            ArrayDeInventariosSistema.add(inventarioNuevo);
            ArrayDePersonajesSistema.add(personajeAñadir);
            
            cargarInventariosSistmemaEnTabla(ArrayDeInventariosSistema);
            cargarPersonajesEnTabla(ArrayDePersonajesSistema);
            serializarInventariosSistema(ArrayDeInventariosSistema);
            serializarPersonajesSistema();
            JOptionPane.showMessageDialog(vista, "Personaje añadido correctamente", "OK", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Personajes sistema: ");
            for(Personaje per : ArrayDePersonajesSistema){
                System.out.println(per);
            }
        }
        catch(NumberFormatException formatoIncorrecto){
            System.out.println(formatoIncorrecto.getMessage());
        }
    }
    
    //Funcion para comprobar si el nivel esta entre 1 y 60
    public boolean comprobarSiNivelCorrecto(int nivel) {
        boolean correcto = false;
        if (nivel < 1 || nivel > 60) {
            JOptionPane.showMessageDialog(vista, "El nivel debe estar entre 1 y 60", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            correcto = true;
        }
        return correcto;
    }
    
    public int buscarPersonajeEnSistema(String nombre, String servidor){
        for (int i = 0; i < this.getArrayDePersonajesDeSistema().size(); i++) {
            if (nombre.equals(this.getArrayDePersonajesDeSistema().get(i).getNombre()) && servidor.equals(this.getArrayDePersonajesDeSistema().get(i).getServidor())) {
                return i; // Si se encuentra el personaje, devuelve la posición
            }
        }
        return -1; // Si no se encuentra el personaje, devuelve -1
    }
    
    //Devuelve la posicion en la cual se encuentra ese personaje en el array del sistema
    public int buscarPersonajeEnSistemaPorId(String idPersonaje){
        int posicion = -1;
        for (Personaje personaje : getArrayDePersonajesDeSistema()) {
            if (personaje.getIdPersonaje().equals(idPersonaje)) {
                posicion = getArrayDePersonajesDeSistema().indexOf(personaje);
            }
        }
        return posicion;
    }
    
   
    
    
    
    public void modificarPersonaje(String idPersonaje, String nombre, String servidor, String raza, int nivel, String faccion){
  
        int posicionPersonaje = buscarPersonajeEnSistemaPorId(idPersonaje);
      
         if(posicionPersonaje != -1){
            getArrayDePersonajesDeSistema().get(posicionPersonaje).setNombre(nombre);
            getArrayDePersonajesDeSistema().get(posicionPersonaje).setServidor(servidor);
            getArrayDePersonajesDeSistema().get(posicionPersonaje).setRaza(raza);
            getArrayDePersonajesDeSistema().get(posicionPersonaje).setNivel(nivel);
            getArrayDePersonajesDeSistema().get(posicionPersonaje).setFaccion(faccion);
            serializarPersonajesSistema();
            cargarPersonajesEnTabla(ArrayDePersonajesSistema);
         }
    }
    
    public void borrarPersonaje(String nombre, String servidor){
        
        int posicionPersonaje = buscarPersonajeEnSistema(nombre, servidor);
        if(posicionPersonaje != -1){
            //Primero borra todos los objetos que contiene el inventario
            vaciarInventario(getArrayDePersonajesDeSistema().get(posicionPersonaje).getInventario().getIdInventario());
            //Borra el inventario del sistema
            getArrayDeInventariosSistema().remove(getArrayDePersonajesDeSistema().get(posicionPersonaje).getInventario());
             System.out.println("Llega aqui");
            //Busca en el array de hermandades de sistema si el personaje pertenece a alguna hermandad y lo borra de la lista de miembros
            for(Hermandad hermandad : getArrayDeHermandadesSistema()){
               for(int i = 0; i < hermandad.getListaMiembros().size(); i++){
                    if(hermandad.getListaMiembros().get(i).getIdPersonaje().equals(getArrayDePersonajesDeSistema().get(posicionPersonaje).getIdPersonaje())){
                        hermandad.getListaMiembros().remove(getArrayDePersonajesDeSistema().get(posicionPersonaje));
                        hermandad.setNumeroMiembros(hermandad.getListaMiembros().size());
                    }
                }
            }
           
            //Borra el personaje
            getArrayDePersonajesDeSistema().remove(posicionPersonaje);
            serializarInventariosSistema(ArrayDeInventariosSistema);
            serializarPersonajesSistema();
            serializarHermandadesSistema(ArrayDeHermandadesSistema);
            cargarInventariosSistmemaEnTabla(ArrayDeInventariosSistema);
            cargarPersonajesEnTabla(ArrayDePersonajesSistema);
            cargarHermandadesEnTabla(ArrayDeHermandadesSistema);
        }
        else{
            System.out.println("No se ha encontrado el personaje");
        }
    }
    
     public void cargarPersonajesEnTabla(ArrayList<Personaje> ArrayDePersonajes) {
        DefaultTableModel model = (DefaultTableModel) vista.jTable_personaje.getModel();

        // Limpia la tabla
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        // Llena el modelo con los datos de tu ArrayList
        for (Personaje personaje : ArrayDePersonajes) {
            Object[] rowData = {personaje.getNombre(), personaje.getServidor(), personaje.getRaza(), personaje.getNivel()};
            model.addRow(rowData);
        }

        // Asigna el modelo a la JTable
        vista.jTable_personaje.setModel(model);
    }
     
     //***************************************************************************************************************************************************************
        
     //**********************************************************FUNCIONES de Hermandad**************************************************************************
     public void añadirHermandad(String nombre, String servidor){
        if(buscarHermandadPorNombre(nombre, servidor) == -1){
            Hermandad hermandad = new Hermandad();
            hermandad.setNombreHermandad(nombre);
            hermandad.setServidorHermandad(servidor);
            ArrayDeHermandadesSistema.add(hermandad);
            cargarHermandadesEnTabla(ArrayDeHermandadesSistema);
            serializarHermandadesSistema(ArrayDeHermandadesSistema);
        }
        else{
            System.out.println("La hermandad ya existe");
        }
     }

     //Nos devuelve la posicion en la que se encuentra la hermandad en el array de hermandaddes de sistema
     public int buscarHermandadPorNombre(String nombre, String servidor){
         for(Hermandad hermandad : getArrayDeHermandadesSistema()){
             if(hermandad.getNombreHermandad().equals(nombre) && hermandad.getServidorHermandad().equals(servidor)){
                 return ArrayDeHermandadesSistema.indexOf(hermandad);
             }
         }
         return -1;
     }

     //Nos devuelve el objeto 
     public Hermandad buscarHermandadPorId(String id){
        for(Hermandad hermandad : getArrayDeHermandadesSistema()){
            if(hermandad.getIdHermandad().equals(id)){
                return hermandad;
            }
        }
        return null;
     }

     public boolean comprobarSiPersonajeEnHermandad(String idPersonaje, String idHermandad){
        for(Hermandad hermandad : getArrayDeHermandadesSistema()){
            if(hermandad.getIdHermandad().equals(idHermandad)){
                for(Personaje personaje : hermandad.getListaMiembros()){
                    if(personaje.getIdPersonaje().equals(idPersonaje)){
                        return true;
                    }
                }
            }
        }
        return false;
     }

     //Añade un personaje a una hermandad
     public void añadirPersonajeaHermandad(String nombrePersonaje, String servidorPersonaje, String nombreHermandad, String servidorHermandad){
            int posicionPersonaje = buscarPersonajeEnSistema(nombrePersonaje, servidorPersonaje);
            int posicionHermandad = buscarHermandadPorNombre(nombreHermandad, servidorHermandad);
            if(posicionPersonaje != -1 && posicionHermandad != -1){
                //Comprueba si la hermandad esta llena, o si este personaje ya esta en la hermandad
                //hacer sin contains
                if(getArrayDeHermandadesSistema().get(posicionHermandad).getListaMiembros().size() <= 100 && !comprobarSiPersonajeEnHermandad(getArrayDePersonajesDeSistema().get(posicionPersonaje).getIdPersonaje(), getArrayDeHermandadesSistema().get(posicionHermandad).getIdHermandad())){
                    getArrayDeHermandadesSistema().get(posicionHermandad).getListaMiembros().add(getArrayDePersonajesDeSistema().get(posicionPersonaje));
                    getArrayDeHermandadesSistema().get(posicionHermandad).setNumeroMiembros(getArrayDeHermandadesSistema().get(posicionHermandad).getListaMiembros().size());
                    serializarPersonajesSistema();
                    serializarHermandadesSistema(ArrayDeHermandadesSistema);
                    cargarHermandadesEnTabla(ArrayDeHermandadesSistema);
                    cargarPersonajesHermandadEnTabla(getArrayDeHermandadesSistema().get(posicionHermandad).getIdHermandad());
                    JOptionPane.showMessageDialog(vista, "Personaje añadido correctamente", "OK", JOptionPane.INFORMATION_MESSAGE);

                }
                else{
                    JOptionPane.showMessageDialog(vista, "El personaje ya esta en la hermandad", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                
                 System.out.println("No se ha encontrado la hermandad o el personaje");
            }                
        }
     
     //Recibe el nombre y el servidor del personaje y lo borra de la lista de miembros de la hermandad, y de la lista de hermandades del personaje borra esa hermnadad
        public void borrarPersonajeDeHermandad(String nombrePersonaje, String servidorPersonaje, String nombreHermandad, String servidorHermandad){
                int posicionPersonaje = buscarPersonajeEnSistema(nombrePersonaje, servidorPersonaje);
                int posicionHermandad = buscarHermandadPorNombre(nombreHermandad, servidorHermandad);
                if(posicionPersonaje != -1 && posicionHermandad != -1){
                    //Comprueba si el personaje esta en la hermandad
                    if(comprobarSiPersonajeEnHermandad(getArrayDePersonajesDeSistema().get(posicionPersonaje).getIdPersonaje(), getArrayDeHermandadesSistema().get(posicionHermandad).getIdHermandad())){
                        getArrayDeHermandadesSistema().get(posicionHermandad).getListaMiembros().remove(getArrayDePersonajesDeSistema().get(posicionPersonaje));
                        getArrayDeHermandadesSistema().get(posicionHermandad).setNumeroMiembros(getArrayDeHermandadesSistema().get(posicionHermandad).getListaMiembros().size());
                        getArrayDePersonajesDeSistema().get(posicionPersonaje).getListaHermandadades().remove(getArrayDeHermandadesSistema().get(posicionHermandad));
                        serializarPersonajesSistema();
                        serializarHermandadesSistema(ArrayDeHermandadesSistema);
                        cargarHermandadesEnTabla(ArrayDeHermandadesSistema);
                        cargarPersonajesHermandadEnTabla(getArrayDeHermandadesSistema().get(posicionHermandad).getIdHermandad());
                        JOptionPane.showMessageDialog(vista, "Personaje borrado correctamente", "OK", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(vista, "El personaje no esta en la hermandad", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    System.out.println("No se ha encontrado la hermandad o el personaje");
                }
        }

     //Modifica una hermandad
     public void modificarHermandad(String nombreOriginal, String servidorOriginal, String nombreCambiar, String servidorCambiar){
            //Te busca la posicion de la hermandad que quieres modificar
            int posicionHermandad = buscarHermandadPorNombre(nombreOriginal, servidorOriginal);
            int posicionHermandadCambiar = buscarHermandadPorNombre(nombreCambiar, servidorCambiar);
            if(posicionHermandad != -1){
                //Comprueba si ya existe una hermandad con el mismo nombre y el mismo servidor
                if(posicionHermandadCambiar == -1){
                    getArrayDeHermandadesSistema().get(posicionHermandad).setNombreHermandad(nombreCambiar);
                    getArrayDeHermandadesSistema().get(posicionHermandad).setServidorHermandad(servidorCambiar);
                    serializarHermandadesSistema(ArrayDeHermandadesSistema);
                    cargarHermandadesEnTabla(ArrayDeHermandadesSistema);
                }
                else{
                    System.out.println("La hermandad ya existe");
                }
            }
            else{
                System.out.println("No se ha encontrado la hermandad");
            }
     }

    //Busca la hermandad, si esta existe busca en listaHermandades de cada personaje para borrar esta hermandad de sus listas, luego borra la hermandad del sistema
     public void borrarHermandad(String nombreHermandad, String servidorHermandad){
            int posicionHermandad = buscarHermandadPorNombre(nombreHermandad, servidorHermandad);
            if(posicionHermandad != -1){
                for(Personaje personaje : getArrayDePersonajesDeSistema()){
                    for(Hermandad hermandad : personaje.getListaHermandadades()){
                        if(hermandad.getIdHermandad().equals(getArrayDeHermandadesSistema().get(posicionHermandad).getIdHermandad())){
                            personaje.getListaHermandadades().remove(hermandad);
                        }
                    }
                }
                getArrayDeHermandadesSistema().remove(posicionHermandad);
                serializarPersonajesSistema();
                serializarHermandadesSistema(ArrayDeHermandadesSistema);
                cargarHermandadesEnTabla(ArrayDeHermandadesSistema);
            }
            else{
                System.out.println("No se ha encontrado la hermandad");
            }
        }

     public void serializarHermandadesSistema(ArrayList ArrayDeHermandadesSistema){
           ObjectOutputStream serializador = null;
         try {
             serializador = new ObjectOutputStream(new FileOutputStream("hermandadesSistema.dat"));
             serializador.writeObject(ArrayDeHermandadesSistema);
         } catch (IOException ioe) {

         } finally {
             if (serializador != null)
                try {
                 serializador.close();
             } catch (IOException ioe) {
                 ioe.printStackTrace();
             }
         }
    }

    public void deserializarHermandades(){
        ObjectInputStream deserializador = null;
        try {
            deserializador = new ObjectInputStream(new FileInputStream("hermandadesSistema.dat"));
            ArrayDeHermandadesSistema = (ArrayList<Hermandad>) deserializador.readObject();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            if (deserializador != null)
                try {
                    deserializador.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
        }
    }

    public void cargarHermandadesEnTabla(ArrayList ArrayDeHermandadesSistema){
        DefaultTableModel model = (DefaultTableModel) vista.jTable_hermandad.getModel();

        // Limpia la tabla
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        // Llena el modelo con los datos de tu ArrayList
        for (Hermandad hermandad : getArrayDeHermandadesSistema()) {
            Object[] rowData = {hermandad.getNombreHermandad(), hermandad.getServidorHermandad(), hermandad.getNumeroMiembros()};
            model.addRow(rowData);
        }

        // Asigna el modelo a la JTable
        vista.jTable_hermandad.setModel(model);
    }

    public void cargarPersonajesHermandadEnTabla(String idHermandad){
        DefaultTableModel model = (DefaultTableModel) vista.jTable_personajes_hermandad.getModel();
        while(model.getRowCount()  > 0){
            model.removeRow(0);
        }
        
        for(Hermandad hermandad : getArrayDeHermandadesSistema()){
            if(hermandad.getIdHermandad().equals(idHermandad)){
                for(Personaje personaje : hermandad.getListaMiembros()){
                    Object[] rowData = {personaje.getNombre(), personaje.getServidor(), personaje.getRaza(), personaje.getNivel()};
                    model.addRow(rowData);
                }
            }
        }
         vista.jTable_personajes_hermandad.setModel(model);
    }
    
    
    //**********************************************************************************************************************************************************
    public void serializarObjetosSistema(ArrayList<Objeto> arrayListObjetos){
        ObjectOutputStream serializador = null;
        try {
            serializador = new ObjectOutputStream(new FileOutputStream("objetosSistema.dat"));
            serializador.writeObject(arrayListObjetos);
        } catch (IOException ioe) {
       
        } finally {
            if (serializador != null)
                try {
                    serializador.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
        }
    }
    
    public void serializarInventariosSistema(ArrayList <Inventario> arrayListInventarios){
        ObjectOutputStream serializador = null;
        try {
            serializador = new ObjectOutputStream(new FileOutputStream("inventariosSistema.dat"));
            serializador.writeObject(arrayListInventarios);
        } catch (IOException ioe) {

        } finally {
            if (serializador != null)
                try {
                serializador.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
              
      public void serializarPersonajesSistema() {
        ObjectOutputStream serializador = null;
        try {
            serializador = new ObjectOutputStream(new FileOutputStream("personajesSistema.dat"));
            serializador.writeObject(ArrayDePersonajesSistema);
            System.out.println(getArrayDePersonajesDeSistema().size());
        } catch (IOException ioe) {
            ioe.printStackTrace(); // Handle the exception (log or display an error)
        } finally {
            if (serializador != null) {
                try {
                    serializador.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace(); // Handle the exception
                }
            }
        }
    }


   private static void agregarElementoConTexto(Document doc, Element parent, String tagName, String texto) {
       Element element = doc.createElement(tagName);
       parent.appendChild(element);
       Text textNode = doc.createTextNode(texto);
       element.appendChild(textNode);
   }
   
   public void deserializarPersonaje() {
       ObjectInputStream deserializador = null;
       try {
           deserializador = new ObjectInputStream(new FileInputStream("personajesSistema.dat"));
           ArrayDePersonajesSistema = (ArrayList<Personaje>) deserializador.readObject();
       } catch (FileNotFoundException fnfe) {
           fnfe.printStackTrace();
       } catch (ClassNotFoundException cnfe) {
           cnfe.printStackTrace();
       } catch (IOException ioe) {
           ioe.printStackTrace();
       } finally {
           if (deserializador != null)
                try {
               deserializador.close();
           } catch (IOException ioe) {
               ioe.printStackTrace();
           }
       }
    }


   
   //Lee el xml de objetosSistema y los mete en el arrayList
   public void deserializadorObjetos(){
       ObjectInputStream deserializador = null;
       try {
           deserializador = new ObjectInputStream(new FileInputStream("objetosSistema.dat"));
           ArrayDeObjetosSistema = (ArrayList<Objeto>) deserializador.readObject();
       } catch (FileNotFoundException fnfe) {
           fnfe.printStackTrace();
       } catch (ClassNotFoundException cnfe) {
           cnfe.printStackTrace();
       } catch (IOException ioe) {
           ioe.printStackTrace();
       } finally {
           if (deserializador != null)
                try {
               deserializador.close();
           } catch (IOException ioe) {
               ioe.printStackTrace();
           }
       }
   }
   
     public void deserializarInventariosSistema(){
         ObjectInputStream deserializador = null;
         try {
             deserializador = new ObjectInputStream(new FileInputStream("inventariosSistema.dat"));
             ArrayDeInventariosSistema = (ArrayList<Inventario>) deserializador.readObject();
         } catch (FileNotFoundException fnfe) {
             fnfe.printStackTrace();
         } catch (ClassNotFoundException cnfe) {
             cnfe.printStackTrace();
         } catch (IOException ioe) {
             ioe.printStackTrace();
         } finally {
             if (deserializador != null)
                try {
                 deserializador.close();
             } catch (IOException ioe) {
                 ioe.printStackTrace();
             }
         }
    }
}
  
