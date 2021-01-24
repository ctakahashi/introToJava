package examples.christmas;

public class Christmas {
    public static void main(String[] args) {
        nthDayOfChristmas("first");
        firstVerse();

        nthDayOfChristmas("second");
        secondVerse();

        nthDayOfChristmas("third");
        thirdVerse();

        nthDayOfChristmas("fourth");
        fourthVerse();
        
        nthDayOfChristmas("fifth");
        fifthVerse();
        
        nthDayOfChristmas("sixth");
        sixthVerse();
        
        nthDayOfChristmas("seventh");
        seventhVerse();
        
        nthDayOfChristmas("twelfth");
        twelfthVerse();
    }

    public static void nthDayOfChristmas(String dayCountStr) {
        System.out.println("On the " + dayCountStr + " of Christmas");
        System.out.println("My true love gave to me");
    }

    public static void firstVerse() {
        System.out.println("A partridge in a pear tree\n");
    }

    public static void secondVerse() {
        System.out.println("Two turtle doves");
        System.out.println("And a partridge in a pear tree\n");
    }

    public static void thirdVerse() {
        System.out.println("Three French hens,");
        secondVerse();
    }

    public static void fourthVerse() {
        System.out.println("Four calling birds,");
        thirdVerse();
    }

    public static void fifthVerse() {
        System.out.println("Five golden rings,");
        fourthVerse();
    }

    public static void sixthVerse() {
        System.out.println("Six geese a-laying,");
        fifthVerse();
    }

    public static void seventhVerse() {
        System.out.println("Seven swans a-swimming,");
        sixthVerse();
    }

    public static void eigthVerse() {
        System.out.println("Eight maids a-milking,");
        seventhVerse();
    }
    public static void ninthVerse() {
        System.out.println("Nine ladies dancing,");
        eigthVerse();
    }

    public static void tenthVerse() {
        System.out.println("Ten lords a-leaping,");
        ninthVerse();
    }

    public static void eleventhVerse() {
        System.out.println("Eleven pipers piping,");
        tenthVerse();
    }
    
    public static void twelfthVerse() {
        System.out.println("Twelve drummers drumming,");
        eleventhVerse();
    }
    
}
