/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import controlador.Listas.ListaEnlazada;
import java.io.File;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Dennys
 */
public class SaveLoad { 
   
    public static <T> void guardarEnJson(T objeto, String rutaArchivo) throws IOException {
        ObjectMapper JSON_MAPPER = new ObjectMapper(); //define un objeto de json mapper quien mappeara el json del objeto que queramos
        JSON_MAPPER.enable(SerializationFeature.INDENT_OUTPUT); //permite habilitar la indentacion del json
        if (!rutaArchivo.endsWith(".json")) { //la extension
            rutaArchivo += ".json";
        }
        JSON_MAPPER.writeValue(new File(rutaArchivo), objeto);//crea un archivo en la ruta que se defina mas el objeto que queramos
        System.out.println("Se ha guardado correctamente");
    }

    //deserealizar
    public static <T> T cargarJson(Class<T> claseObjeto, String rutaArchivo) throws IOException {
        ObjectMapper JSON_MAPPER = new ObjectMapper(); //crea una instancia del objeto
        T objeto = JSON_MAPPER.readValue(new File(rutaArchivo), claseObjeto); // lo lee y lo guarda en un objeto de esa clase     
        return objeto;
    }
    
   public static <T> ListaEnlazada<T> cargarJsonListaEnlazada(String rutaArchivo, Class<T> claseElemento) throws IOException {
       ObjectMapper JSON_MAPPER = new ObjectMapper(); 
       JsonNode jsonNode = JSON_MAPPER.readTree(new File(rutaArchivo));
        ListaEnlazada<T> lista = new ListaEnlazada<>();
        JsonNode nodoActual = jsonNode.get("cabecera");
        while (nodoActual != null) {
            T dato = JSON_MAPPER.treeToValue(nodoActual.get("dato"), claseElemento);
            lista.insertar(dato);
            nodoActual = nodoActual.get("siguiente");
        }
        return lista;
    }
   
}
