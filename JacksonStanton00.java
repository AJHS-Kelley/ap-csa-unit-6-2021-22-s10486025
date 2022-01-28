// ty Whitecotten, Array Practice, v0.5, 1/24/22

public class JacksonStanton00 {

    public static void main(String[] args) {

        String[] carArr = {"BMW M5", "Ferrari 250 GTO", "Porshe 911", "Ford F150", "buick Skylark"};
        int[] myGrades = {100, 25, 15, -3, 0, 75, 35};
        double[] myBankAccount = {0.0, -1.25, 3.75, 456.99, 25.25, 12.123456, 3.14};
        /*
        for (current_element = 0; current_element < carArr.length(); current_element += 1;) {
            // code to execute
            // Statement 1 is executed ONCE BEFORE THE LOOP
            // Statement 2 is the CONDITIONAL for the loop
            // Statement 3 is executed EACH TIME THE LOOP RUNS.

        }
        */


        for (int i =0; i < carArr.length; i++) {
            //System.out.println(i);
            //System.out.println(carArr[i]);

            
            if(carArr[i].length() % 2 == 0) {
                System.out.println(carArr[i]);
                System.out.println("This string has an even length");


            } else {
                System.out.println(carArr[i]);
                System.out.println("This string has an even length");

            }

        }
        



        
        System.out.println(carArr[3]);
        // Once created you cannot change the size of an array.
        carArr[0] = "Volkswagen Passat";


        // Enhanced for loop
        for (String eachElement : carArr ) {
            // Code to execute.
            System.out.println(eachElement);

        }
        
        int[][] twoDIntArr = {{4, -1, 2, 5},{8, 9, 17, -5}};

        System.out.println(twoDIntArr[0][2]);
        System.out.println(twoDIntArr[1][3]);

        for(int i = 0; i < twoDIntArr.length; ++i  ) {
            for(int j = 0; j < twoDIntArr[i].length; ++j) {
                System.out.println(twoDIntArr[i][j]);

            }

        }




        



    }






}  


