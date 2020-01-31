/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonBaloto;


public class DetallesSorteo {
    private int SorteoId;
    private String Numeros ;


    public DetallesSorteo(int sorteoId, String numeros) {
        SorteoId = sorteoId;
        Numeros = numeros;
    }

    public int getSorteoId() {
        return SorteoId;
    }

    public void setSorteoId(int sorteoId) {
        SorteoId = sorteoId;
    }

    public String getNumeros() {
        return Numeros;
    }

    public void setNumeros(String numeros) {
        Numeros = numeros;
    }
}

