package fizzbuzz;

public class Main {
    public static void main(String[] args) {
        int n = 100; // 表示する整数の上限値
        int numBuzz = 3;
        int numFizz = 5;

        for (int i = 1; i <= n; i++) {
            if (i % numBuzz == 0 && i % numFizz == 0) {
                System.out.println("FizzBuzz");
            } else if (i % numBuzz == 0) {
                System.out.println("Fizz");
            } else if (i % numFizz == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
