package pokemons;
import moves.physical.Flame_Charge;
import moves.status.Rest;
import moves.status.Will_O_Wisp;
import ru.ifmo.se.pokemon.*;

public class Vulpix extends Pokemon {

    public Vulpix(String name, int level) {
        super(name, level);
        this.addType(Type.FIRE);
        this.setStats(38, 41, 40, 50, 65, 65);
        this.setMove(
                new Move[]{
                    new Will_O_Wisp(Type.FIRE, 0, 85),
                    new Rest(Type.NORMAL, 0, 100),
                    new Flame_Charge(Type.FIRE, 50, 100),
                }

        );
    }
}
