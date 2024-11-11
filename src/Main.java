import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon p1 = new Vulpix("Vulpix", 50);
        Pokemon p2 = new Bounsweet("Bounsweet", 50);
        Pokemon p3 = new Ninetales("Ninetales", 50);
        Pokemon p4 = new Drampa("Drampa", 50);

        b.addAlly(p1);
        b.addAlly(p3);

        b.addFoe(p2);
        b.addFoe(p4);

        b.go();
    }
}