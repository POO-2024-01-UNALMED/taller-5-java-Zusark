package zooAnimales;
import java.util.*;
public class Anfibio extends Animal {
    private ArrayList<Anfibio> listado= new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;
    public static int creados;

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public Anfibio() {
        listado.add(this);
        creados++;
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel,boolean venenoso) {
        super(nombre, edad, habitat,genero);
        this.colorPiel=colorPiel;
        this.venenoso=venenoso;
        listado.add(this);
        creados++;
    }

    public static int cantidadAnfibios() {
        return creados;
    }

    public String movimiento(){
        return "saltar";
    }

    public static Anfibio crearRana(String nombre, int edad, String genero) {
        String habitat="selva";
        String colorPiel="rojo";
        boolean venenoso=false;
        Anfibio anfibio=new Anfibio(nombre,edad,habitat,genero,colorPiel,venenoso);
        ranas++;
        return anfibio;
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        String habitat="selva";
        String colorPiel="negro y amarillo";
        boolean venenoso=false;
        Anfibio anfibio=new Anfibio(nombre,edad,habitat,genero,colorPiel,venenoso);
        salamandras++;
        return anfibio;
    }

}