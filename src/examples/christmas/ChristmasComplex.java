package examples.christmas;

public class ChristmasComplex {
    
    static String[] lyricLines = {
        "And a partridge in a pear tree",
        "Two turtle doves.",
        "Three French hens,",
        "Four calling birds,",
        "Five golden rings,",
        "Six geese a-laying,",
        "Seven swans a-swimming,",
        "Eight maids a-milking,",
        "Nine ladies dancing,",
        "Ten lords a-leaping,",
        "Eleven pipers piping,",
        "Twelve drummers drumming,"
    };

    public static void main(String[] args) {
        System.out.println("On the " + numberToString(1) + " day of Christmas");
        System.out.println("My true love gave to me");
        System.out.println("A partridge in a pear tree\n");

        for (int i = 1; i < lyricLines.length; i++) {
            System.out.println("On the " + numberToString(i + 1) + " day of Christmas");
            System.out.println("My true love gave to me");
            for (int j = i; j >= 0; j--) {
                System.out.println(lyricLines[j]);
            }
            System.out.println();
        }
    }

    public static String numberToString(int num) {
        int firstDigit = num % 10;
        if (firstDigit == 1 && num % 100 != 11) {
            return num + "st";
        } else if (firstDigit == 2 && num % 100 != 12) {
            return num + "nd";
        } else if (firstDigit == 3 && num % 100 != 13) {
            return num + "rd";
        } else {
            return num + "th";
        }
    }

}
