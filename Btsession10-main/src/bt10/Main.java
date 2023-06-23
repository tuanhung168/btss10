package bt10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        List<Integer> listNum = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNum.add((int) Math.ceil(Math.random() * 10));
        }
        AtomicInteger sum = new AtomicInteger();
        listNum.forEach((item)->{
            sum.addAndGet(item);
        });
        System.out.println("Mảng: " + listNum);
        System.out.println(sum);
    }
}
