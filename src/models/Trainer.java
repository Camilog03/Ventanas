package models;

import java.util.ArrayList;

public class Trainer {
    private String name;
    private ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>(3);

    public Trainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public void randomPokemons() {
        for (int i = 0; i < 3; i++) {
            Pokemon temp = new Pokemon();
            temp.setHp((short)(Math.random() * 100+1));
            temp.setAttack((short)(Math.random() * 50+1));
            temp.setType(Type.values()[(int)(Math.random() * Type.values().length-1)]);
            pokemons.add(temp);
        }
    }
}

