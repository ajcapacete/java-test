package com.blit.spaceship;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Sprite {
  private int dx;
  private int dy;
  protected int x;
  protected int y;
  protected int width;
  protected int height;
  protected boolean visible;
  protected Image image;

  public Sprite(int x, int y) {
    this.x = x;
    this.y = y;
    visible = true;
  }

  protected void loadImage(String imageName) {
    ImageIcon ii = new ImageIcon(imageName);
    image = ii.getImage();
  }

  public void getImageDimensions() {
    width = image.getWidth(null);
    height = image.getHeight(null);
  }

  public Image getImage() {
    return image;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }


  public boolean isVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public void keyPressed(KeyEvent e) {

    int key = e.getKeyCode();

    if (key == KeyEvent.VK_LEFT) {
      dx = -2;
    }

    if (key == KeyEvent.VK_RIGHT) {
      dx = 2;
    }

    if (key == KeyEvent.VK_UP) {
      dy = -2;
    }

    if (key == KeyEvent.VK_DOWN) {
      dy = 2;
    }
  }

  public void keyReleased(KeyEvent e) {
      
    int key = e.getKeyCode();

    if (key == KeyEvent.VK_LEFT) {
      dx = 0;
    }

    if (key == KeyEvent.VK_RIGHT) {
      dx = 0;
    }

    if (key == KeyEvent.VK_UP) {
      dy = 0;
    }

    if (key == KeyEvent.VK_DOWN) {
        dy = 0;
    }
  }
}
