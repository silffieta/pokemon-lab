package moves.status;

import ru.ifmo.se.pokemon.*;

public class CalmMind extends StatusMove {
    public CalmMind(Type type, double pow, double acc) {
        super(type, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect myEffect1 = new Effect();
        Effect myEffect2 = new Effect();

        myEffect1.stat(Stat.SPECIAL_ATTACK, 1);
        myEffect2.stat(Stat.SPECIAL_DEFENSE, 1);
    }

    @Override
    protected String describe() {
        return "used Calm Mind ";
    }
}
