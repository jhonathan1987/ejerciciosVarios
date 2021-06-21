package com.gm.prueba;

import java.util.ArrayList;
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
        int con = 0;
        String max = "";
        for (int j = 0; j < q.size(); j++) {
            if (j + 1 < q.size()) {
                if (q.get(j) > q.get(j + 1)) {
                    con++;
                }
            }
            if (j + 2 < q.size()) {
                if (q.get(j) > q.get(j + 2)) {
                    con++;
                }
            }
            if (j + 3 < q.size()) {
                if (q.get(j) > q.get(j + 3)) {
                    max = "Too chaotic";
                    break;
                }
            }

        }

        if (max.equals("")) {
            System.out.println(con);
        } else {
            System.out.println(max);
        }

    }
}
