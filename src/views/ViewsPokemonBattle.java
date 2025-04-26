package views;

import controllers.Controller;
import models.Trainer;

public interface ViewsPokemonBattle {
    public void start(Controller controller);
    public String assignNameTrainerT1();
    public void showPokemons(Trainer trainer1, Trainer trainer2);
    public String assignNameTrainerT2();
}
