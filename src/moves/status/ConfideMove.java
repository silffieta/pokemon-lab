package moves.status;

import ru.ifmo.se.pokemon.*;

public class ConfideMove extends StatusMove {
    public ConfideMove (Type type, double pow, double acc) {
        super(type, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect myEffect = new Effect();
        myEffect.stat(Stat.SPECIAL_ATTACK, 1);
        super.applyOppEffects(pokemon);
    }
}




