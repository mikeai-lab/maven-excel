package reader;

import com.poiji.bind.Poiji;
import modelos.ExcelAmigos;
import modelos.ExcelColores;
import modelos.ExcelProductos;
import modelos.ExcelVectores;
import modelos.ExcelVideojuego;

import java.io.File;
import java.util.List;

public class ExcelReader {
    private final static String excelPath = "src/main/resources/data/dataTarea.xlsx";

    public static List<ExcelVideojuego> obtenerListaVideoJuego(){
        return Poiji.fromExcel(new File(excelPath), ExcelVideojuego.class);
    }
    public static List<ExcelAmigos> obtenerListaAmigos(){
        return Poiji.fromExcel(new File(excelPath), ExcelAmigos.class);
    }

    public static List<ExcelProductos> obtenerListaProductos(){
        return Poiji.fromExcel(new File(excelPath), ExcelProductos.class);
    }

    public static List<ExcelColores> obtenerListaColores(){
        return Poiji.fromExcel(new File(excelPath), ExcelColores.class);
    }

    public static List<ExcelVectores> obtenerListaVectores(){
        return Poiji.fromExcel(new File(excelPath), ExcelVectores.class);
    }
}
