package bt03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listNum = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNum.add((int) Math.ceil(Math.random() * 10));
        }

        System.out.println("Mảng trước sort: " + listNum);
        listNum.sort((o1, o2) -> o2 - o1);
        System.out.println("Mảng sau sort: " + listNum);
    }
}
