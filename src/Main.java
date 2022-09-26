import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task_1();
        task_2();
    }

    public static void task_1() {
        System.out.println("Задание 1");
        double[] weight = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < weight.length; i++) {
            System.out.println(weight[i]);
        }
    }

    public static void task_2() {
        System.out.println("Задание 2");
        double[] weight = new double[]{1.57, 7.654, 9.986};
         {
            System.out.print(weight[0] + ", " + weight[1] +", "+ weight[2]);
        }
    }
}
