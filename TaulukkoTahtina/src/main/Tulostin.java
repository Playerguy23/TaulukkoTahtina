/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author joonatan
 */
public class Tulostin {
    public void tulostaTaulukkoTahtina(int[] taulu) {
        for(int i : taulu) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
