package modelos;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("Vectores")

public class ExcelVectores {

    @ExcelCellName("NOMBRE")
    private String nombre;
    @ExcelCellName("X")
    private double x;
    @ExcelCellName("Y")
    private double y;

    private double calcularModulo(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {

        final var multilinea = """
                {
                    nombre:%s
                    modulo: %.2f                    
                
                }               
                """;
        return String.format(multilinea, nombre, calcularModulo(x,y));

    }
}
