package modelos;


import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("Colores")

public class ExcelColores {
    @ExcelCellName("NOMBRE")
    private String nombre;
    @ExcelCellName("ES PRIMARIO")
    private boolean esprimario;
    @ExcelCellName("HEXADECIMAL")
    private String hexadecimal;

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {

        final var multilinea = """
                {
                    nombre:%s
                    es primario: %b
                    hexadecimal: %s
                    
                               
                }               
                """;
        return String.format(multilinea, nombre, esprimario,hexadecimal);

    }

}
