public class RecursiveMethod {

    public static void main(String[] args) {

        System.out.println(getFactorial(5));

    }

    static int getFactorial(int n) {
        return n == 1 ? 1 : n * getFactorial(n-1);
    }

}
