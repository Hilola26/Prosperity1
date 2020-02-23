import java.util.Arrays;

public class Amazon {
    public static void main(String[] args) {

        //  int voteAge = 110;
        // if (voteAge > 18 && voteAge < 65) {
        //     System.out.println("you have the right to vote");
        // } else {
        //    if (voteAge <= 17) {
        //      System.out.println("you still young");


        //  } else {
        //     System.out.println("too old");


        //String memberType = "Prime member";
        //  double amount = 15.99;
        // int shippingFee = 0;

        //     boolean wantShop = false;
        //   String preferance = "online";
        // if(wantShop==true){
        //   if(preferance.equals("Store")) {
        //        System.out.println("shop in the store");
        // }else {
        //       System.out.println("shop online");

        //     }
        //  if(preferance.equals("Online"));

        //   }else{
        //     System.out.println("stay at home");


        //  String str1 = "I like Pumpkin";
        //      System.out.println(str1.equals("Pumpkin"));
        //      System.out.println(str1.contains("like"));

        //   boolean gotPumpkin = str1.contains("Pumpkin");
        //       System.out.println(gotPumpkin);
        //String name = "Hilola";
        //   boolean start = str1.startsWith("H");
        //         System.out.println(str1.startsWith("H"));

        //  boolean end =str1.endsWith("Pumpkin");
        //       System.out.println(str1.endsWith("Pumpkin"));


        String name = " Java";
        System.out.println(" " + name.charAt(0));
        System.out.println(name.charAt(1) + "   " +
                "");
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));

        //String name2 = "Victoria Secrets";
        //  System.out.println(name2.lastIndexOf("Vi"));
        //  System.out.println(name2.lastIndexOf("S"));
        //   System.out.println(name2.lastIndexOf(" "));
        // System.out.println(name2.lastIndexOf("s"));

        //   String message = "   Repl is coming  ";
        //     System.out.println(message);
        //      System.out.println(message.length());
        //  message = message.trim() ;
        //    System.out.println(message);
        //  System.out.println(message.length());
        String nickname = "Lola";
        System.out.print(nickname.charAt(3) + "  ");
        System.out.print(nickname.charAt(2) + "  ");
        System.out.print(nickname.charAt(1) + "  ");
        System.out.print(nickname.charAt(0) + "  ");
        // System.out.print(     name.charAt(4)    + "  "       );
        System.out.println("-------------------------");
        System.out.println(name.charAt(3) + "  " + name.charAt(2) + "" + name.charAt(1) + "" + name.charAt(0));

        String employee = "Philipa Salthouse[Electical Engeneer]psalthouse0@g.co";

        String title = employee.substring(employee.indexOf("[") + 1, employee.indexOf("]"));
        System.out.println(title);
        String fullName = employee.substring(0, employee.indexOf("["));
        System.out.println(fullName);
        String fullDash = fullName.replace(" ", " - ");
        System.out.println(fullDash);
        System.out.println(fullDash + " " + title);
        System.out.println(fullName.charAt(0) + " " +
                fullName.charAt(fullName.lastIndexOf(" ") + 1) + "->+" +
                "" + title);

      /*  String car[] = {"Acura-NS", "Chevrolet Corvette",
                "Chevrolet-Cavalier", "BMW-M3 ", "Pontiac-LeMans", "BMW-M7 ",
                "OldsmobilArchieva", "Honda-Civic"};
        int Chev = 0;
        int BMW = 0;
        for (int x = 0; x < car.length; x++) {
            if (car[x].toUpperCase().contains("CHEVROLET")) {
                Chev++;
            }
            if (car[x].toLowerCase().startsWith("bmw")) {
                BMW++;
            }
        }
        System.out.println(Chev);
        System.out.println(BMW);

        //   for(int x=0;x<car.length;x++){
        //  if(car[x].contains("Civic")) {
        //     System.out.println(x);
        String eachCar = "Pontiac-LeMans";
        String[] ecSplit = eachCar.split("-");
        System.out.println(ecSplit[0] + "   " + ecSplit[1]);
        for (int x = 0; x < car.length; x++) {
            if (car[x].startsWith("BMW"))
                System.out.println(car[x]);
         */
        System.out.println("==========car model has 2char");


        System.out.println();
        String cars[] = {"Acura-NS", "Chevrolet-Cavalier", "BMW-M3", "Pontiac-LeMans", "BMW-M7", "Honda-Civic"};
        int counter = 0;
        String splitter[] = new String[cars.length];
        for (int x = 0; x < cars.length; x++) {
            splitter = cars[x].split("-");
            //System.out.println(Arrays.toString(splitter));
        if(splitter.length==2&&splitter[1].length()==2){
            System.out.println(Arrays.toString(splitter));
       counter++;
        }

    }
        System.out.println(counter);
    String renew[]={"Chevrolet Blazer","FordSport","Ford Edge","Toyota 4Runner","Toyota Avalon","Toyota C-HR",
                    "Mazda Mazda6","Mazda MX-5 Miata","Mercedes-Benz GT","Mercedes-Benz CLS-Class","Toyota Corolla Hybrid",
                     "Toyota Supra","Toyota Highlander" };
           int order=0;
     for(int y=0;y<renew.length;y++){
         if(renew[y].contains("Toyota")){
             System.out.println(renew[y]);
order++;
         }}
        System.out.println(order);

    //       int[] numbers=new int[6];
 //   numbers+="Toyota";















    }








    }












