package FishSurvivalScreen;

import java.awt.*;
import java.awt.event.*;

public abstract class Screen {
    private String nameScreen;
    public void draw(Graphics g){}
    public void update(){}
    public void handleInput(KeyEvent e){}
}
