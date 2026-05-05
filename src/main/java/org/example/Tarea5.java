package org.example;

import modelos.ExcelColores;
import reader.ExcelReader;

import java.util.ArrayList;
import java.util.List;

public class Tarea5 {

    public static void main(String[] args) {
        final var listaColores = ExcelReader.obtenerListaColores();
        final var filtrarColores = filtrarColores(listaColores);

        System.out.printf("la lista es: %s%n", filtrarColores);
    }

    private static List<ExcelColores> filtrarColores(List<ExcelColores> listaColores){
        final var listaColoresfiltrado = new ArrayList<ExcelColores>();

        for(var colores : listaColores){
            if(colores.getNombre().equals("BLANCO") || colores.getNombre().equals("PLATA")){
                listaColoresfiltrado.add(colores);
            }
        }
        return listaColoresfiltrado;
    }

}
