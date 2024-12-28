package org.miscellaneousinterviewquestions;

// To Avoid Integer Overflow use the number in form of String

import java.util.ArrayList;
import java.util.Collections;

public class FactorialOfLargeNumber {

    public static ArrayList<Integer> returnFactorialOfAGivenNumber(int number){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);    // last number to multiply is 1

        while(number > 1){

            int carryOver = 0, result = 0, dynamicSize = list.size();
            for(int i = 0; i < dynamicSize; i++){

                result = number * list.get(i) + carryOver;  // carry = 0 initially
                carryOver = result/10;                      // Carry for next iteration
                list.set(i,result%10);
            }

            // Carry should be added at end at last after end of for loop and carry might be greater than 10
            while(carryOver > 0){
                list.add(carryOver%10);
                carryOver = carryOver/10;
            }

            number = number - 1;
        }

        return list;
    }


    public static void main(String[] args) {

        ArrayList<Integer> reversedResult = returnFactorialOfAGivenNumber(8);

        Collections.reverse(reversedResult);

        for(int a : reversedResult)
            System.out.print( a + " ");

    }

}
