package btltcqhnew;

import java.util.Random;

public class MainTest {
    public static void main(String[] args) {
        Random random = new Random();


        BtlTCQHNew1 test1 = new BtlTCQHNew1();
//        System.out.println(test1.path00(););
        for (Node node: test1.genNode90()) {
//            System.out.println(node.printNode());
        }
//        System.out.println(test1.genNode90().size());
    }
}
