package Test;
public class Main {
    public static void main(String[] args) {
        // 問1 1〜10までの数字のうち偶数のみを昇順で表示させる
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("");

        // 問2 1〜10までに偶数が何個あるか、また偶数の合計は幾つになるか表示させる
        int count = 0;
        int total = 0;
        for (int i = 1; i <=10; i++) {
            if (i % 2 == 0) {
                count++;
                total += i;
            }
        }
        System.out.println("偶数の個数:" + count);
        System.out.println("偶数の合計:" + total);

        System.out.println("");

        // 問3 1〜10までの整数をカンマ区切りで横並びで表示させる（10にはカンマをつけない）
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            if (i < 10) {
                System.out.print(",");
            }
        }

        System.out.println("");

        // 問4 要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。[0]~[10]の値の奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる
        int[] array = new int[20];
        // 要素に0から5ずつ加算して代入
        for (int i = 0; i < 20; i++) {
            array[i] = i * 5;
        }

        // for (int i : array) {
        //     System.out.print(i + " ");
        // }

        // System.out.println("");

        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.print(array[i] + ",");
            }
        }

        for (int i = 11; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i]);
                if (i < 18) {
                    System.out.print(",");
                }
            }
        }
        System.out.println("");

        for (int i = 0; i < 20; i++) {
            if ((i <= 10 && i % 2 != 0) || (i >= 11 && i % 2 == 0)) {
                System.out.print(array[i]);
                if (i < 18) {
                    System.out.print(",");
                }
            }
        }

        System.out.println("");


    }
}
