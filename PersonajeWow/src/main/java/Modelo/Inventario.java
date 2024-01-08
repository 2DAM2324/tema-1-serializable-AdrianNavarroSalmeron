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
public class Inventario implements Serializable {
        private static final long serialVersionUID = 1L;
        private static int lastIdInventario = 0;
        final int capacidadMaxima = 20;
        String idInventario;
        int espaciosOcupados;
        ArrayList<Objeto> objetosInventario;
        String idPersonaje;
   
        public int getCapacidadMaxima(){
            return capacidadMaxima;
        }
        
        public void setIdInventario(String id){
            idInventario = id;
        }
        
        public String getIdInventario(){
            return idInventario;
        }
        
        public void setEspaciosOcupados(int ocupados){
            espaciosOcupados = ocupados;
        }
        
        public int getEspaciosOcupados(){
            return espaciosOcupados;
        }
        
        public void setObjetosInventario(ArrayList<Objeto> vectorObjetos){
            objetosInventario = vectorObjetos;
        }
        
        public ArrayList<Objeto> getObjetosInventario(){
            return objetosInventario;
        }
        
        public void setIdPersonaje(String idPersonajeSet){
            idPersonaje = idPersonajeSet;
        }
        
        public String getIdPersonaje(){
            return idPersonaje;
        }
        
        //Comprueba si queda espacio en el inventario
        public Boolean comprobarSiEspacio(int maxima, int ocupados){
            Boolean hayEspacio = false;
            if(ocupados < maxima){
                hayEspacio = true;
            }
            return hayEspacio;
        }
        
        //Comprueba si ese objeto ya existe en este inventario
       public boolean comprobarSiObjetoEnInventario(Objeto objetoAñadir) {
        for (Objeto objeto : getObjetosInventario()) {
            if (objeto.getIdObjeto().equals(objetoAñadir.getIdObjeto())) {
                return true;  // Si se encuentra un objeto repetido
            }
        }
        return false;  // Si no se encontró ningún objeto repetido, retorna false
    }

        
        //Comprueba si el objeto que se quiere añadir existe en el inventario y si cabe en el inventario
        //en caso afirmativo lo añade
        public void setAñadirObjetoAInventario(Objeto objetoAñadir){
            if(comprobarSiEspacio(capacidadMaxima, espaciosOcupados) && !comprobarSiObjetoEnInventario(objetoAñadir)){
                getObjetosInventario().add(objetoAñadir);
            }
        }
        
        
        //Le pasa la id del objeto y devuelve la posicion en el vector de objetos en el inventario
        public int getPosicionObjetoEnInventario(String idObjeto){
            int posicion = -1;
            for(int i = 0; i < getObjetosInventario().size(); i++){
                if(getObjetosInventario().get(i).getIdObjeto().equals(idObjeto)){
                    posicion = i;
                    i = getObjetosInventario().size();
                }
            }
            return posicion;
        }
        
        //Recibe la id del objeto que quiere borrar y lo elimina del inventario
        public void setBorrarObjetoDeInventario(String idObjetoAborrar){
            if(getPosicionObjetoEnInventario(idObjetoAborrar) != -1){
                getObjetosInventario().remove(getPosicionObjetoEnInventario(idObjetoAborrar));
            }
        }
        
        public Inventario(){
            ArrayList <Objeto> vector = new ArrayList<>();
            setIdInventario(generateNewIdInventario());
            setEspaciosOcupados(0);
            setObjetosInventario(null);
            setIdPersonaje(null);
            setObjetosInventario(vector);
        }
        
        public Inventario(String id, int espacios, ArrayList<Objeto> vector, String idPersonaje){
            setIdInventario(id);
            setEspaciosOcupados(espacios);
            setObjetosInventario(vector);
            setIdPersonaje(idPersonaje);
            setObjetosInventario(vector);
        }
        
        
        public String generateNewIdInventario() {
        lastIdInventario++; // Incrementa el valor del último idPersonaje
        String idGenerada = "INV" + lastIdInventario;  
        return idGenerada;
    }
        
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Id Inventario: ").append(getIdInventario()).append("\n");
            sb.append("Capacidad Maxima: ").append(getCapacidadMaxima()).append("\n");
            sb.append("Espacios Ocupados: ").append(getEspaciosOcupados()).append("\n");

            for (int i = 0; i < getObjetosInventario().size(); i++) {
                sb.append(getObjetosInventario().get(i)).append("\n");
            }
            return sb.toString();
        }
}
