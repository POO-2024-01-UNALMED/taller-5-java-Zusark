package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Pez extends Animal{
    private static ArrayList<Pez> listado;
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;
    private static int creados;

    public Pez(){
        Pez.creados++;
    }
    public Pez(String nombre, int edad,String habitat, String genero, String colorEscamas, int cantidadAletas){
        super(nombre,edad,habitat,genero);
        Pez.listado.add(this);
        Pez.creados++;
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }
    public Pez(String nombre, int edad, String habitat, String genero, Zona zona, int salmones, int bacalaos, String colorEscamas, int cantidadAletas){
        super(nombre,edad,habitat,genero,zona);
        Pez.creados++;
        Pez.listado.add(this);
        Pez.salmones = salmones;
        Pez.bacalaos = bacalaos;
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public ArrayList<Pez> getListado(){
        return Pez.listado;
    }
    public void setListado(ArrayList<Pez> listado){
        Pez.listado = listado;
    }
    public String getColorEscamas(){
        return this.colorEscamas;
    }
    public void setColorEscamas(String colorEscamas){
        this.colorEscamas = colorEscamas;
    }
    public int getCantidadAletas(){
        return this.cantidadAletas;
    }
    public void setCantidadAletas(int cantidadAletas){
        this.cantidadAletas = cantidadAletas;
    }

    public static int cantidadPeces(){
        return creados;
    }
    public String movimiento(){
        return "nadar";
    }
    public static Pez crearSalmon(String nombre, int edad, String genero){
        Pez.salmones++;
        return new Pez(nombre,edad,"oceano",genero,"rojo",6);
    }
    public static Pez crearBacalao(String nombre, int edad, String genero){
        Pez.bacalaos++;
        return new Pez(nombre,edad,"oceano",genero,"gris",6);
    }
}
