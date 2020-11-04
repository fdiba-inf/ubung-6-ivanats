package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println( " Enter your number:");
    
    int num = input.nextInt();
    String number = num.toString();
    String reversedNumber = " ";
    assert num > 0 : " Number is not definiert ";

    for(int i = number.lenght() -1; i >= 0; i--){ 
      reversedNumber += number.charAt(i);
    }
      boolean result = true;
    
    for(int i = 0; i < number.lenght(); i++){
      if (!number.charAt(i) == reversedNumber.charAt(i) ){
       result = false;
       break;
      }
    }
       System.out.println ("Palindrome:" + result );
   

    }
}
