/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.JOptionPane;

/**
 *
 * @author Grethe
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Beregn b = new Beregn();
        b.dummyMethod(4);
        int tall = b.dummyMethod2(JOptionPane.showInputDialog("skriv inn et tall"));
        System.out.println("Tallet er: " + tall);
    }
}
