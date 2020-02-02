/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonBaloto;

import com.google.gson.Gson;
public class JsonBaloto {

    static public void main(String[] args) {
        String jsonCompleto = "{'BalotoId':5,'Numeros_Ganadores':[2,45,34,23,7,5,13],'Ganadores':[{'SorteoId':23,'Numeros':[2,45,13]},{'SorteoId':24,'Numeros':[34,23,5]}]}";

        // El objeto Gson que se encargará de las conversiones
        Gson gson = new Gson();
        Baloto baloto = gson.fromJson(jsonCompleto, Baloto.class);
        System.out.print("BalotoId:");
        System.out.println(baloto.getBalotoId());
        System.out.print("Números_Ganadores:");
        for (int j = 0; j < 7; j = j + 1) {
            System.out.print(baloto.getNumeros_Ganadores()[j]+",");
        }
        System.out.println("");
          for (int i = 0; i < 2; i = i + 1) {
              System.out.print("SorteoId:");
              System.out.println(baloto.getGanadores().get(i).getSorteoId());
              System.out.print("Números:");
              for (int k = 0; k < 3; k = k + 1) {
                  System.out.print(baloto.getGanadores().get(i).getNumeros()[k]+",");
            }
            System.out.println("");
        }
        System.out.println(gson.toJson(baloto));
    }

}
