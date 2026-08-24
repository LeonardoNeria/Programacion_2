/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.for_tablas_multiplicar;

/**
 *
 * @author leo
 */
public class For_tablas_multiplicar {

    public static void main(String[] args) {
        for (int p = 1; p<=10; p++) {
            for (int i = p, x=1; i<= p*10; i+=p, x++) {
                System.out.println(p+ " X " + (i/p) + " = " + +i);
            }
            System.out.println("\n");
        }}
}
