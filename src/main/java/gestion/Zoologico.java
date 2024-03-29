package gestion;
import java.util.*;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas= new ArrayList<>();

    public ArrayList<Zona> getZona() {
        return zonas;
    }
    public void setZonas(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Zoologico() {

    }
    public Zoologico(String nombre, String ubicacion) {
        this.nombre=nombre;
        this.ubicacion=ubicacion;
    }

    public void agregarZonas(Zona zona) {
        zonas.add(zona);
    }

    public int cantidadTotalAnimales() {
        int totalAnimales = 0;
        for (Zona zona : zonas) {
            totalAnimales += zona.cantidadAnimales();
        }
        return totalAnimales;
    }

}