package Day23;

import java.util.Arrays;

public class DAY24 {
    public static void main(String[] args) {
     //   String[] superHeroes = {"Superman", "Batman", "Wonder Woman"};
      //  System.out.println(Arrays.toString(superHeroes));
      //  String superHerosAsString = Arrays.toString(superHeroes);
      //  System.out.println(superHerosAsString);
      //  System.out.println(superHerosAsString.charAt(0));
     //   System.out.println("---------------------------");
      //  int[] numbers = {10, 44, 55, 3, 78};
     //   System.out.println(Arrays.toString(numbers));
     //   double[] prices = {12.5,6.8,2.3};
        //  System.out.println(prices[]);
      //  String priceString = Arrays.toString(prices);
     ////   for (int x = 0; x < Arrays.toString(prices).length(); x++) {
      //      System.out.println(Arrays.toString(prices));
       // }

int[]scores={99,44,66,23,19,55};
        System.out.println(Arrays.toString(scores));
Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

char[] nameChars={'G','A','D','Z','C','A'};
        System.out.println(Arrays.toString(nameChars));
Arrays.sort(nameChars);
        System.out.println(Arrays.toString(nameChars));
        System.out.println("-------------------");
String[]superHero={"Superman","Batman","Wonder Woman","Aquaman"};
        System.out.println(Arrays.toString(superHero));
Arrays.sort(superHero);
        System.out.println(Arrays.toString(superHero));
        System.out.println("----------------------------------");


   int[]scores1={2,5,6,7,3,34,6};
   int[] scores2={22,45,6,37,3,6,9};
   int[]scores3={2,5,6,7,3,34,6};
    int[] scores4={5,6,7,2,3,6,34}  ;
        System.out.println(scores1==scores2);
        System.out.println(scores1==scores3);
    boolean isS1S2Equals=Arrays.equals(scores1,scores2);
        System.out.println(isS1S2Equals);

boolean isS1S3Equals=Arrays.equals(scores1,scores3);
        System.out.println(isS1S3Equals);

   Arrays.sort(scores3);
   Arrays.sort(scores4);
     boolean equality=Arrays.equals(scores3,scores4) ;
        System.out.println(equality);

    }
}