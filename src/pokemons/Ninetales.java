package pokemons;

import moves.physical.Flame_Charge;
import moves.status.Calm_Mind;
import moves.status.Rest;
import moves.status.Will_O_Wisp;
import ru.ifmo.se.pokemon.*;

public class Ninetales extends Vulpix{

    public Ninetales(String name, int level) {
        super(name, level);
        this.setStats(73, 76, 75, 81, 100, 100);
        this.setMove(
                new Move[]{
                    new Will_O_Wisp(Type.FIRE, 0, 85),
                    new Rest(Type.NORMAL, 0, 100),
                    new Flame_Charge(Type.FIRE, 50, 100),
                    new Calm_Mind(Type.PSYCHIC, 0, 100),
                }
        );
    }
}
