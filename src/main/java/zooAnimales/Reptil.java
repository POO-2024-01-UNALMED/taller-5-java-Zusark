package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Reptil extends Animal{
    private static ArrayList<Reptil> listado;
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;
    private static int creados;

    public Reptil(){
        Reptil.creados++;
    }
    public Reptil(String nombre, int edad,String habitat, String genero, String colorEscamas, int largoCola){
        super(nombre,edad,habitat,genero);
        Reptil.creados++;
        Reptil.listado.add(this);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }
    public Reptil(String nombre, int edad, String habitat, String genero, Zona zona,int iguanas, int serpientes, String colorEscamas, int largoCola){
        super(nombre,edad,habitat,genero,zona);
        Reptil.creados++;
        Reptil.listado.add(this);
        Reptil.iguanas = iguanas;
        Reptil.serpientes = serpientes;
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }

    public ArrayList<Reptil> getListado(){
        return Reptil.listado;
    }
    public void setListado(ArrayList<Reptil> listado){
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
        return creados;
    }
    public String movimiento(){
        return "reptar";
    }
    public static Reptil crearIguana(String nombre, int edad, String genero){
        Reptil.iguanas++;
        return new Reptil(nombre,edad,"humedal",genero,"verde",3);
    }
    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        Reptil.serpientes++;
        return new Reptil(nombre,edad,"jungla",genero,"blanco",1);
    }
}
