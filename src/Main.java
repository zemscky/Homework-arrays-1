import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        task_1();
        task_2();
    }

    public static void task_1 () {
        System.out.println("Задание 1");
        System.out.println("Массив 1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        System.out.println("Массив 2");
        double[] weights = {1.57, 7.654, 9.986}; // 2 массив
        System.out.println("Массив 3");
        int[] year = {1990, 1995, 2000, 2005, 2010}; // 3 массив

        System.out.println("Задание 2");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number [i]);
            if (i != number.length -1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights [i]);
            if (i != weights.length -1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < year.length; i++) {
            System.out.print(year [i]);
            if (i != year.length -1){
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задание 3");

        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number [i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }System.out.println();
        for (int i = weights.length - 1; i >= 0; i--) {
            System.out.print(weights [i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }System.out.println();
        for (int i = year.length - 1; i >= 0; i--) {
            System.out.print(year [i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }System.out.println();
    }
    public static void task_2() {
        System.out.println("Задание 4");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                number[i] += 1;
            }

        }
        System.out.println(Arrays.toString(number));
    }
}


