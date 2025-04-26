package views;

import controllers.Controller;
import models.Trainer;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame implements ViewsPokemonBattle {
    Container contentPane;
    JTextField nameTrainerT1;
    JTextField nameTrainerT2;
    JButton startTrainerButton;
    JLabel nameTrainerT1Label,  nameTrainerT2Label;

    public Gui() {

        setResizable(false);
        contentPane = new Container();
        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        nameTrainerT1 = new JTextField(10);
        nameTrainerT2 = new JTextField(10);
        nameTrainerT1Label = new JLabel("Name:");
        nameTrainerT2Label = new JLabel("Name:");
        startTrainerButton = new JButton("Start");
        contentPane.add(nameTrainerT1Label);
        contentPane.add(nameTrainerT1);
        contentPane.add(nameTrainerT2Label);
        contentPane.add(nameTrainerT2) ;
        contentPane.add(startTrainerButton);

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }


    @Override
    public void start(Controller controller) {
        startTrainerButton.addActionListener(controller);
        setVisible(true);
    }

    @Override
    public String assignNameTrainerT1() {
        return nameTrainerT1.getText();
    }

    @Override
    public void showPokemons(Trainer trainer1, Trainer trainer2) {
        String message = "Pokemones " + trainer1.getName() + "\n";
        for (int i = 0; i < 3 ; i++) {
            message += trainer1.getPokemons().get(i).toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, message);
        message = "Pokemones " + trainer2.getName() + "\n";
        for (int i = 0; i < 3 ; i++) {
            message += trainer2.getPokemons().get(i).toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, message);

    }

    @Override
    public String assignNameTrainerT2() {
        return nameTrainerT2.getText();
    }
}
