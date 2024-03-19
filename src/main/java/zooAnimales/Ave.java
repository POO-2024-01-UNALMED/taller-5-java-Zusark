package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave> listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;
    private static int creados;

    public Ave(){
        Ave.creados++;
    }
    public Ave(String nombre, int edad, String habitat,String genero,String colorPlumas){
        super(nombre,edad,habitat,genero);
        Ave.creados++;
        Ave.listado.add(this);
        this.colorPlumas = colorPlumas;
    }
    public Ave(String nombre, int edad, String habitat, String genero, Zona zona,int halcones, int aguilas, String colorPlumas){
        super(nombre,edad,habitat,genero,zona);
        Ave.creados++;
        Ave.halcones = halcones;
        Ave.aguilas = aguilas;
        this.colorPlumas = colorPlumas;
        Ave.listado.add(this);
    }

    public ArrayList<Ave> getListado(){
        return Ave.listado;
    }
    public void setListado(ArrayList<Ave> listado){
        Ave.listado = listado;
    }
    public String getColorPlumas(){
        return this.colorPlumas;
    }
    public void setColorPlumas(String colorPlumas){
        this.colorPlumas = colorPlumas;
    }
    public static int cantidadAves(){
        return creados;
    }
    public String movimiento(){
        return "volar";
    }
    public static Ave crearHalcon(String nombre, int edad, String genero){
        Ave.halcones++;
        return new Ave(nombre,edad,"selva",genero,"cafe glorioso");
    }
    public static Ave crearAguila(String nombre, int edad, String genero){
        Ave.aguilas++;
        return new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
    }
}
