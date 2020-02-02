/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonBaloto;

import java.util.ArrayList;


public class Baloto {

    private int BalotoId;
    private int[] Numeros_Ganadores;

    private ArrayList<DetallesSorteo> Ganadores;

    public int getBalotoId() {
        return BalotoId;
    }

    public void setBalotoId(int balotoId) {
        BalotoId = balotoId;
    }

    public int[] getNumeros_Ganadores() {
        return Numeros_Ganadores;
    }

    public void setNumeros_Ganadores(int[] numeros_Ganadores) {
        Numeros_Ganadores = numeros_Ganadores;
    }

    public ArrayList<DetallesSorteo> getGanadores() {
        return Ganadores;
    }

    public void setGanadores(ArrayList<DetallesSorteo> ganadores) {
        Ganadores = ganadores;
    }
}

