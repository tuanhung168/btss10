package bt06;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listNum = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNum.add((int) Math.ceil(Math.random() * 10));
        }

        System.out.println("Mảng trước sort: " + listNum);
        listNum.sort((o1, o2) -> o1 - o2);
        System.out.println("Mảng sau sort: " + listNum);
        // bubble sort
        for (int i = 0; i < listNum.size(); i++) {
            for (int j = i + 1; j < listNum.size(); j++) {
                if (listNum.get(i) > listNum.get(j)) {
                    int temp = listNum.get(i);
                    listNum.set(i, listNum.get(j));
                    listNum.set(j, temp);
                }
            }
        }
        // selec sort
        for (int i = 0; i < listNum.size() - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < listNum.size(); j++) {
                if (listNum.get(j) < listNum.get(min_idx)) {
                    min_idx = j;
                }
            }
            if (min_idx != i) {
                int temp = listNum.get(min_idx);
                listNum.set(min_idx, listNum.get(i));
                listNum.set(i, temp);
            }
        }
    }
}
