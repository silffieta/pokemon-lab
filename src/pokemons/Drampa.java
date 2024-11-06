package pokemons;
import moves.status.ConfideMove;
import ru.ifmo.se.pokemon.*;
import moves.status.SwaggerMove;


public final class Drampa extends Pokemon {

    public Drampa() {
        super("Drampa", 1);
        this.addType(Type.DRAGON);
        this.setStats(78, 60, 85, 135, 91, 36);
        this.addMove(new SwaggerMove(Type.NORMAL, 0, 85));
        this.addMove(new ConfideMove(Type.NORMAL, 0, 100));

    }

}
