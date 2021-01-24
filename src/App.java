import java.util.Scanner;
import examples.christmas.Christmas;
import examples.car.Car;

public class App {

    public static void main(String[] args) {
        // printBox();
        // printBox();
        long a = '1';
        System.out.println('a' + 2.0);
        System.out.println((int) 3.13);
        System.out.println(a);
        int b = 1, c = 1, d = 1, e = 1;
        System.out.println(++b + ++b);  // 2 + 3 
        System.out.println(c++ + ++c); // 1 + 3
        System.out.println(++d + d++); // 2 + 2
        System.out.println(e++ + e++); // 1 + 2
        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
        }


    }

    public static void printBox() {
        printHorizontalLine("hello");
        printEmptyLine();
        printEmptyLine();
        printHorizontalLine("world");
    }

    public static void printHorizontalLine(String myString) {
        System.out.println("+------+" + myString);
    }

    public static void printEmptyLine() {
        System.out.println("|      |");
    }


    public static void forLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
    
}

