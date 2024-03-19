package zooAnimales;
import java.util.*;
public class Pez extends Animal {
    private ArrayList<Pez> listado= new ArrayList<>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;
    public static int creados;

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }

    public Pez() {
        listado.add(this);
        creados++;
    }

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat,genero);
        this.colorEscamas=colorEscamas;
        this.cantidadAletas=cantidadAletas;
        listado.add(this);
        creados++;
    }

    public static int cantidadPeces() {
        return creados;
    }

    public String movimiento() {
        return "nadar";
    }

    public static Pez crearSalmon(String nombre, int edad, String genero) {
        String habitat="oceano";
        String colorEscamas="rojo";
        int cantidadAletas=6;
        Pez pez=new Pez(nombre,edad,habitat,genero,colorEscamas,cantidadAletas);
        salmones++;
        return pez;
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
        String habitat="oceano";
        String colorEscamas="gris";
        int cantidadAletas=6;
        Pez pez=new Pez(nombre,edad,habitat,genero,colorEscamas,cantidadAletas);
        bacalaos++;
        return pez;
    }
}
