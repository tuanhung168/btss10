package bt07;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listNum = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNum.add((int) Math.ceil(Math.random() * 10));
        }

        for (int i = 0; i < listNum.size(); i++) {
            if (listNum.get(i) % 2 == 0) {
                listNum.remove(i);
            }
        }
        System.out.println("Mảng không có số chắn: " + listNum);
    }
}
