package moves.special;

import ru.ifmo.se.pokemon.*;

public class LeafStorm extends SpecialMove {

    public LeafStorm(Type type, double pow, double acc) {
        super(type, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect myEffect = new Effect();
        myEffect.stat(Stat.SPECIAL_ATTACK, -2);
    }

    @Override
    protected String describe() {
        return "used Leaf Storm" ;
    }

}
