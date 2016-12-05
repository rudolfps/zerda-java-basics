package com.greenfox.exams.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by gabkamabka on 2016.12.05..
 */
public class BlackJack extends JPanel {
    JButton newGame, deck;
    JLabel user;
    JLabel house;


    public BlackJack(){
        createView();
    }
    private void createView() {
        JPanel panel = new JPanel();
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
                        //method wanted
                    }
                }  );

        panel.add(newGame);
        deck = new JButton("Draw a drawCard");
        deck.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //method wanted
                }
                }
        );
        panel.add(deck);
        panel.setVisible(true);
    }
}