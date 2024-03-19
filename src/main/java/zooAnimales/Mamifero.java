package zooAnimales;
import gestion.Zona;

import java.util.ArrayList;

public class Mamifero extends Animal{
    private static ArrayList<Mamifero> listado;
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad,String habitat, String genero,boolean pelaje, int patas){
        super(nombre,edad,habitat,genero);
        Mamifero.listado.add(this);
        this.pelaje = pelaje;
        this.patas = patas;
    }
    public Mamifero(){}
    public Mamifero(String nombre,int edad,String habitat,String genero,Zona zona,int caballos,int leones,boolean pelaje, int patas){
        super(nombre,edad,habitat,genero,zona);
        Mamifero.listado.add(this);
        Mamifero.caballos = caballos;
        Mamifero.leones = leones;
        this.pelaje = pelaje;
        this.patas = patas;
    }
    public static ArrayList<Mamifero> getListado(){
        return Mamifero.listado;
    }
    public void setListado(ArrayList<Mamifero> listado){
        Mamifero.listado = listado;
    }
    public boolean getPelaje(){
        return this.pelaje;
    }
    public void setPelaje(boolean pelaje){
        this.pelaje = pelaje;
    }
    public int getPatas(){
        return this.patas;
    }
    public void setPatas(int patas){
        this.patas = patas;
    }

    public static int cantidadMamiferos(){
        int total;
        total = Mamifero.listado.size();
        return total;
    }
    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        Mamifero.leones++;
        return new Mamifero(nombre,edad,"pradera",genero,true,4);
    }
    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        Mamifero.leones++;
        return new Mamifero(nombre, edad, "selva", genero, true, 4);
    }
}
