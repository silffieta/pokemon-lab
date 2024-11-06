package moves.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class FacadeMove extends PhysicalMove {
    public FacadeMove(Type type, double pow, double acc) {
        super(type, pow, acc);

    }

    @Override
    protected double calcBaseDamage(Pokemon pokemon, Pokemon pokemon1) {
        return super.calcBaseDamage(pokemon, pokemon1);
    }
}
