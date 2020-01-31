/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonBaloto;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class JsonBaloto {

    static public void main(String[] args) {
        DetallesSorteo detalle1 = new DetallesSorteo(23,"[2,45,13]");
        DetallesSorteo detalle2 = new DetallesSorteo(24,"[34,23,5]");
       ArrayList<DetallesSorteo> detalles = new ArrayList<>();
        Baloto baloto = new Baloto();
        detalles.add(detalle1);
        detalles.add(detalle2);
        baloto.setBaloto("");
        baloto.setBalotoId(5);
        baloto.setNumeros_Ganadores ("[2,45,34,23,7,5,13]");
        baloto.setDetalle(detalles);

        // El objeto Gson que se encargará de las conversiones
        Gson gson = new Gson();

        // Convertimos un Objecto que contiene un arreglo de objetos
        System.out.println(gson.toJson(baloto));
        System.out.println();

        // Convertimos un objecto sencillo a JSON
        System.out.println(gson.toJson(detalle1));
        System.out.println(gson.toJson(detalle2));
        System.out.println();

         // Convertir un JSON sencillo a un objeto
        // Nota: convertí las comillas dobles a comillas simples, debido
        // a que las comillas dobles son caracteres reservados en Java
        String jsonSimple = "{'SorteoId':23,'Numeros':'[2,45,13]'}";
        DetallesSorteo detalles3 = gson.fromJson(jsonSimple, DetallesSorteo.class);

        System.out.println("SorteoId: " + detalles3.getSorteoId());
        System.out.println("Numeros: " + detalles3.getNumeros());
        System.out.println();

        String jsonSimple1 = "{'SorteoId':24,'Numeros':'[34,23,5]'}";
        DetallesSorteo detalles4 = gson.fromJson(jsonSimple1, DetallesSorteo.class);

        System.out.println("SorteoId: " + detalles4.getSorteoId());
        System.out.println("Numeros: " + detalles4.getNumeros());
        System.out.println();

        // Convertimos un JSON que incluye un arreglo de objetos a un objeto
        String jsonCompleto = "{'Baloto':'','BalotoId':5,'Numeros_Ganadores':'[2,45,34,23,7,5,13]','detalle':[{'SorteoId':23,'Numeros':'[2,45,13]'},{'SorteoId':24,'Numeros':'[34,23,5]'}]}";
        Baloto baloto1 = gson.fromJson(jsonCompleto, Baloto.class);

        System.out.println("Baloto: " + baloto1.getBaloto());
        System.out.println("BalotoId: " + baloto1.getBalotoId());
        System.out.println("Numeros_Ganadores: " + baloto1.getNumeros_Ganadores());
        System.out.println();

        for (DetallesSorteo detalle : baloto1.getDetalle()) {
            System.out.println("SorteoId: " + detalle.getSorteoId());
            System.out.println("Numeros: " + detalle.getNumeros());
            System.out.println();
        }

        // Conversion de un arreglo suelto a JSON
        String jsonArray = gson.toJson(detalles);
        System.out.println(jsonArray);

        // Convertir un array Json a ArrayList

        // Crea el tipo que represente el arreglo
        Type listType = new TypeToken<ArrayList<DetallesSorteo>>(){}.getType();
        ArrayList<DetallesSorteo> arrayDeJson = gson.fromJson(jsonArray, listType);

        System.out.println("\n");

        for(DetallesSorteo detalle : arrayDeJson) {
            System.out.println(detalle.getSorteoId());
        }

    }
}
