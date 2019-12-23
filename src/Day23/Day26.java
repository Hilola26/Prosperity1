package Day23;
import java.util.Arrays;
public class Day26 {
    public static void main(String[] args) {
        int[] numbers = {12, 36, 78, 56};
        numbers[1] = 36 + 1;
        System.out.println(numbers[1]);
        numbers[1] = 36 * 2;
        System.out.println(numbers[1]);
        numbers[2] = numbers[0] + numbers[1];
        System.out.println(numbers[2]);

        // int[] myHearts = {76, 3, 18, 92, 33, 54, 67};
        // System.out.println(Arrays.toString(myHearts));
        // for (int x = 0; x < myHearts.length / 2; x++) {
        ////    int temp = myHearts[1];
        //   myHearts[1] = myHearts[myHearts.length - 2];
        // /   myHearts[myHearts.length - 2] = temp;
        // }
        //  System.out.println(Arrays.toString(myHearts));


        //  String name1 = "Sherzod";
        // String name2 = "Hilola";
        //  String tempContainer = name1;
        //  name1=name2;
        //   name2=tempContainer;
        //      System.out.println(name1);
        //      System.out.println(name2);

        String survey = "Complete B15 Online 1 Month Survey";
        char[] surveyChars = survey.toCharArray();
        System.out.println(Arrays.toString(surveyChars));

        // for (int x = 0; x < survey.length(); x++) {
        //    System.out.println("each char is:"  + survey.charAt(x));
        Arrays.sort(surveyChars);
        System.out.println(Arrays.toString(surveyChars));
        int[] dumpster = {156, 187, 101, 112, 176};
        System.out.println(dumpster.length);
        String finalResult = "";
        int count = 0;
        for (int x = 0; x < dumpster.length; x++) {
            if (dumpster[x] > 100) {
                System.out.print(" " + dumpster[x]);
                count++;

            }
        }
        System.out.println("");
        System.out.println(" " + count);
        if (count == dumpster.length) {
            finalResult = "yes";
        } else {
            finalResult = "no";
        }
        System.out.println(finalResult);


        String[] marvelHeroes = {"Iron Man", "Spiderman", "Captain America", "Spiderman", "Captain Marvel",
                "Hulk", "Balck Panther", "Hulk", "Spiderman", "Black Widow", "Hulk", "Wanda"};
        System.out.println(marvelHeroes.length);
        String search = "Spiderman";
        int counter = 0;
        for (int x = 0; x < marvelHeroes.length; x++) {
            if (marvelHeroes[x].equals(search)) {
                // System.out.println(marvelHeroes[x]);
                counter++;
            }
        }
        System.out.print("  " + counter);
        System.out.println("");

        String research = "Black";
        int researcher = 0;
        for (int y = 0; y < marvelHeroes.length; y++) {
            if (marvelHeroes[y].toLowerCase().contains("black")) {
                researcher++;
            }
        }
        //   System.out.print(""+researcher);

        int nums[][] = {
                {78, 54, 100, 84},
                {33, 44, 77, 123},
                {12, 88, 52, 76},
                {67, 33, 98, 67},
                {12, 88, 52, 45},
                {98, 67, 33, 34}
        };


        for (int r = 0; r < nums.length; r++) {
            for (int t = 0; t < nums[r].length; t++) {
                System.out.print("cell" + nums[r][t] + " ");
            }
            System.out.println(" ");

            /*        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
                    double prices[] = {99.99, 150.0, 99, 250.0, 439.50, 39.99};
                    int itemIDs[] = {12345, 12346, 12347, 12348, 12349, 12350};
                    System.out.println(items.length);
                    System.out.println(prices.length);
                    System.out.println(itemIDs.length);

                    //for(int x=0;x<items.length;x++){
                    System.out.println("item count" + items.length);
                    System.out.println(items[3] + " " + "price is:  " + prices[3] + "  " + itemIDs[3]);
                    double maxPrice = prices[0];
                    int maxPriceIndex = 0;
                    for (int m = 0; m < prices.length; m++) {
                        if (maxPrice < prices[m]) {
                            maxPrice = prices[m];
                        }
                    }
                    System.out.println(maxPrice);


                    String[] fruits = {"banana", "kiwi", "strawberry", "grape", "apple","orange "};
                    for (int p = 0; p < fruits.length; p += 2) {
                        System.out.println(""  +fruits[p] +"           " +fruits[p + 1]);
                   */

            String word = "apple";

            if (word.length() % 2 == 1 && word.length() >= 4) {
                System.out.println(word.substring(word.length() / 2 - 1, word.length() / 2 + 2));
            } else {
                System.out.println("invalid");

                String sent = "H America,hi Uzbekistan";
                for (int h = 0; h < sent.length(); h++) {
                    if (sent.equals("hi")) {
                        count++;
                    }}

                        System.out.println(count);


                    }
                }
            }
        }























































































