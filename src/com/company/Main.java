package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) throws Exception{
        Locale.setDefault(Locale.ROOT);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }
}
