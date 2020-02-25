import java.util.Arrays;

public class ThanksgivingDay {
    public static void main(String[] arg) {

        // int start = 15;
        //  int end = 15;
        //    if (start < end) {
        // while (start <= end) {
        //    System.out.print(" "  +  start);
        //     ++start;

        // for(int x = start; x <= end; x++) {
        //      System.out.print(" " +  x);
        //  }

        // }else if(start>end) {
        //    for (int y = start; y>=end; y--){
        //        System.out.print("  "+y);
        //    }
        // }  else{
        //     System.out.print("no action,the same speed)
        //  String star = "";
        //  for (int x = 1; x <= 50; ++x) {
        //     star += "*" ;
        //      System.out.println(star);

        //  char fax='A';
        //  for (fax='A';fax<='Z';++fax){
        //      System.out.print("  " +fax);

        // char ten='z';
        //  for(  ten='z';ten>='a';ten--){
        //     System.out.print(" " + ten);

        // String line="";
        //  for( char pet='A';pet<='Z';++pet){
        //       line  += pet;
        //        System.out.println(line);


        //   String phase="";
        //  for(int y=1;y<=20;++y){
        //  phase+=" @";
        // System.out.println(phase);
        // String name = "Akmalbek";
        //    int counter=0;
        // System.out.println(name.charAt(index)=='a');

        // for (int index = 0; index < name.length(); index++) {
        //    System.out.print(name.charAt(index));
        //  if (name.charAt(index) == 'a') {
        // System.out.println("bingo");


        // String name1="Z A" ;
        //  for(char pig=0;pig>name1.length();pig--)
        //     System.out.println(name1.substring(pig));


        // String sent="";
//for(char pool='A';pool<='M';++pool){
//    sent+=pool;
        //   System.out.println(sent);

        // String phrase="";

        //  for(int step=1;step<=50;++step){
        //    phrase+="!";
        //  System.out.println(phrase)
        //   String url="www.gabrielbrothers.com";
        //  int firstDotIndex=url.indexOf(".");
        //  System.out.println(firstDotIndex);
        // int lastDotIndex=url.lastIndexOf(".");
        //  System.out.println(lastDotIndex);
        //  System.out.println(url.substring(firstDotIndex+1,lastDotIndex));
        // String word = "abc";
        //   int charCount = word.length();
        //  if (charCount == 1) {
        //     System.out.println(word + word + word);

        //  } else if (charCount == 2) {
        //      System.out.println(word + word);
        //      if (charCount % 2 == 1) {
        //      System.out.println(word.charAt(charCount / 2));
        //  } else {
        //      int indexOfFirsthalf = charCount / 2 - 1;
        //     int indexOfSecondhalf = charCount / 2;

        //   for(char lucky='d';lucky >='a';--lucky){
        //System.out.print("   "+lucky);

        //  String name="Sherzod Abdukhalikov";
        //     int x=0;

        //     for(x=name.length()-1;x>=0;--x){
        //      System.out.print( "  "  +name.charAt(x));
//

        //  String name = "My name is Hilola Abdukhalikova";
        //  for (int x = 0; x <= name.length() - 1; x++) {
        //     if (name.substring(x, x + 1).equalsIgnoreCase("a")) {
        //       System.out.print("index is:" +x);
        //       System.out.println(" " +name.substring(x,x+1));


        //   for (int y = 1; y <= 10; y++) {
//      //      break;

        //   }
        // int sum = 0;
        //for (int x = 1; x <= 10; x++) {
        //  sum += x;
        //  System.out.println(sum);
        // if (sum +x>= 35) {
        //     break;

        //   String name = "Nodirbek";
        //   for (int x = 0; x <= name.length() - 1; x++) {
        //       if (name.substring(x, x + 1).equalsIgnoreCase("b")) {
        //          break;
        //     }
        //    System.out.print(" "+name.substring(x, x + 1));

        // for(int x=20;x<=100;x++){
        // if(x%20==0){
        //    System.out.println("skipping"+x);
        // continue;
        //  }
        //      System.out.println("  "  +x);

       //  String line="";
      //  for (int z = 1; z <= 100; z++) {
       //     System.out.print(z);
       //     String line1="*";
       //     for (int x = 1; x <=z; x++) {
       //         System.out.print("  @ ");
       //     }
        //    System.out.println();
       // }
String word="I love amasing java";
String sent[]=word.split(" ");
        System.out.println(Arrays.toString(sent));
String longest=sent[0];
for(int x=0;x<sent.length;x++) {
    if (longest.length() <= sent.length) {
        longest = sent[x];
    }}
        System.out.println(longest);
    }
}


















