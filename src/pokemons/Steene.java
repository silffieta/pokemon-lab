package pokemons;

import moves.special.Dazzling_Gleam;
import moves.status.Play_Nice;
import moves.status.Swagger;
import ru.ifmo.se.pokemon.*;

public class Steene extends Bounsweet {

    public Steene(String name, int level) {
        super(name, level);
        this.setStats(52, 40, 48, 40, 48, 62);
        this.setMove(
                new Move[]{
                     new Swagger(Type.NORMAL, 0 ,85),
                     new Dazzling_Gleam(Type.FAIRY, 80, 100),
                     new Play_Nice(Type.NORMAL, 0, 100),
                }

        );
    }
}
