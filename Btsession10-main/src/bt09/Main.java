package bt09;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listNum = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNum.add((int) Math.ceil(Math.random() * 10));
        }
        System.out.println("Mảng trước: " + listNum);
        for (int i = 0; i < listNum.size(); i++) {
            for (int j = i+1; j < listNum.size(); j++) {
                if (listNum.get(i) == listNum.get(j)) {
                    listNum.remove(j);
                }
            }
        }
        System.out.println("Mảng sau: " + listNum);
    }
}
