package com.company;

import javax.swing.*;

public class FrameMain extends JFrame {
    public FrameMain(){
        PanelDraw panel = new PanelDraw();
        this.add(panel);
        this.setSize(700,700);
        this.setTitle("Primitives");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
