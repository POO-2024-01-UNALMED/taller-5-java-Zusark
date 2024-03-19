import gestion.*;
import zooAnimales.*;
public class Main {
    public static void main (String[] args) {
        new Anfibio();
        new Anfibio();
        new Mamifero();
        new Mamifero();
        new Mamifero();
        new Reptil();
        new Pez();
        new Ave();
        new Ave();
        boolean ok = false;
        String comp = "Mamiferos: 4\n" +
                "Aves: 4\n" +
                "Reptiles: 2\n" +
                "Peces: 2\n" +
                "Anfibios: 3";
        if (Animal.totalPorTipo().equals(comp)) {
            ok = true;

            
        }
        System.out.println(Animal.totalPorTipo());
    }
}

