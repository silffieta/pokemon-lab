import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();

        Pokemon p1 = new Tsareena("Tsareena", 50);
        Pokemon p2 = new Steene("Steene", 50);
        Pokemon p3 = new Drampa("Drampa", 50);
        Pokemon p4 = new Vulpix("Vulpix", 50);
        Pokemon p5 = new Bounsweet("Bounsweet", 50);
        Pokemon p6 = new Ninetales("Ninetales", 50);


        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);

        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);

        b.go();
    }
}