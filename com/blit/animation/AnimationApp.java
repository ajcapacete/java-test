package com.blit.animation;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class AnimationApp extends JFrame {
  public AnimationApp() {
    initUI();
  }

  private void initUI() {
    add(new Board());

    setResizable(false);
    pack();

    setTitle("Star");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    EventQueue.invokeLater(() -> {
      AnimationApp ex = new AnimationApp();
      ex.setVisible(true);
    });
  }
}