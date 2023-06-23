package bt11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listNum = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNum.add((int) Math.ceil(Math.random() * 10));
        }

        int min = Collections.min(listNum);
        System.out.println("Mảng: " + listNum);
        System.out.println("Min: " + min);
    }
}
