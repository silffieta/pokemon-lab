package moves.status;

import ru.ifmo.se.pokemon.*;

public class Will_O_Wisp extends StatusMove {
    public Will_O_Wisp(Type type, double pow, double acc) {
        super(type, pow, acc);
    }

    protected void applyOppEffects(Pokemon pokemon) {
        Effect.burn(pokemon);
    }

    @Override
    protected String describe(){
        return "used " + this.getClass().getSimpleName();
    }
}
