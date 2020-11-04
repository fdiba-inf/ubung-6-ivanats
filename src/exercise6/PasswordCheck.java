package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       boolean result = true;
       String password = input.nextLine();     
       int digitCount = 0;

    while(true){
      if (password.length() < 8){ 
        result =false;
      } 
      else{
        for (int i = 0; i < password.length(); i++ ) {
         if( Character.isLetterOrDigit(password.charAt(i))) {
          digitCount++;
         }
         if(! Character.isLetterOrDigit(password.charAt(i))) {
          result = false;
          break; 
         }
        } 
      } 

  
      if (digitCount < 2){
        result = false;
      }
        
      if(result){
         System.out.println("Password is valid");
        break;
      }  else {
          System.out.println("Password is invalid");
          break;
      }
    }
}
}
