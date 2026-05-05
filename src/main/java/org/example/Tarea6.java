package org.example;

import modelos.ExcelVectores;
import reader.ExcelReader;

import java.util.ArrayList;
import java.util.List;

public class Tarea6 {

    public static void main(String[] args) {
        final var listaVectores = ExcelReader.obtenerListaVectores();
        final var filtrarVectores = filtrarVectores(listaVectores);

        System.out.printf("la lista es: %s%n", filtrarVectores);

    }

    private static List<ExcelVectores> filtrarVectores(List<ExcelVectores> listaVectores){
        final var listaVectoresfiltrado = new ArrayList<ExcelVectores>();

        for(var vectores : listaVectores){
            if(vectores.getNombre().equals("RITA") || vectores.getNombre().equals("LAURA")){
                listaVectoresfiltrado.add(vectores);
            }
        }
        return listaVectoresfiltrado;
    }

}
