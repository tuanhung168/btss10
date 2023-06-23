package bt01;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listNum = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNum.add((int) Math.ceil(Math.random() * 10));
        }

        int max = listNum.get(0);
        for (int i = 0; i < listNum.size(); i++) {
            if (max < listNum.get(i)) {
                max = listNum.get(i);
            }
        }
        System.out.println("Mảng: " + listNum);
        System.out.println("Max: " + max);

    }

}
