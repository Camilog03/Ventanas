package controllers;

import models.Trainer;
import views.ViewsPokemonBattle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private Trainer t1, t2;
    private ViewsPokemonBattle view;

    public Controller(ViewsPokemonBattle view) {
        this.view = view;
    }

    public Trainer getT1() {
        return t1;
    }

    public void setT1(Trainer t1) {
        this.t1 = t1;
    }

    public Trainer getT2() {
        return t2;
    }

    public void setT2(Trainer t2) {
        this.t2 = t2;
    }

    public ViewsPokemonBattle getView() {
        return view;
    }

    public void setView(ViewsPokemonBattle view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nameT1 = view.assignNameTrainerT1();
        String nameT2 = view.assignNameTrainerT2();
        t1 = new Trainer(nameT1);
        t2 = new Trainer(nameT2);
        t1.randomPokemons();
        t2.randomPokemons();
        view.showPokemons(t1, t2);

    }

    public void startController(){
        view.start(this);
    }
}
