package pokemons;

import moves.special.Dazzling_Gleam;
import moves.status.Swagger;
import ru.ifmo.se.pokemon.*;

public class Bounsweet extends Pokemon {

    public Bounsweet(String name, int level) {
        super(name, level);
        this.addType(Type.GRASS);
        this.setStats(42, 30, 38, 30, 38, 32);
        this.setMove(
                new Move[]{
                       new Swagger(Type.NORMAL, 0 ,85),
                       new Dazzling_Gleam(Type.FAIRY, 80, 100)
                }
        );

    }
}
