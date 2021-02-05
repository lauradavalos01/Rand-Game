/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05p17;
import java.io.*;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Laura
 */
public class Ch05p17 {
    
    public static void main(String[] args) throws IOException
    {
        
        readFile();
        writeFile();
        randomChoice();
        scoreKeeper();
                
    }
    public static void readFile () throws IOException
    {
    Scanner keyboard = new Scanner(System.in);
    
            
           //shows my userdata file
   File myFile = new File ("userdata.dat");
  Scanner inputFile;
        inputFile = new Scanner(myFile);
   if(!myFile.exists())
   {
       System.out.println("The file userdata.dat is not found.");
       System.exit(0);
   }
   
   while (inputFile.hasNext())
   {
       String name = inputFile.nextLine();
       System.out.println(name);
   }
    inputFile.close();
    }

    public static void writeFile ()throws IOException
    {
        String username;
        Scanner keyboard = new Scanner(System.in);
        
        try ( //stuff to write
                PrintWriter outputFile = new PrintWriter ("userdata.dat")) {
            System.out.print("What is your name?\n");
            username = keyboard.nextLine();
            outputFile.println(username);
            outputFile.close();
        }
    }
   
    public static void randomChoice()
    {
        
        int computerRand;
        String playChoice;
        String compChoice = "";
        Scanner keyboard = new Scanner(System.in);
 
        Random rand = new Random();
      
         computerRand = rand.nextInt(3)+1;
         if (computerRand == 1){
             compChoice = "rock";
         } else if (computerRand == 2) {
          compChoice = "paper";
      }else if (computerRand == 3) {    
            compChoice = "scissors";
         }
       
         System.out.println("Choose rock, paper, or scissor (lowercase letters please): ");
          playChoice = keyboard.nextLine();
         System.out.println("The computer chose: " + compChoice);
         
         if (playChoice.equals(compChoice)) {
   System.out.println("It's a tie!");
}
else if (playChoice.equals("rock")) {
   if (compChoice.equals("scissors")) 
      System.out.println("Rock crushes scissors. You win!");
   else if (compChoice.equals("paper")) 
        System.out.println("Paper eats rock.You lost.");
}
else if (playChoice.equals("paper")) {
   if (compChoice.equals("scissors")) 
       System.out.println("Scissor cuts paper. You lost."); 
   else if (compChoice.equals("rock")) 
        System.out.println("Paper eats rock. You win!");
} 
else if (playChoice.equals("scissors")) {
     if (compChoice.equals("paper")) 
         System.out.println("Scissor cuts paper. You win!"); 
     else if (compChoice.equals("rock")) 
        System.out.println("Rock breaks scissors. You lost.");
     
}
         

    }
   
   
    public static void scoreKeeper() throws IOException
    {
        int score;
       Scanner keyboard = new Scanner(System.in);
     
        try ( //stuff to write
                PrintWriter outputFile = new PrintWriter ("userdata.dat")) {
            System.out.print("What was your score?\n");
            score = keyboard.nextInt();
            outputFile.println(score);
            outputFile.close();
        }
    }
}

       