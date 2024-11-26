package pokemons;

import moves.status.CalmMind;
import ru.ifmo.se.pokemon.*;

public class Ninetales extends Vulpix {
    public Ninetales(String name, int level) {
        super(name, level);
        this.setStats(73, 76, 75, 81, 100, 100);
        this.addMove(new CalmMind(Type.PSYCHIC, 0, 100));
    }
}
