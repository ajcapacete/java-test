package com.blit.donut;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class DonutApp extends JFrame {
  public DonutApp() {
    initUI();
  }

  private void initUI() {
    add(new Board());

    setSize(330, 330);

    setTitle("Donut");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
  }

  public static void main(String[] args) {
    EventQueue.invokeLater(() -> {
      DonutApp ex = new DonutApp();
      ex.setVisible(true);
    });
  }
}