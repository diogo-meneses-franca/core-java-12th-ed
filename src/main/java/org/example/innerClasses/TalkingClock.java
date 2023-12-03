package org.example.innerClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * Um timer
 */
public class TalkingClock {
    private int intervalo;
    private boolean beep;

    public TalkingClock(int intervalo, boolean beep){
        this.intervalo = intervalo;
        this.beep = beep;
    }

    /**
     * Inicia o timer.
     */
    public void iniciar(){
        //Aqui o metodo da outer class instancia um objeto da inner class
        var listener  = new TimerPrinter();
        var timer = new Timer(intervalo, listener);
        timer.start();
    }

    /**
     * Uma Inner Class.
     */
    public class TimerPrinter implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Nesse momento a hora é" + Instant.ofEpochMilli(e.getWhen()));
            //Aqui a inner class acessa o atributo beep da outer class mesmo ele sendo private e sem método acessor.
            if(beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}
