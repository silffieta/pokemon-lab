package moves.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade(Type type, double pow, double acc) {
        super(type, pow, acc);
    }


    @Override
    protected double calcBaseDamage(Pokemon atk_pokemon, Pokemon def_pokemon) {
        Status condition = atk_pokemon.getCondition();
        if (condition == Status.BURN || condition == Status.PARALYZE || condition == Status.POISON) {
            return super.calcBaseDamage(atk_pokemon, def_pokemon)*2;
        }
        return super.calcBaseDamage(atk_pokemon, def_pokemon);
    }

    @Override
    protected String describe(){
        return "used " + this.getClass().getSimpleName();
    }
}
