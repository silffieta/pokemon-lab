package pokemons;
import moves.physical.FacadeMove;
import moves.special.VenoshockMove;
import moves.status.ConfideMove;
import ru.ifmo.se.pokemon.*;
import moves.status.SwaggerMove;


public final class Drampa extends Pokemon {

    public Drampa(String name, int level) {
        super(name, level);
        this.addType(Type.DRAGON);
        this.setStats(78, 60, 85, 135, 91, 36);
        this.setMove(
                new Move[] {
                        new SwaggerMove(Type.NORMAL, 0, 85),
                        new ConfideMove(Type.NORMAL, 0, 100),
                        new FacadeMove(Type.NORMAL, 70, 100),
                        new VenoshockMove(Type.POISON, 65, 100)
                }
        );
    }

}
