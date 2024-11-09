package pokemons;
import moves.status.Will_O_Wisp;
import ru.ifmo.se.pokemon.*;

public class Vulpix extends Pokemon {

    public Vulpix(String name, int level) {
        super(name, level);
        this.addType(Type.FIRE);
        this.setStats(38, 41, 40, 50, 65, 65);
        this.setMove(
                new Move[]{
                    new Will_O_Wisp(Type.FIRE, 0, 85)

                }

        );
    }
}
