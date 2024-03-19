package zooAnimales;

import gestion.Zona;

public class Ave extends Animal{
    private static Ave[] listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(){}
    public Ave(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, Ave[] listado, int halcones, int aguilas, String colorPlumas){
        super(totalAnimales,nombre,edad,habitat,genero,zona);
        Ave.listado=listado;
        Ave.halcones = halcones;
        Ave.aguilas = aguilas;
        this.colorPlumas = colorPlumas;
    }

    public Ave[] getListado(){
        return Ave.listado;
    }
    public void setListado(Ave[] listado){
        Ave.listado = listado;
    }
    public String getColorPlumas(){
        return this.colorPlumas;
    }
    public void setColorPlumas(String colorPlumas){
        this.colorPlumas = colorPlumas;
    }
    public static int cantidadAves(){
        int total;
        total = Ave.listado.length;
        return total;
    }
    public String movimiento(){
        return "volar";
    }
    public void crearHalcon(){

    }
    public void crearAguila(){

    }
}
