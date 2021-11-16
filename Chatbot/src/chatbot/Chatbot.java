
package chatbot;

import java.util.Scanner;


public class Chatbot {

   
    public static void main(String[] args) {
      System.out.println("Enter Your Question");
         Scanner input= new Scanner(System.in);
         
        String q1= "Hello! how are you?";
        String q2= "What is your name?";
        String q3= "Who created you?";
        String q4= "Who is ayaz?";
        String q5= "How old are you?";
        String q6= "How many seconds in an hour?";
        String q7= "how many hours in a day?";
        String q8= "How many languages do you know?";
        String ayaz= input.nextLine();
        if (q1.equalsIgnoreCase(ayaz)) {
            System.out.println("Hello! I'm fine and you?");}
        else if (q2.equalsIgnoreCase(ayaz)){ System.out.println("My name is Javbot");}
        else if (q3.equalsIgnoreCase(ayaz)){ System.out.println("Juhayer Ayaz");}
        else if (q4.equalsIgnoreCase(ayaz)){ System.out.println("He is a beginner in programming");}
        else if (q5.equalsIgnoreCase(ayaz)){ System.out.println("I'm two days old");}
        else if (q6.equalsIgnoreCase(ayaz)){ System.out.println("3600 seconds");}
        else if (q7.equalsIgnoreCase(ayaz)){ System.out.println("730 hours");}
        else if (q8.equalsIgnoreCase(ayaz)){ System.out.println("I know as much as my programmer does");}
        
        else System.out.println("wrong question!");
    }
    
}
