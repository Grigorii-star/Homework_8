import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] b = {1.57, 7.654, 9.986};
        int[] c = {25, 45, 56};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] b = {1.57, 7.654, 9.986};
        int[] c = {25, 45, 56};

        for (int i = 0; i < a.length; i++) {
            if (i != 2) {
                System.out.print(a[i] + ", ");
            } else {
                System.out.println(a[i]);
            }
        }

        System.out.println(Arrays.toString(b));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c.length - 1; i++) {
            sb.append(c[i]).append(", ");
        }
        sb.append(c[c.length - 1]);
        String result = sb.toString();
        System.out.println(result);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] b = {1.57, 7.654, 9.986};
        int[] c = {25, 45, 56};

        for (int i = a.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(a[i] + ", ");
            } else {
                System.out.println(a[i]);
            }
        }
        for (int i = b.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(b[i] + ", ");
            } else {
                System.out.println(b[i]);
            }
        }
        for (int i = c.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(c[i] + ", ");
            } else {
                System.out.println(c[i]);
            }
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] a = {1, 2, 3, 4};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i] += 1;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}