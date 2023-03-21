
package otrascosas;

public class Corazones {

    public static void main(String[] args) {
     
        int a, b, size = 15;
        for (a = size / 2; a <= size; a += 2) {
            for (b = 1; b < size - a; b += 2)
                System.out.print(" ");
            for (b = 1; b <= a; b++)
                System.out.print("*");
            for (b = 1; b <= size - a; b++)
                System.out.print(" ");
            for (b = 1; b <= a - 1; b++)
                System.out.print("*");
            System.out.println();
        }
        for (a = size; a >= 0; a--) {
            for (b = a; b < size; b++)
                System.out.print(" ");
            for (b = 1; b <= ((a * 2) - 1); b++)
                System.out.print("*");
            System.out.println();
        }
    }
}