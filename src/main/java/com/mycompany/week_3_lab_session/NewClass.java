
package com.mycompany.week_3_lab_session;


public class NewClass {
 
    public boolean isPrime(int b){
         for (int i = 2; i < b; i++ ){
            if (b%i == 0) return false;
     }
         return true;
         
    }
    
     public static void main(String[] args) {
        NewClass nc= new NewClass();
        int x= 7;
        System.out.println("Number "+x+" is " +(
                nc.isPrime(x)?"":" not a "
                )+ " prime "   );
    }
}
    
               

    
        
    
    

