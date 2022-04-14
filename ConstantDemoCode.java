// Eric Yang
// ConstantDemoCode
// Friday, Feb 4, 2022
// This is a program that demos the constant variable in Java

import java.util.*;

public class ConstantDemoCode

{

   public static void main (String[] args)

   {
   
      final int CONSTANT_DEMO = 21;
      int inputerAnswer;
      
      Scanner inputerAnswerGetter = new Scanner (System.in);
      
      System.out.println ("What is the answer to 9 + 10?\n\n");
      
      inputerAnswer = inputerAnswerGetter.nextInt ();
      
      System.out.println ("\n\nThe answer is " + CONSTANT_DEMO);
      
   }
   
}