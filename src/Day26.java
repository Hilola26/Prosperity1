import java.util.Arrays;

public class Day26 {
    public static void main(String[] args) {
        // int[] num = {100, 78, 325, 35, 678};
        // int max = num[0];
        //  for (int x = 0; x < num.length; x++) {
        //      if (max < num[x]) {
        //            max = num[x];
        //        }
        //    }
        //     System.out.println(max);

        //      int secMax = num[0];
        //      for (int x = 0; x < num.length; x++) {
        //        if (num[x] == max) {
        //            continue;
        //       }
        //      if (secMax < num[x]) {
        //          secMax = num[x];
        //      }
        //   }
        //   System.out.println(secMax);


      /*   int[] arr1D = {1, 2, 3};
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};
          System.out.println(arr2D.length);
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(arr2D[0][2]);
        System.out.println(arr2D[1][1]);
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(Arrays.deepToString(arr2D));


     String[][] names={{"Hilola","Sherzod"},{"Hasan","Tatyana"}};
      names[1][1]="Dilshot";
        System.out.println(names[1][1]);
       */ //System.out.println(Arrays.toString(names[1]));
        // System.out.println(Arrays.deepToString(names));

        // int[][] number = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //  System.out.println(Arrays.toString(number[0]));
        //  System.out.println(Arrays.toString(number[1]));
        //  System.out.println(Arrays.toString(number[2]));
        //   System.out.println();

        //  for (int i = 0; i < number.length; i++) {
        //       for (int y = 0; y < number[i].length; y++) {
        //          if (number[i][y] % 2 != 0) {
        //              continue;
        //          }
        //          System.out.print("" + number[i][y] + "  ");

        //      }
        //   }
        //   System.out.println();


        int sourses[][] = {{12, 11, 10, 13256, 19}, {9, 20, 35, 15}};

        int fax = sourses[0][0];
        for (int z = 0; z < sourses.length; z++) {
            for (int d = 0; d < sourses[z].length; d++) {
                if (fax < sourses[z][d]) {
                    fax = sourses[z][d];
                }
            }
        }
        System.out.println(fax);


        int min = sourses[0][0];
        for (int z = 0; z < sourses.length; z++) {
            for (int l = 0; l < sourses[z].length; l++) {
                if (min > sourses[z][l]) {
                    min = sourses[z][l];
                }
            }
        }
        System.out.println(min);
        System.out.println("==================");
        String developersTeam[] = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String testersTeam[] = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
        String businessAnalystsTeam[] = {"Lisa", "Ershad", "Nalia"};
        String scrumTeam[][] = {developersTeam, testersTeam, businessAnalystsTeam};
        String longLength = scrumTeam[0][0];
        // for(int a=0;a<scrumTeam.length;a++){
        // for(int b=0,b<scrumTeam[a].length;b++){
        int minLength = scrumTeam[0][0].length();
        String shortestName = scrumTeam[0][0];
        for (int a = 0; a < scrumTeam.length; a++) {
            for (int b = 0; b < scrumTeam[a].length; b++) {
                if (shortestName.length() > scrumTeam[a][b].length()) {
                    shortestName = scrumTeam[a][b];
                    minLength = scrumTeam[a][b].length();
                }
            }
        }
        System.out.println(shortestName);
        System.out.println(minLength);
        System.out.println("========================");
        int[][][] arr3D = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};
        System.out.println(arr3D[1][0][2]);
        System.out.println(arr3D[0][0][1]);
        System.out.println(Arrays.toString(arr3D[0][0]));
        System.out.println(Arrays.toString(arr3D[1][1]));
        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.deepToString(arr3D[1]));

        for (int i = 0; i < arr3D.length; i++) {
            for (int c = 0; c < arr3D[i].length; c++) {
                for (int y = 0; y < arr3D[i][c].length; y++) {

                    System.out.print("  " + arr3D[i][c][y]);
                }
            }}

        }}



