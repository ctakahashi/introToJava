package examples.scanner;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {
        // Scanner userInput = new Scanner(System.in);
        // System.out.println("Give me a number:");
        // int a = userInput.nextInt();
        // System.out.println("Give me a double:");
        // double b = userInput.nextDouble();
        // System.out.println("Thanks for giving me " + a);
        // System.out.println("Thanks for giving me " + b);
        // System.out.println("Give me a String:");
        // String c = userInput.nextLine();

        // System.out.println("Thanks for giving me " + c);
        /*
         * 
         * input1: 3 input2: 10 input3: 1 4 4.0 31
         * 
         */

        // String s = new String();
        // testInputs(userInput);

        // userInput.close();

        printGoogle();

    }

    public static void printGoogle() {
        Scanner google;
        try {
            google = new Scanner(new URL("https://www.google.com/").openStream());
            while (google.hasNextLine()) {
                String line = google.nextLine();
                System.out.println(line + "\n\n");
            }
            google.close();    
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void printYoutubeViewCount() {
        try {
            Scanner youtube = new Scanner(new URL("https://www.youtube.com/watch?v=LcQYXCTAGh8").openStream());
            int counter = 0;
            // e,"viewCount":"488066
            // int viewCount = 0;
            while (youtube.hasNextLine()) {
                String line = youtube.nextLine();
                String viewCountStr = "\"viewCount\":\"";

                if (line.contains(viewCountStr)) {
                    int viewCountFirstIndex = line.indexOf(viewCountStr);
                    String subline = line.substring(viewCountFirstIndex);
                    subline = subline.substring(13);
                    int endOfViewCount = subline.indexOf("\"");
                    System.out.println(subline.substring(0, endOfViewCount));
                }
            }

            // System.out.println(counter + " lines on this site");
            youtube.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }





    public static void testInputs(Scanner userInput) {
        System.out.print("Input1:");
        int myInt = userInput.nextInt();
        System.out.print("Input2:");
        double myDouble = userInput.nextDouble();
        System.out.print("Input3:");
        userInput.nextLine();
        String myStr = userInput.nextLine();
        System.out.println(myInt + 1);
        System.out.println(myDouble + 1);
        System.out.println(myStr + 1);
    }
}
