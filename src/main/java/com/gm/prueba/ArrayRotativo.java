package com.gm.prueba;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ArrayRotativo {

    public static void main(String[] args) {
        //   int a[] = {1, 2, 3, 4, 5};

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

//        for (int i = 0; i < a.length; i++) {
//            System.out.print("[" + a[i] + "]");
//        }
//        System.out.println("");
//        aux = a[0];
//        a[0] = a[1];
//        a[1] = a[2];
//        a[2] = a[3];
//        a[3] = a[4];
//        a[4] = aux;
        int r = 0;

        int aux = 0;

        for (int k = 0; k < 7; k++) {
            for (int i = 0; i < a.size(); i++) {
                if (i == 0) {
                    aux = a.get(i);

                }
                for (int j = i + 1; j == i + 1; j++) {

                    if (i == (a.size() - 1)) {
                        a.set(i, aux);
                    } else {
                        a.set(i, a.get(j));
                    }

                }

            }
        }

        System.out.println(a);

    }

}
