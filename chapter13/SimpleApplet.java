package main.java.com.user.javacore.chapter13;

import java.applet.Applet;
import java.awt.*;

public class SimpleApplet extends Applet {
    @Override
    public void paint(Graphics g){
        g.drawString("Простейший аплет", 20,20);
    }
}
