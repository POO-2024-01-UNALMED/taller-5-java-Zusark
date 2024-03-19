package zooAnimales;
import java.util.*;
public class Ave extends Animal {
    private ArrayList<Ave> listado= new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;
    public static int creados;

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public Ave() {
        listado.add(this);
        creados++;
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat,genero);
        this.colorPlumas=colorPlumas;
        listado.add(this);
        creados++;
    }

    public static int cantidadAves() {
        return creados;
    }

    public String movimiento() {
        return "volar";
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        String habitat="montanas";
        String colorPlumas="cafe glorioso";
        Ave ave=new Ave(nombre,edad,habitat,genero,colorPlumas);
        halcones++;
        return ave;
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        String habitat="montanas";
        String colorPlumas="blanco y amarillo";
        Ave ave=new Ave(nombre,edad,habitat,genero,colorPlumas);
        aguilas++;
        return ave;
    }


}