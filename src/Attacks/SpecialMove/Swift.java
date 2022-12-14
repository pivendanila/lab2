package Attacks.SpecialMove;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Swift extends SpecialMove {
    public Swift() {
        super(Type.NORMAL, 60, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon var1, Pokemon var2) {
        return true;
    }

    @Override
    protected String describe() {
        return "использует прием \"Swift\"";
    }
}