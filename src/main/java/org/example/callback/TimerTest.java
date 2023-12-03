package org.example.callback;

import javax.swing.*;

public class TimerTest {
    public static void main(String[] args) {
        var listener = new TimePrinter();
        var timer  = new Timer(1000, listener);
        timer.start();

        JOptionPane.showMessageDialog(null, "Quit Program?");
        System.exit(0);
    }
}
