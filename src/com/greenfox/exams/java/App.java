package com.greenfox.exams.java;

import javax.swing.*;
import java.awt.*;

/**
 * Created by gabkamabka on 2016.12.05..
 */
public class App extends JFrame {

    JFrame frame = new JFrame();


    public App() {


        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();

        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setSize(300, 180);
        this.setLocation(xPos, yPos);
        this.setResizable(false);
        this.add(panel);

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App().setVisible(true);
            }

     }

    }
}

