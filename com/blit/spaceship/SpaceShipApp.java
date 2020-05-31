package com.blit.spaceship;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SpaceShipApp extends JFrame {
  public SpaceShipApp() {
    initUI();
  }

  private void initUI() {
    add(new Board());

    setSize(400, 400);
    setResizable(false);

    setTitle("Shooting Missles");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    EventQueue.invokeLater(() -> {
      SpaceShipApp ex = new SpaceShipApp();
      ex.setVisible(true);
    });
  }
}