package modelos;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("Amigos")

public class ExcelAmigos {
    @ExcelCellName("NOMBRE")
    private String nombre;
    @ExcelCellName("APELLIDO")
    private String apellido;
    @ExcelCellName("EDAD")
    private int edad;
    @ExcelCellName("CASO EXITO")
    private int casoexito;
    @ExcelCellName("CASO TOTALES")
    private int casototales;
    @ExcelCellName("EMPRESA")
    private String empresa;
    @ExcelCellName("TIPO")
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {

        final var multilinea = """
                {
                    nombre:%s
                    apellido: %s
                    edad: %d
                    caso exito: %d
                    caso totales: %d
                    empresa: %s
                    tipo: %s
                               
                }               
                """;
        return String.format(multilinea, nombre, apellido,edad, casoexito,casototales, empresa, tipo);

    }
}
