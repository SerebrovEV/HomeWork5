public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        // task1
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        float[] drobi = {1.57f, 7.654f, 9.986f};
        int[] days = new int[5];
        days[0] = 10;
        days[1] = 12;
        days[2] = 17;
        days[3] = 15;
        days[4] = 14;
        // task2
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < drobi.length; i++) {
            if (i < drobi.length - 1) {
                System.out.print(drobi[i] + ", ");
            } else {
                System.out.print(drobi[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < days.length; i++) {
            if (i < days.length - 1) {
                System.out.print(days[i] + ", ");
            } else {
                System.out.print(days[i] + " ");
            }
        }
        System.out.println();
        // task3
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i] + "");
            }
        }
        System.out.println();
        for (int i = drobi.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(drobi[i] + ", ");
            } else {
                System.out.print(drobi[i] + "");
            }
        }
        System.out.println();
        for (int i = days.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(days[i] + ", ");
            } else {
                System.out.print(days[i] + "");
            }
        }
        System.out.println();
        //  task 4
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 > 0) {
                numbers[i] = numbers[i] + 1;
            }
            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}