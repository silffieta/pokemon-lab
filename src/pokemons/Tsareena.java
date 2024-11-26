package pokemons;

import moves.special.LeafStorm;
import ru.ifmo.se.pokemon.*;

public class Tsareena extends Steene {
    public Tsareena(String name, int level) {
        super(name, level);
        this.addType(Type.GRASS);
        this.setStats(72, 120, 98, 50, 98, 72);
        this.addMove(new LeafStorm(Type.GRASS, 130, 100));
    }
}
