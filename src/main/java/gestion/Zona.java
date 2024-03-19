package gestion;

import zooAnimales.Animal;

import java.util.ArrayList;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales;
    public Zona(){
    }
    public Zona(String nombre){
        this.nombre = nombre;
    }
    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo = zoo;
    }
    public Zona(String nombre, Zoologico zoo, ArrayList<Animal> animales){
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = animales;
    }
    public void agregarAnimales(Animal a){
        this.animales.add(a);
    }
    public int cantidadAnimales(){
        int total;
        total = this.animales.size();
        return total;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public Zoologico getZoo(){
        return this.zoo;
    }
    public void setZoo(Zoologico zoo){
       this.zoo = zoo;
    }
    public ArrayList<Animal> getAnimales(){
        return this.animales;
    }
    public void setAnimales(ArrayList<Animal> animales){
        this.animales =animales;
    }
}
