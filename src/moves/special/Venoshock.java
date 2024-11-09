package moves.special;

import ru.ifmo.se.pokemon.*;

public class Venoshock extends SpecialMove {
    public Venoshock(Type type, double pow, double acc) { super(type, pow, acc); }

    @Override
    protected double calcBaseDamage(Pokemon atk_pokemon, Pokemon def_pokemon) {
        Status condition = def_pokemon.getCondition();
        if (condition == Status.POISON) {
            return super.calcBaseDamage(atk_pokemon, def_pokemon)*2;
        }
        return super.calcBaseDamage(atk_pokemon, def_pokemon);
    }

    @Override
    protected String describe(){
        return "used " + this.getClass().getSimpleName();
    }
}
