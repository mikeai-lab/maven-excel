package org.example;

import modelos.ExcelVideojuego;
import reader.ExcelReader;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Tarea1 {
    public static void main(String[] args) {
        final var listaTotal = ExcelReader.obtenerListaVideoJuego();
        final var listaXbox = filtrarXbox(listaTotal);

        System.out.printf("la lista es: %s%n", listaXbox);
    }
    private static List<ExcelVideojuego> filtrarXbox(List<ExcelVideojuego> listaTotalVideoJuego){
        final var listaXbox = new ArrayList<ExcelVideojuego>();

        for(var videojuego : listaTotalVideoJuego){
            if(videojuego.getEmpresa().equals("XBOX")){
                listaXbox.add(videojuego);
            }
        }
        return listaXbox;
    }
}