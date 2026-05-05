package org.example;

import modelos.ExcelVideojuego;
import reader.ExcelReader;

import java.util.ArrayList;
import java.util.List;

public class Tarea3 {

    public static void main(String[] args) {
        final var listaVideoJuegos = ExcelReader.obtenerListaVideoJuego();
        final var filtrarVideoJuegos = filtrarVideoJuegos(listaVideoJuegos);

        System.out.printf("la lista es: %s%n", filtrarVideoJuegos);

    }

    private static List<ExcelVideojuego> filtrarVideoJuegos(List<ExcelVideojuego> listaVideojuegos){
        final var listaVideoJuegosfiltrado = new ArrayList<ExcelVideojuego>();

        for(var videojuego : listaVideojuegos){
            if(videojuego.getNombre().startsWith("T")){
                listaVideoJuegosfiltrado.add(videojuego);
            }
        }
        return listaVideoJuegosfiltrado;
    }

}
