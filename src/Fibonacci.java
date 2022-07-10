public class Fibonacci {

    public static void main(String[] args) {

        for (int i=0; i<8; i++) {
            System.out.println(fibonacci(i));
        }

    }

    static int fibonacci(int n) {
        if (n < 2) {
            return 1;
        } else {
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }

}