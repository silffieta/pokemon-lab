package pokemons;

import moves.special.Dazzling_Gleam;
import moves.special.Leaf_Storm;
import moves.status.Play_Nice;
import moves.status.Swagger;
import ru.ifmo.se.pokemon.*;

public class Tsareena extends Steene{
    public Tsareena(String name, int level) {
        super(name, level);
        this.addType(Type.GRASS);
        this.setStats(72, 120, 98, 50, 98, 72);
        this.setMove(
                new Move[]{
                        new Swagger(Type.NORMAL, 0 ,85),
                        new Dazzling_Gleam(Type.FAIRY, 80, 100),
                        new Play_Nice(Type.NORMAL, 0, 100),
                        new Leaf_Storm(Type.GRASS, 130, 100)
                }
        );
    }
}
