package task5;

import java.util.ArrayList;

public class Palindrome {

    //Palindrome for all values
    /*public static Boolean IsPalindrome(String str){
        String tmp = new StringBuilder(str).reverse().toString();
        return str.equals(tmp);
    }*/

    public static ArrayList<Integer> getAllPalindromes(int n){
        ArrayList<Integer> palindromes = new ArrayList<Integer>();

        for (int i = 0; i <= n; i++){
            /*if (IsPalindrome(Integer.toString(i))){
                palindromes.add(i);
            }*/

            //Palindrome up to 100
            if (i <= 9 || i % 11 == 0)
            {
                palindromes.add(i);
            }
        }
        return palindromes;
    }
}
