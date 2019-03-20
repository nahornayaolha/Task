import java.util.Scanner;

public class MyClass {
    private static void write(int size) {
        for (int i = size; i > 0; i--) {
            for (int k = 1; k <= size; k++) {
                System.out.print(i * (i - 1) + k + " ");
            }
            System.out.println();
     }
    }

    public static void main(String[] args) {
        System.out.println("Please choose size:");
        Scanner sc = new Scanner(System.in);
        MyClass.write(sc.nextInt());
    }
}
