/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Dennys
 */
public class SaveLoad { 
   
    public static <Object> void guardarEnJson(Object objeto, String rutaArchivo) throws IOException {
        ObjectMapper JSON_MAPPER = new ObjectMapper(); //define un objeto de json mapper quien mappeara el json del objeto que queramos
        JSON_MAPPER.enable(SerializationFeature.INDENT_OUTPUT); //permite habilitar la indentacion del json
        if (!rutaArchivo.endsWith(".json")) { //la extension
            rutaArchivo += ".json";
        }
        JSON_MAPPER.writeValue(new File(rutaArchivo), objeto);//crea un archivo en la ruta que se defina mas el objeto que queramos
        System.out.println("Se ha guardado correctamente");
    }

    //deserealizar
    public static <Object> Object cargarJson(Class<Object> claseObjeto, String rutaArchivo) throws IOException {
        ObjectMapper JSON_MAPPER = new ObjectMapper(); //crea una instancia del objeto
        Object objeto = JSON_MAPPER.readValue(new File(rutaArchivo), claseObjeto); // lo lee y lo guarda en un objeto de esa clase     
        return objeto;
    }
    
//
//     public static <T> void guardarEnXml(T objeto, String rutaArchivo) throws IOException, JAXBException {
//        if (!rutaArchivo.endsWith(".xml")) {
//            rutaArchivo += ".xml";
//        }
//        JAXBContext jaxbContext = JAXBContext.newInstance(objeto.getClass());
//        Marshaller marshaller = jaxbContext.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//        marshaller.marshal(objeto, new File(rutaArchivo));
//    }
//
//    @SuppressWarnings("unchecked")
//    public static <T> T cargarXml(Class<T> claseObjeto, String rutaArchivo) throws IOException, JAXBException {
//        JAXBContext jaxbContext = JAXBContext.newInstance(claseObjeto);
//        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//        return (T) unmarshaller.unmarshal(new File(rutaArchivo));
//    }
}
