package task5;

import java.util.ArrayList;

public class Palindrome {
    public static Boolean IsPalindrome(String s){
        String tmp = new StringBuilder(s).reverse().toString();
        return s.equals(tmp);
    }

    public static ArrayList<Integer> GetAllPalindromes(int n){
        ArrayList<Integer> palindromes = new ArrayList<Integer>();
        for (int i = 0; i <= n; i++){
            if (IsPalindrome(Integer.toString(i))){
                palindromes.add(i);
            }
        }
        return palindromes;
    }

     /*private static void WriteAllPalindromes(ArrayList<Integer> palindromes){
        for (int i = 0; i <palindromes.size(); i++ ){
            System.out.print(palindromes + " ");
        }
    }*/
}
