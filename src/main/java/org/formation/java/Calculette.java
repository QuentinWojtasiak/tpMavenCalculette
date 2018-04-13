/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.formation.java;

import java.util.Scanner;

/**
 *
 * @author diginamic09
 */
public class Calculette {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quel est votre calcul ?");

        String chaine = sc.nextLine();
        int index1 = 0, index2 = 0, nbr1 = 0, nbr2 = 0;
            while (!chaine.substring(index1, index1 + 1).matches("[-'\'+'\'*'\'/]")) {
                index1 += 1;
                if (index1 == chaine.length() - 1) {
                    break;
                }
            }
            nbr1 = Integer.parseInt(chaine.substring(0, index1));
            index2 = index1 + 1;
            if (index2 != chaine.length() - 1) {
                while (!chaine.substring(index2, index2 + 1).matches("[-'\'+'\'*'\'/]")) {
                if (index2 == chaine.length() - 1) {
                    break;
                }
                    index2 += 1;
                }
            }
            nbr2 = Integer.parseInt(chaine.substring(index1 + 1, index2+1));
            switch (chaine.charAt(index1)) {
                case '+':
                    nbr1 += nbr2;
                    break;
                case '-':
                    nbr1 -= nbr2;
                    break;
                case '*':
                    nbr1 *= nbr2;
                    break;
                case '/':
                    nbr1 /= nbr2;
                    break;
            }
        System.out.println("Résultat : " + nbr1);
    }
}
