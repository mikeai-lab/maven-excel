package org.example;

import modelos.ExcelAmigos;
import reader.ExcelReader;

import java.util.ArrayList;
import java.util.List;

public class Tarea2 {
    public static void main(String[] args) {
        final var listaAmigos = ExcelReader.obtenerListaAmigos();
        final var filtrarAmigos = filtrarAmigos(listaAmigos);
        final var arrayAmigos = convertirListaArray(filtrarAmigos);
        ordenarArrayAmigos(arrayAmigos);
        final var listaAmigosOrdenada = convertirArrayLista(arrayAmigos);

        System.out.printf("la lista es: %s%n", listaAmigosOrdenada);
    }

    private static List<ExcelAmigos> filtrarAmigos(List<ExcelAmigos> listaAmigos){
        final var listaAmigosfiltrado = new ArrayList<ExcelAmigos>();

        for(var amigos : listaAmigos){
            if(amigos.getTipo().equals("ABOGADO")){
                listaAmigosfiltrado.add(amigos);
            }
        }
        return listaAmigosfiltrado;
    }


    private static String[] convertirListaArray(List<ExcelAmigos> listaAmigos){
        final var n = listaAmigos.size();
        final var arrayAmigos = new String[n];

        for (var i = 0; i < n; i++) {
                //if(listaAmigos.get(i).getTipo().equals("ABOGADO")) {
                    arrayAmigos[i] = String.valueOf(listaAmigos.get(i));
               // }
        }
        return arrayAmigos;
    }

    private static void ordenarArrayAmigos(String[] array){
        final var n = array.length;

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n-i-1; j++) {

                if(array[j].compareTo(array[j+1])>=0){
                    final var temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }

            }

        }
    }

    private static List <String> convertirArrayLista(String[] arrayAmigos){
        final var lista = new  ArrayList<String>();

        for (var amigos : arrayAmigos) {

            lista.add(amigos);
        }
        return lista;
    }

}
