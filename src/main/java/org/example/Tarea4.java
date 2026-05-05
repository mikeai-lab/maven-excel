package org.example;

import modelos.ExcelProductos;
import reader.ExcelReader;

import java.util.ArrayList;
import java.util.List;

public class Tarea4 {
    public static void main(String[] args) {
        final var listaProductos = ExcelReader.obtenerListaProductos();
        final var filtrarProductos = filtrarProductos(listaProductos);

        System.out.printf("la lista es: %s%n", filtrarProductos);

    }
    private static List<ExcelProductos> filtrarProductos(List<ExcelProductos> listaProductos){
        final var listaProductosfiltrado = new ArrayList<ExcelProductos>();

        for(var productos : listaProductos){
            if(productos.getNombre().startsWith("A")){
                listaProductosfiltrado.add(productos);
            }
        }
        return listaProductosfiltrado;
    }
}
