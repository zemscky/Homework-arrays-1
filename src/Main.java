import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task();
    }

    public static void task() {
        System.out.println("Задание 1");
        // 1
        System.out.println("Массив 1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(number[i]);
        }
        // 2
        System.out.println("Массив 2");
        double[] weights = {1.57, 7.654, 9.986};
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        // 3
        System.out.println("Массив 3");
        int[] year = {1990, 1995, 2000, 2005, 2010};
        System.out.println(year[0]);

        System.out.println("Задание 2");
// 1 метод
        System.out.println(number[0] +", "+ number[1] +", "+ number[2]);
        System.out.println(weights[0] +", "+ weights[1] +", "+ weights[2]);
        System.out.println(year[0] +", "+ year[1] +", "+ year[2]+", "+ year[3]+", "+ year[4]);
// 2 метод
        String numberToString = Arrays.toString(number);
        System.out.println(numberToString);
        String weightOfString = Arrays.toString(weights);
        System.out.println(weightOfString);
        String yearToString = Arrays.toString(year);
        System.out.println(yearToString);

        System.out.println("Задание 3");
// 1 метод
        System.out.println(number[2] +", "+ number[1] +", "+ number[0]);
        System.out.println(weights[2] +", "+ weights[1] +", "+ weights[0]);
        System.out.println(year[4] +", "+ year[3] +", "+ year[2]+", "+ year[1]+", "+ year[0]);


    }

}
