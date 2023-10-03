package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {

        Runnable productA = () -> {
            System.out.println(" -- A 상품 포장 시작 -- ");
            for (int i = 1; i <= 5; i++) {
                System.out.println("A 상품 포장 " + i + "/5");
            }
            System.out.println(" -- A 상품 포장 완료 -- ");
        };

        Runnable productB = () -> {
            System.out.println(" -- B 상품 포장 시작 -- ");
            for (int i = 1; i <= 5; i++) {
                System.out.println("B 상품 포장 " + i + "/5");
            }
            System.out.println(" -- B 상품 포장 완료 -- ");
        };

        Runnable setProduct = () -> {
            System.out.println(" == 세트 상품 포장 시작 == ");
            for (int i = 1; i <= 5; i++) {
                System.out.println("세트 상품 포장 " + i + "/5");
            }
            System.out.println(" == 세트 상품 포장 완료 == ");
        };

        Thread productThreadA = new Thread(productA);
        Thread productThreadB = new Thread(productB);
        Thread setThread = new Thread(setProduct);

        productThreadA.start();
        productThreadB.start();

//        while(productThreadA.isAlive() || productThreadB.isAlive()) {
//
//        }

        try {
            productThreadA.join();
            productThreadB.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        setThread.start();
    }
}