package moves.special;

import ru.ifmo.se.pokemon.*;

public class VenoshockMove extends SpecialMove {
    public VenoshockMove(Type type, double pow, double acc) { super(type, pow, acc); }

    @Override
    protected double calcBaseDamage(Pokemon atk_pokemon, Pokemon def_pokemon) {
        Status condition = def_pokemon.getCondition();
        if (condition == Status.POISON) {
            return super.calcBaseDamage(atk_pokemon, def_pokemon)*2;
        }
        return super.calcBaseDamage(atk_pokemon, def_pokemon);
    }
}
