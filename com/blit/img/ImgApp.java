package com.blit.img;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class ImgApp extends JFrame {
  public ImgApp() {
    initUI();
  }

  private void initUI() {
    add(new Board());

    pack();

    setTitle("Bardejov");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
  }

  public static void main(String[] args) {
    EventQueue.invokeLater(() -> {
      ImgApp ex = new ImgApp();
      ex.setVisible(true);
    });
  }
}
