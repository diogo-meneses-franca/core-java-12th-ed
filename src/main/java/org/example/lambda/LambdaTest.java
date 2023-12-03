package org.example.lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

public class LambdaTest {
    public static void main(String[] args) {
        var planets = new String[] {"Mercurio", "Venus", "Terra", "Jupiter", "Saturno", "Urano", "Netuno"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Ordanado em ordem alfabetica");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Ordenado por tamanho da palavra");
        //Note que aqui não é necessário criar nem uma classe que extends Comparator nem estanciar um objeto do tipo Comparator para fazer a ordenação.
        Arrays.sort(planets, (primeiro, segundo)-> primeiro.length() - segundo.length());
        System.out.println(Arrays.toString(planets));

        /***
         * Note que nessa implementação não é necessário criar uma classe que implementa ActionListener
         * ,basta chamar a ação q será executada quando o timer estourar o tempo.
         */
        var timer = new Timer(1000, event ->
                System.out.println("The timer is" + new Date()));
        timer.start();

        JOptionPane.showMessageDialog(null, "Fechar programa?");
        System.exit(0);
    }
}
