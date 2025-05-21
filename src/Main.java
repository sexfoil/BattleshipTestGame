import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<MyTestGC> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            MyTestGC myTestGC = new MyTestGC(i);
            System.out.println("Created " + i);
//            System.gc();
//            list.add(myTestGC);
        }

//        System.gc();

        long start = System.currentTimeMillis();
        long secononds = 0L;
        while (true) {
            long time = System.currentTimeMillis();
            long delta = time - start;

            if (delta > 5000) {
                start = time;
                secononds += 5;
                System.out.println(secononds + " sec");
            }
        }
    }
}