package moves.special;

import ru.ifmo.se.pokemon.*;

public class Dazzling_Gleam extends SpecialMove {
    public Dazzling_Gleam(Type type, double pow, double acc) { super(type, pow, acc);}

    @Override
    protected String describe() {
        return "used " + this.getClass().getSimpleName();
    }
}
