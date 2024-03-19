package gestion;

import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas;
    public Zoologico(){
    }
    public Zoologico(String nombre){
        this.nombre = nombre;
    }
    public Zoologico(String nombre,String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
    public Zoologico(String nombre,String ubicacion,ArrayList<Zona> zonas){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = zonas;
    }
    public void agregarZonas(Zona zona){
        this.zonas.add(zona);
    }
    public int cantidadTotalAnimales(){
        int total = 0;
        for (int i = 0;i<= this.zonas.size();i++){
            total = this.zonas.size();
        }
        return total;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getUbicacion(){
        return this.ubicacion;
    }
    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }
    public ArrayList<Zona> getZona(){
        return this.zonas;
    }
    public void setZona(ArrayList<Zona> zonas){
        this.zonas = zonas;
    }
}
