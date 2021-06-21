/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.prueba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jhonathan
 */
public class EjercicioDeZ {

    public static void main(String[] args) {
        int arr[][] = {
            {-9, -9, -9, 1, 1, 1},
            {0, -9, 0, 4, 3, 2},
            {-9, -9, -9, 1, 2, 3},
            {0, 0, 8, 6, 6, 0},
            {0, 0, 0, -2, 0, 0},
            {0, 0, 1, 2, 4, 0}
        };

        int arr2[][] = new int[4][4];

        int suma = 0;
        int filaIni = 0;
        int filaFinal = 3;
        int filaNoSuma = 1;
        int columnIni = 0;
        int columnFinal = 3;
        int columnNosuma = 0;
        int columnNosuma2 = 2;

        for (int k = 0; k < 16; k++) {

            for (int i = filaIni; i < filaFinal; i++) {
                for (int j = columnIni; j < columnFinal; j++) {
                    if (i == filaNoSuma && j == columnNosuma || i == filaNoSuma && j == columnNosuma2) {
                        System.out.print("[ ]");
                        continue;
                    }
                    System.out.print("[" + arr[i][j] + "]");
                    suma = suma + arr[i][j];
                    arr2[filaIni][columnIni] = suma;

                }

                System.out.println("");
            }
            suma = 0;
            columnIni++;
            columnFinal++;
            columnNosuma++;
            columnNosuma2++;
            System.out.println("");
            if (columnFinal > 6) {
                filaIni++;
                filaFinal++;
                columnIni = 0;
                columnFinal = 3;
                filaNoSuma++;
                columnNosuma = 0;
                columnNosuma2 = 2;
            }

        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print("[" + arr2[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        int mayor = arr2[0][0];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[i][j] > mayor) {
                    mayor = arr2[i][j];
                }

            }

        }
        System.out.print("[" + mayor + "]");

    }

}
