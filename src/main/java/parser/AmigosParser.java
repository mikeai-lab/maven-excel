package parser;

import modelos.ExcelAmigos;
import reader.ExcelReader;

public class AmigosParser {
    public static ExcelAmigos[] obtenerArrayAmigos(){
        final var listaAmigos = ExcelReader.obtenerListaAmigos();
        final var n =listaAmigos.size();

        final var arrayAmigos = new ExcelAmigos[n];

        for (var i = 0; i < n ; i++) {
            arrayAmigos[i] = listaAmigos.get(i);
        }
        return arrayAmigos;
    }
}
