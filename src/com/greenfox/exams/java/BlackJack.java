package com.greenfox.exams.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by gabkamabka on 2016.12.05..
 */
public class BlackJack extends JFrame {
    JButton newGame, deck;
    JLabel user;
    JLabel house;

    int clicks = 0;

    public BlackJack(){
        createView();
        setTitle("Black Jack");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();

    }
    private void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        user = new JLabel("User Played:");
        user.setPreferredSize(
                new Dimension(100, 25));
        panel.add(user);

        house = new JLabel("House Played");
        house.setPreferredSize(
                new Dimension(100, 25));
        panel.add(house);

        newGame = new JButton("New Game");
        newGame.addActionListener(
                new ActionListener() {
                    @Override

                    public void actionPerformed(ActionEvent e) {
                     
                    }
                }  );

        panel.add(newGame);
        deck = new JButton("Draw a drawCard");
        deck.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                }
                }
        );
        panel.add(deck);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BlackJack().setVisible(true);
            }
        });
    }
}