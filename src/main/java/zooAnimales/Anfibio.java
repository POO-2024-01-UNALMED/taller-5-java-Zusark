package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal {
    private static Anfibio[] listado;
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(){}
    public Anfibio(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, Anfibio[] listado, int ranas, int salamandras, String colorPiel, boolean venenoso){
        super(totalAnimales,nombre,edad,habitat,genero,zona);
        Anfibio.listado = listado;
        Anfibio.ranas = ranas;
        Anfibio.salamandras = salamandras;
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }

    public Anfibio[] getListado(){
        return Anfibio.listado;
    }
    public void setListado(Anfibio[] listado){
        Anfibio.listado = listado;
    }
    public String getColorPiel(){
        return this.colorPiel;
    }
    public void setColorPiel(String colorPiel){
        this.colorPiel = colorPiel;
    }
    public boolean getVenenoso(){
        return this.venenoso;
    }
    public void setVenenoso(boolean venenoso){
        this.venenoso = venenoso;
    }

    public static int cantidadAnfibios(){
        int total;
        total = Anfibio.listado.length;
        return total;
    }
    public String movimiento(){
        return "saltar";
    }
    public void crearRana(){

    }
    public void crearSalamandra(){

    }
}
