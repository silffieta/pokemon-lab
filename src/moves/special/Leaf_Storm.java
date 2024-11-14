package moves.special;

import ru.ifmo.se.pokemon.*;

public class Leaf_Storm extends SpecialMove {

    public Leaf_Storm(Type type, double pow, double acc) {
        super(type, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect myEffect = new Effect();
        myEffect.stat(Stat.SPECIAL_ATTACK, -2);
    }

    @Override
    protected String describe() {
        return "used " + this.getClass().getSimpleName();
    }

}
