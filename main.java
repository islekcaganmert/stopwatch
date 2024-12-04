public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long a = 0;
        do {
            a += 1;
            System.out.println(a);
        } while (a < 100000000);
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println("Time: " + timeElapsed + " ms");
        System.out.println("Speed: " + (100000000 / (timeElapsed / 1000.0)) + " processes per second");
    }
}