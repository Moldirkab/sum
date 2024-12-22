//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package com.Info;

import java.util.Scanner;

public class ExceptionsLearn {
        public static void main(String[] args) {
            System.out.println("enter two numbers:");
            Scanner scanner = new Scanner(System.in);
            int n1 = 0;
            int n2 = 0;
            try {
                n1 = scanner.nextInt();
                n2 = scanner.nextInt();
                checkPositiveNumbers(n1, n2);
            } catch (Exception e) {
                System.out.println("The problem is "+ e.getMessage());
            }

        }
        public static void checkPositiveNumbers(int n1, int n2) throws Exception{
            if(n1<0 || n2<0){
                throw new Exception("both numbers must be positive");
            }
            else{
                System.out.println("the sum is: " + (n1 + n2));
            }
        }
}








//
//
//}
