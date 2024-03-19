package zooAnimales;

import gestion.Zona;

public class Pez extends Animal{
    private static Pez[] listado;
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(){}
    public Pez(String nombre, int edad,String habitat, String genero, String colorEscamas, int cantidadAletas){
        super(nombre,edad,habitat,genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }
    public Pez(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, Pez[] listado, int salmones, int bacalaos, String colorEscamas, int cantidadAletas){
        super(totalAnimales,nombre,edad,habitat,genero,zona);
        Pez.listado = listado;
        Pez.salmones = salmones;
        Pez.bacalaos = bacalaos;
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public Pez[] getListado(){
        return Pez.listado;
    }
    public void setListado(Pez[] listado){
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
        total = Pez.listado.length;
        return total;
    }
    public String movimiento(){
        return "nadar";
    }
    public void crearSalmon(String nombre, int edad, String genero){
        this(nombre,edad,"oceano",genero,"rojo",6);
        Pez.salmones++;
    }
    public void crearBacalao(String nombre, int edad, String genero){
        this(nombre,edad,"oceano",genero,"gris",6);
        Pez.bacalaos++;
    }
}
