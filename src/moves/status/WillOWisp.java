package moves.status;

import ru.ifmo.se.pokemon.*;

public class WillOWisp extends StatusMove {

    public WillOWisp(Type type, double pow, double acc) {
        super(type, pow, acc);
    }

    protected void applyOppEffects(Pokemon pokemon) {
        Effect.burn(pokemon);
    }

    @Override
    protected String describe() {
        return "used Will-O-Wisp " ;
    }
}
