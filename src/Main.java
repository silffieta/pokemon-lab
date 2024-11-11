import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon p1 = new Vulpix("Ninetales", 50);
        Pokemon p2 = new Bounsweet("Bounsweet", 50);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}