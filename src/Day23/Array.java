package Day23;



import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int series[] = {4, 5, 6, 7, 8};
        String[] words = {"Superman", "Batman", "Wonder Woman"};
        System.out.println(Arrays.toString(words));
        String savingWords = Arrays.toString(words);
        System.out.println(Arrays.toString(words));
        System.out.println(savingWords.charAt(0));
        int[] numbers = {10, 44, 55, 3, 78};
        System.out.println(Arrays.toString(numbers));
        double[] prices = {1.3, 5.6, 7.8};
        System.out.println(Arrays.toString(prices));
        // String priceString = Arrays.toString(prices);
        // System.out.println(priceString);
        //  for (int x = 0; x < priceString.length(); x++) {
        // System.out.println( "character index "+ x +"is:"  + "   "  + priceString.charAt(x));
        int[] scores = {99, 44, 66, 23, 19, 55};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        char[] name = {'B', 'A', 'S', 'G'};
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));
        String[] sent = {"Batman", "Superman", "Wonder Woman", "Aquaman"};
        Arrays.sort(sent);
        System.out.println(Arrays.toString(sent));

        String[] qoutes = {"Gabriel brothers", "Victoria Secrets", "Chanel"};
        System.out.println(Arrays.toString(qoutes));

        int[] fax = {12, 36, 78, 55, 42};
        String phases = Arrays.toString(fax);
        System.out.println(phases);
        //for(int x=0;x<phases.legth();x++){
        // System.out.println("the index of" + x+"is:  "+phases.charAt(x));
        int[] adults = {56, 21, 61, 45, 112};
        String students = Arrays.toString(adults);
        System.out.println("before  " + students);
        Arrays.sort(adults);
        System.out.println("after  " + Arrays.toString(adults));
        char[] funny = {'n', 'G', 'F', 'r', 'Y'};
        Arrays.sort(funny);
        System.out.println("" + Arrays.toString(funny) + " ");
        int[] summary1 = {5, 4, 8, 10};
        int[] summary2 = {8, 19, 20, 34};
        int[] summary3 = {5, 4, 8, 10};
        int[] summary4 = {8, 10, 4, 5};
        System.out.println(summary1 == summary2);
        System.out.println(summary1 == summary3);
        boolean equalsS1S2 = Arrays.equals(summary1, summary2);
        System.out.println(equalsS1S2);
        boolean equalsS1S3 = Arrays.equals(summary1, summary3);
        System.out.println(equalsS1S3);
        boolean equalsS3S4 = Arrays.equals(summary3, summary4);
        System.out.println(equalsS3S4);

        //   Arrays.sort(summary3);
        //    Arrays.sort(summary4);
        // equalsS3S4 = Arrays.equals(summary3, summary4);
        //   System.out.println(equalsS3S4);

        //  String[] word = {"complicated", "difficult", "beautiful", "fascinated"};
        //  String longest = word[0];
        // for (String repeat : word) {
        //   if (repeat.length() > longest.length()) {
        //      repeat = longest;
        //  }

        //  }
        // System.out.println(longest);


        //  String[] fruits = new String[]{"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        //   for (int x = 0; x < fruits.length; x++) {
        //      String last3=fruits[x].substring(fruits[x].length() - 3)  ,fruits[x].length);
        //     System.out.println(last3);
        // String allItems = Arrays.toString(fruits);
        //  System.out.print(allItems);
        //  }

        //  float pumpkin []= new float[]{1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};
        // for(int x=0;x<pumpkin.length;x++) {
        //   System.out.print("  "+pumpkin[x]);


        //String sentance="I understand Java";
        //  String[]phrase=sentance.split("");
        //      System.out.println(Arrays.toString(phrase));
        //  String longest="";
        //  for(int x=0;x<phrase.length;x++) {
        //   if (phrase[x].length() > longest.length()) longest = phrase

        String sentance = "I understand Java";
        String[] allWords = sentance.split("");
        System.out.println(Arrays.toString(allWords));

        String hero = "John-Federal Kennedy";
        String splitHero[] = hero.split("-");
        System.out.println(Arrays.toString(splitHero));
        System.out.println(splitHero.length);
        String firstName = splitHero[0];
        String fullName = splitHero[1];
        String stars = "";

        for (int x = 0; x <= fullName.length(); x++) {
            stars += "*";
        }
        System.out.println(firstName + "-" + stars);


        String nick = "Hilola-Abdukhalikova S Mukhamedova";
        String nickName[] = nick.split("-");
        System.out.println(Arrays.toString(nickName));
        String firstname = nickName[0];
        String lastname = nickName[1];
        String starts = "";

        for (int h = 0; h < lastname.length(); h++) {
            starts += "*";
        }
        System.out.println(firstname + starts);
        System.out.println("=============");


        String s1 = "abc";
        String s2 = "cba";
        char arr1[] = s1.toCharArray();//[a,b,c]
        char arr2[] = s2.toCharArray();//[c,b,a]
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println();
        String str1 = "aaabbaaccbbdd";
        String str2 = "";
        for (int i = 0; i < str1.length(); i++) {
            String eachChar = "" + str1.charAt(i);
            if (!str2.contains(eachChar)) {
                str2 += eachChar;
            }
        }
        System.out.println(str2);
        String fiveMinutes = "abccddeeffa";
        String names[] = fiveMinutes.split("");
        String result = "";
        for (int x = 0; x < names.length; x++) {
            if (!result.contains(names[x])) {
                result += names[x];
            }
        }
        System.out.println(result);

        //for(int y=1;y<=5;y++){
        ///for(int x=1;x>=5;x++) {
        //  System.out.print("*");
        int matches = 0;
        int a[] = {1, 2, 3, 4, 3, 7, 2, 2, 3, 3, 5, 2, 2, 3};
        for (int d = 0; d < a.length; d++) {
            for (int z = d + 1; z < a.length - 1; z++) {
                if (a[d] == a[z]) {
                    matches++;
                }
            }
        }
        System.out.print(matches);


    }

    public static int[] addInt(int[] series, int newInt) {
        int[] newSeries = new int[series.length + 1];
        for (int i = 0; i < series.length; i++) {
            newSeries[i] = series[i];
        }
        newSeries[newSeries.length - 1] = newInt;
        return newSeries;

    }}













































