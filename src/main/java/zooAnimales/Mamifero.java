package zooAnimales;
import gestion.Zona;

public class Mamifero extends Animal{
    private static Mamifero[] listado;
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(){}
    public Mamifero(String habitat,boolean pelaje, int patas){
        super();
    }
    public Mamifero(int totalAnimales,String nombre,int edad,String habitat,String genero,Zona zona,Mamifero[] listado,int caballos,int leones,boolean pelaje, int patas){
        super(totalAnimales,nombre,edad,habitat,genero,zona);
        Mamifero.listado = listado;
        Mamifero.caballos = caballos;
        Mamifero.leones = leones;
        this.pelaje = pelaje;
        this.patas = patas;


    }
    public static Mamifero[] getListado(){
        return Mamifero.listado;
    }
    public void setListado(Mamifero[] listado){
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
        total = Mamifero.listado.length;
        return total;
    }
    public static void crearCaballo(){
        String habitat = "pradera";
        int patas = 4;
        boolean pelaje = true;
        this(habitat,patas,pelaje);
        Mamifero.leones++;
    }
    public void crearLeon(){
        Mamifero.leones++;
    }
}
