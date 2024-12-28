package org.miscellaneousinterviewquestions;

import java.util.ArrayList;
import java.util.Collections;

public class SortVowelsInAString {

    public static String sortVowels(String s){

        ArrayList<Integer> lowerCase = new ArrayList<>(Collections.nCopies(26, 0));

        ArrayList<Integer> upperCase = new ArrayList<>(Collections.nCopies(26, 0));

        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'  || s.charAt(i) == 'u'){
                 lowerCase.set(s.charAt(i) - 'a', lowerCase.get(s.charAt(i) - 'a') + 1);
                 sb.setCharAt(i, '#');

            }

        }

        for(int j = 0; j < s.length(); j++){

            if(s.charAt(j) == 'A' || s.charAt(j) == 'E' || s.charAt(j) == 'I' || s.charAt(j) == 'O'  || s.charAt(j) == 'U'){
                upperCase.set(s.charAt(j) - 'A', upperCase.get(s.charAt(j) - 'A') + 1);
                sb.setCharAt(j, '#');
            }

        }

        StringBuilder sd = new StringBuilder();

        for(int i = 0; i < 26; i++){

            while(upperCase.get(i) > 0){   // UpperCase Letters have low ASCII value
                sd.append(upperCase.get(i) + 'A');
                upperCase.set(i, upperCase.get(i) - 1);
            }
        }

        for(int j = 0; j < 26; j++){

            while(lowerCase.get(j) > 0){   // LowerCase Letters have high ASCII value
                sd.append(lowerCase.get(j) + 'a');
                upperCase.set(j, lowerCase.get(j) - 1);
            }
        }

        return sd.toString();

    }

    public static void main(String[] args) {

        String s = "lEetcOdeEr";

        System.out.println(sortVowels(s));

    }
}
