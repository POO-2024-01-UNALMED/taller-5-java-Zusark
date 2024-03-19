package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Anfibio extends Animal {
    private static ArrayList<Anfibio> listado;
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(){}
    public Anfibio(String nombre, int edad,String habitat, String genero,String colorPiel,boolean venenoso){
        super(nombre,edad,habitat,genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }
    public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, int ranas, int salamandras, String colorPiel, boolean venenoso){
        super(nombre,edad,habitat,genero,zona);
        Anfibio.listado.add(this);
        Anfibio.ranas = ranas;
        Anfibio.salamandras = salamandras;
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }

    public ArrayList<Anfibio> getListado(){
        return Anfibio.listado;
    }
    public void setListado(ArrayList<Anfibio> listado){
        Anfibio.listado = listado;
    }
    public String getColorPiel(){
        return this.colorPiel;
    }
    public void setColorPiel(String colorPiel){
        this.colorPiel = colorPiel;
    }
    public boolean isVenenoso(){
        return this.venenoso;
    }
    public void setVenenoso(boolean venenoso){
        this.venenoso = venenoso;
    }

    public static int cantidadAnfibios(){
        int total;
        total = Anfibio.listado.size();
        return total;
    }
    public String movimiento(){
        return "saltar";
    }
    public static Anfibio crearRana(String nombre, int edad, String genero){
        Anfibio.ranas++;
        return new Anfibio(nombre,edad,"selva",genero,"rojo",true);
    }
    public static Anfibio crearSalamandra(String nombre, int edad, String genero){
        Anfibio.salamandras++;
        return new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
    }
}
