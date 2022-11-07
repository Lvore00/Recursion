package RecursionPractice;

/**
 * class: RecursionPractice.java
 * name: Lilly Vore
 * date: 11/06/2022
 * description: Include all methods from this codingbat practice to this RecursionPractice
 * program. (RecursionPractice.java)
 * ◦If the method is required to use the loop, please change the method name by adding Loop at the end.
 * or example, you have two getPowerOfTens(int number) methods. One is for recursion and another
 * is for using the loop. Please change the method name for loop to getPowerOfTensLoop().
 * ◦Submit RecursionPractice.java to GitHub and add the link to D2L dropbox.
 */

public class RecursionPractice {

    public static void main(String[] args) {

        RecursionPractice rp = new RecursionPractice();

        int result1 = rp.getNumberOfZerosRecursion(3090);
        int result2 =  rp.numberOfGlovesRecursion(5);
        long result3 = rp.getPowerOfTenLoop(3);
        int result4 =  rp.numberOfGloves(4);
        int result5 = rp.getNumberOfZerosLoop(5);
        int result6 = rp.factorial(3);
        long result7 = rp.getPowerOfTen(3);
        String result8 = rp.getMultiChar('n', 4);
        String result9 = rp.displayString("Result9: Display String ", 4);

        System.out.println("Result1 - getNumberOfZerosRecursion: " + result1);
        System.out.println("Result2 - numberOfGlovesRecursion: " + result2);
        System.out.println("Result3 - getPowerOfTenLoop: " + result3);
        System.out.println("Result4 - numberOfGloves: " + result4);
        System.out.println("Result5 - getNumberOfZerosLoop: " + result5);
        System.out.println("Result6 - factorial: " + result6);
        System.out.println("Result7 - getPowerOfTen: " + result7);
        System.out.println("Result8 - getMultiChar: " + result8);
        System.out.println("Result9 - displayString: " + result9);



    }


    //Number1

    public String displayString(String str, int n){
        if (n > 0)
        {
            return str + displayString(str, n - 1);
        }
        else
        {
            return "";

        }

    }

    //Number2
    public String getMultiChar(char ch, int n){
        if(n == 0)
            return ch + "";
        return ch + getMultiChar(ch, n-1);

    }

    //Number3
    public long getPowerOfTen(int n){
        if (n == 0)
        {
            return 1;

        }
        else
        {
            return 10 * getPowerOfTen(n-1);

        }
    }

    //Number4
    public int factorial(int n)
    {
        if(n == 1)
            return 1;
        return n*factorial(n-1);
    }

    //Number5
    public int numberOfGloves(int peopleOfPlanetU101InARoom) { //this one

        int gloves;
        gloves = peopleOfPlanetU101InARoom * 3;
        return gloves;
    }

    //Number6
    public long getPowerOfTenLoop(int n){


        long result = 1;
        // getPowerOfTenLoop(3)  ---> 10^3 --> 1000
        for(int i = 0; i < n; i++){
            result = result * 10;
        }

        return result;

    }

    //Number7
    public int numberOfGlovesRecursion(int peopleOfPlanetU101InARoom){


        if(peopleOfPlanetU101InARoom <=0)
        {
            return 0;

        }
        else
        {
            return 3 + numberOfGloves(peopleOfPlanetU101InARoom-1);

        }
    }



    //Number8
    public int getNumberOfZerosLoop(int n) {
        int k, count =0;
        while(n > 0)
        {
            k = n % 10;
            if(k==0)
                count=count+1;
            n = n / 10;

        }
        return count;

    }

    //Number9
    public int getNumberOfZerosRecursion(int n){
        if (n == 0) {
            return 1;

        }
        else if (n < 10)
        {
            return 0;

        }
        else
        {
            int count = getNumberOfZerosRecursion(n / 10);
            if (n % 10 == 0)
                ++count;
            return count;

        }

    }

}

