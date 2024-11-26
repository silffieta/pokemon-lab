package pokemons;
import moves.physical.FlameCharge;
import moves.status.Rest;
import moves.status.WillOWisp;
import ru.ifmo.se.pokemon.*;

public class Vulpix extends Pokemon {

    public Vulpix(String name, int level) {
        super(name, level);
        this.addType(Type.FIRE);
        this.setStats(38, 41, 40, 50, 65, 65);
        this.setMove(
                new WillOWisp(Type.FIRE, 0, 85),
                new Rest(Type.NORMAL, 0, 100),
                new FlameCharge(Type.FIRE, 50, 100));
    }
}
