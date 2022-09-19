package com.kenzie.app;
// import necessary libraries
import com.kenzie.app.server.CustomHttpClient;
import com.kenzie.app.server.Questions.Clues;
import com.kenzie.app.server.Questions.QuestionDTO;

import java.util.*;

public class Main {
    /* Java Fundamentals Capstone project:
       - Define as many variables, properties, and methods as you decide are necessary to
       solve the program requirements.
       - You are not limited to only the class files included here
       - You must write the HTTP GET call inside the CustomHttpClient.sendGET(String URL) method
         definition provided
       - Your program execution must run from the main() method in Main.java
       - The rest is up to you. Good luck and happy coding!

     */

    final static String URL = "https://jservice.kenzie.academy/api/clues";

    private static ArrayList<Integer> usedClues = new ArrayList<>();
    private ArrayList<String> usedAnswers = new ArrayList<>();
    private ArrayList<String> correctAnswers = new ArrayList<>();

    private static String playerAnswer = " ";
    private static String correctAnswer = " ";
    private static int playerScore = 0;

    private static Random random = new Random();
    private static Scanner scanner;

    private static final int MAXIMUM_QUESTIONS = 10;
    private static int questionsAsked = 0;



    public static void main(String[] args)  {

        String httpResponseStr = CustomHttpClient.sendGET(URL);

        int rndNumber_to100 = random.nextInt(100);

        while (questionsAsked < MAXIMUM_QUESTIONS) {

        while(usedClues.contains(rndNumber_to100)){
            rndNumber_to100 = random.nextInt(100);
        }

        if(!usedClues.contains(rndNumber_to100)){
            usedClues.add(rndNumber_to100);
        }

            System.out.println("And your category is:" + "\"");

            //The error happens in this line and the two subsequent lines like it.
            System.out.println(QuestionDTO.getClues().get((rndNumber_to100)).getCategory().getTitle() + "\"");

            System.out.println("Your question is:" + "\"");

            System.out.println(QuestionDTO.getClues().get((rndNumber_to100)).getQuestion() + "\"");

            scanner = new Scanner(System.in);

            String playerInput = scanner.nextLine();

            playerAnswer = playerInput ;

            correctAnswer = QuestionDTO.getClues().get((rndNumber_to100)).getAnswer();

            if (playerAnswer.equalsIgnoreCase(correctAnswer)){
                System.out.println("That is correct!");
                playerScore++;
            }
            else {
                System.out.println("That is incorrect, we where looking for: \"" + correctAnswer + "\"");
            }

            questionsAsked++;
        }

        System.out.println("Congratulations, you have earned a total of: " + playerScore +" points!");

        System.out.println("Why not play again and see if you feel smarter than you do now?");

    }

}

