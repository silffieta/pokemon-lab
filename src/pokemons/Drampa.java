package pokemons;

import moves.physical.Facade;
import moves.special.Venoshock;
import moves.status.Confide;
import ru.ifmo.se.pokemon.*;
import moves.status.Swagger;

public final class Drampa extends Pokemon {

    public Drampa(String name, int level) {
        super(name, level);
        this.addType(Type.DRAGON);
        this.setStats(78, 60, 85, 135, 91, 36);
        this.setMove(
                new Swagger(Type.NORMAL, 0, 85),
                new Confide(Type.NORMAL, 0, 100),
                new Facade(Type.NORMAL, 70, 100),
                new Venoshock(Type.POISON, 65, 100));
    }

}
