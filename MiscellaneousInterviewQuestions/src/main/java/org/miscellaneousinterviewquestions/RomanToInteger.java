package org.miscellaneousinterviewquestions;

public class RomanToInteger {

    public static int returnNumberCorrespondingToRomanCharacter(char romanCharacter){

         if(romanCharacter == 'I')
             return 1;
         else if(romanCharacter == 'V')
             return 5;
         else if(romanCharacter == 'X')
             return 10;
         else if(romanCharacter == 'L')
             return 50;
         else if(romanCharacter == 'C')
             return 100;
         else if(romanCharacter == 'D')
             return 500;
         else
             return 1000;
    }

    public static int convertRomanNumberToInteger(String roman){

       char [] romanCharArray =  roman.toCharArray();
       int index = 0;
       int sum = 0;

       while(index < roman.length() - 1){

           if(returnNumberCorrespondingToRomanCharacter(romanCharArray[index]) <
                   returnNumberCorrespondingToRomanCharacter(romanCharArray[index + 1])){

               sum = sum + -1*returnNumberCorrespondingToRomanCharacter(romanCharArray[index]);

           }else{
               sum = sum + returnNumberCorrespondingToRomanCharacter(romanCharArray[index]);
           }

           index++;
       }

       // Adding the Last character of String as it is as there is nothing to compare after that
       sum = sum + returnNumberCorrespondingToRomanCharacter(romanCharArray[roman.length() - 1]);

       return sum;

    }

    public static void main(String[] args) {

//      String romanNumString = "XLIII";
        String romanNumString = "LXXXV";

        System.out.println(convertRomanNumberToInteger(romanNumString));

    }
}
