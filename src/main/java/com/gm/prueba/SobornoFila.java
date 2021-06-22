package com.gm.prueba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SobornoFila {

    public static void main(String[] args) {
        List<Integer> q = new ArrayList<>();

        q.add(1);
        q.add(2);
        q.add(5);
        q.add(3);
        q.add(7);
        q.add(8);
        q.add(6);
        q.add(4);

        System.out.println(q);

        int con = 0;
        int romp = 0;
        boolean valid = true;
        for (int i = 0; i < q.size() - 1; i++) {
            for (int j = i + 1; j < q.size(); j++) {
                if (q.get(i) > q.get(j)) {
                    romp++;
                }
            }
            if (romp >= 3) {
                valid = false;
                break;
            } else {
                con = con + romp;
                romp = 0;
            }
        }
        if (valid) {
            System.out.println(con);
        } else {
            System.out.println("Too chaotic");
        }

    }
}
