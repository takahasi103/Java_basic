package fizzbuzz;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        int n = 100; // 表示する整数の上限値
        int numBuzz = 3;
        int numFizz = 5;

        // for (int i = 1; i <= n; i++) {
        //     if (i % numBuzz == 0 && i % numFizz == 0) {
        //         System.out.println("FizzBuzz");
        //     } else if (i % numBuzz == 0) {
        //         System.out.println("Fizz");
        //     } else if (i % numFizz == 0) {
        //         System.out.println("Buzz");
        //     } else {
        //         System.out.println(i);
        //     }
        // }

        ArrayList<Integer> FizzBuzz = new ArrayList<Integer>();
        ArrayList<Integer> Fizz = new ArrayList<Integer>();
        ArrayList<Integer> Buzz = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++) {
            if (i % numBuzz == 0 && i % numFizz == 0) {
                FizzBuzz.add(i);
            } else if (i % numBuzz == 0) {
                Buzz.add(i);
            } else if (i % numFizz == 0) {
                Fizz.add(i);
            } else {
                continue;
            }
        }
        System.out.println("FizzBuzz");
        System.out.println(FizzBuzz);
        System.out.println("");

        System.out.println("Buzz");
        System.out.println(Buzz);
        System.out.println("");

        System.out.println("Fizz");
        System.out.println(Fizz);
        System.out.println("");
    }
}
