package zooAnimales;
import gestion.Zona;
public class Animal {
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal(){}
    public Animal(String nombre){
        this.nombre = nombre;
    }
    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public Animal(String nombre, int edad,String habitat){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
    }
    public Animal(String nombre, int edad,String habitat, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
    }
    public Animal(int totalAnimales,String nombre, int edad,String habitat, String genero,Zona zona){
        Animal.totalAnimales = totalAnimales;
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;

    }

    public String movimiento(){
        return "desplazarse";
    };
    public String totalPorTipo(){
        String cadena;
        cadena ="Mamiferos: "+Mamifero.cantidadMamiferos()+
                        "\nAves: "+Ave.cantidadAves()+
                        "\nReptiles: "+Reptil.cantidadReptiles()+
                        "\nPeces: "+Pez.cantidadPeces()+
                        "\nAnfibios: "+Anfibio.cantidadAnfibios();
        return cadena;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getHabitat(){
        return this.habitat;
    }
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }
    public String getGenero(){
        return this.nombre;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public Zona getZona(){
        return this.zona;
    }
    public void setZona(Zona zona){
        this.zona = zona;
    }

    @Override
    public String toString() {
        String cadena;
        if (this.zona == null){
            cadena = "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero;
            return cadena;
        }
        cadena = "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero+", la zona en la que me ubico es "+this.zona.getNombre()+", en el "+this.zona.getZoo().getNombre();
        return cadena;
    }
}
