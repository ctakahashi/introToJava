package PA_1;

public class FirstAssignment {
    
    public static void main(String[] args) {
        printFahrToCel(32);
        printFahrToCel(212);
        printFahrToCel(97.6);

    }

    public static void printFahrToCel(double x) {
        System.out.println(x + "F is " + (int)((x - 32) * 5 / 9));
    }
}
