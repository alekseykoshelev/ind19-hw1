import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        double[] arr2 = new double[]{1.57, 7.654, 9.986};

        boolean[] arr3 = {true, false, false};

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i != arr1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            if (i < arr2.length - 1) {
                System.out.print(arr2[i] + ", ");
            } else {
                System.out.print(arr2[i]);
            }
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < arr3.length; i++) {
            if (i < arr3.length - 1) {
                System.out.print(arr3[i] + ", ");
                continue;
            }
            System.out.print(arr3[i]);
        }
        System.out.println();
        System.out.println();

        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i == 0) {
                break;
            }
            System.out.print(", ");
        }
        System.out.println();
        System.out.println();

        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr3[i]);
            } else {
                System.out.print(arr3[i] + ", ");
            }
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                arr1[i]++;
            }
        }
        System.out.println(Arrays.toString(arr1));

        for (var element : arr1) {
            System.out.println(element);
        }
    }
}
