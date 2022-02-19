package com.company;

import javax.swing.*;

public class GameFrame extends JFrame {



    GameFrame() {
        //GamePanel gp = new GamePanel();
        //this.add(gp);
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null); //to center
    }
}
