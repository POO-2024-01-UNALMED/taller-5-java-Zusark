package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Pez extends Animal{
    private static ArrayList<Pez> listado;
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(){}
    public Pez(String nombre, int edad,String habitat, String genero, String colorEscamas, int cantidadAletas){
        super(nombre,edad,habitat,genero);
        Pez.listado.add(this);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }
    public Pez(String nombre, int edad, String habitat, String genero, Zona zona, int salmones, int bacalaos, String colorEscamas, int cantidadAletas){
        super(nombre,edad,habitat,genero,zona);
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
        int total;
        if (Pez.listado == null){
            return 0;
        }
        total = Pez.listado.size();
        return total;
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
