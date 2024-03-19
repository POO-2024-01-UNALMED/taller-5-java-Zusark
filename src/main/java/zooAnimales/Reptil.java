package zooAnimales;

import gestion.Zona;

public class Reptil extends Animal{
    private static Reptil[] listado;
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(){}
    public Reptil(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, Reptil[] listado, int iguanas, int serpientes, String colorEscamas, int largoCola){
        super(totalAnimales,nombre,edad,habitat,genero,zona);
        Reptil.listado = listado;
        Reptil.iguanas = iguanas;
        Reptil.serpientes = serpientes;
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }

    public Reptil[] getListado(){
        return Reptil.listado;
    }
    public void setListado(Reptil[] listado){
        Reptil.listado = listado;
    }
    public String getColorEscamas(){
        return this.colorEscamas;
    }
    public void setColorEscamas(String colorEscamas){
        this.colorEscamas = colorEscamas;
    }
    public int getLargoCola(){
        return this.largoCola;
    }
    public void setLargoCola(int largoCola){
        this.largoCola = largoCola;
    }

    public static int cantidadReptiles(){
        int total;
        total = Anfibio.listado.length;
        return total;
    }
    public String movimiento(){
        return "reptar";
    }
    public void crearIguana(){

    }
    public void crearSerpiente(){

    }
}
