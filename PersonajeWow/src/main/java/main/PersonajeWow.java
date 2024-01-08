/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;


import Controlador.Controller;
import Modelo.Personaje;
import Modelo.Hermandad;
import Modelo.Inventario;
import Modelo.Objeto;
import Vista.Ventana1;
import java.io.IOException;
import java.util.ArrayList;
import org.xml.sax.SAXException;


/**
 *
 * @author AdrianNS
 */
public class PersonajeWow {

    public static void main(String[] args) {
        
        try{
           Ventana1 vista = new Ventana1();
            Controller controlador = new Controller(vista);
            vista.setControlador(controlador);  // Establece el controlador en la vista
            vista.setVisible(true);
        }
        catch(IOException a){

        }
        catch(ClassNotFoundException b ){

        }
        catch(SAXException c){

        }
    }
}
