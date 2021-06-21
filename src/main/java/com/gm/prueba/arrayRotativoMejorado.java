/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.prueba;

import java.util.Scanner;

/**
 *
 * @author Jhonathan
 */
public class arrayRotativoMejorado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = 5;
        int shift = 2;
        shift = shift % arrayLength; // remove cycle from shift  0
        //int array[] = new int[arrayLength];
        int returnArray[] = new int[arrayLength];
        int array[] = {1, 2, 3, 4, 5};
//        for (int i = 0; i < arrayLength; i++) {
//            array[i] = sc.nextInt();
//        }

        for (int fromStart = 0; fromStart != arrayLength; fromStart++) {
            returnArray[fromStart] = array[(shift + fromStart) % arrayLength];
            System.out.print(returnArray[fromStart] + ", ");
        }
        System.out.println("");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(returnArray[i] + " ");
        }
    }

}
