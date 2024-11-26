package pokemons;

import moves.status.PlayNice;
import ru.ifmo.se.pokemon.*;

public class Steene extends Bounsweet {

    public Steene(String name, int level) {
        super(name, level);
        this.setStats(52, 40, 48, 40, 48, 62);
        this.addMove(new PlayNice(Type.NORMAL, 0, 100));

    }
}
