package ua.org.game;

import javax.swing.*;

public class Main {
    private static final int WIDTH = 410;
    private static final int HEIGHT = 340;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        GameFrame gameFrame = new GameFrame();
        frame.add(gameFrame);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.addKeyListener(gameFrame.getController());
    }
}
