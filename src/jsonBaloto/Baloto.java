/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonBaloto;

import java.util.ArrayList;

public class Baloto {
    private String Baloto;
    private int BalotoId;
    private String Numeros_Ganadores;
    
    private ArrayList<DetallesSorteo> detalle;

    public String getBaloto() {
        return Baloto;
    }

    public void setBaloto(String baloto) {
        Baloto = baloto;
    }

    public int getBalotoId() {
        return BalotoId;
    }

    public void setBalotoId(int balotoId) {
        BalotoId = balotoId;
    }

    public String getNumeros_Ganadores() {
        return Numeros_Ganadores;
    }

    public void setNumeros_Ganadores(String numeros_Ganadores) {
        Numeros_Ganadores = numeros_Ganadores;
    }

    public ArrayList<DetallesSorteo> getDetalle() {
        return detalle;
    }

    public void setDetalle(ArrayList<DetallesSorteo> detalle) {
        this.detalle = detalle;
    }
}
