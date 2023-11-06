package com.NumGame;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		
		
		 Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        int lowerBound = 1;
	        int upperBound = 100;
	        int maxAttempts = 10; // Maximum attempts per round
	        int rounds = 0; // Number of rounds won
	        boolean playAgain = true;
	        
	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("I have selected a random number between " + lowerBound + " and " + upperBound + ". Try to guess it.");

	        while (playAgain) {
	            int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
	            int attempts = 0;
	            boolean hasGuessedCorrectly = false;
	            
	            while (!hasGuessedCorrectly && attempts < maxAttempts) {
	                System.out.print("Enter your guess: ");
	                int playerGuess = scanner.nextInt();
	                attempts++;
	                
	                if (playerGuess < lowerBound || playerGuess > upperBound) {
	                    System.out.println("Your guess is out of the specified range. Try again.");
	                } else if (playerGuess < numberToGuess) {
	                    System.out.println("Try a higher number.");
	                } else if (playerGuess > numberToGuess) {
	                    System.out.println("Try a lower number.");
	                } else {
	                    hasGuessedCorrectly = true;
	                    System.out.println("Congratulations! You guessed the number " + numberToGuess + " correctly in " + attempts + " attempts.");
	                }
	            }
	            
	            if (hasGuessedCorrectly) {
	                rounds++;
	                System.out.println("You won this round! Rounds won: " + rounds);
	            } else {
	                System.out.println("Sorry, you've reached the maximum number of attempts. The number was " + numberToGuess);
	            }
	            
	            System.out.print("Play again? (yes/no): ");
	            String playChoice = scanner.next().toLowerCase();
	            playAgain = playChoice.equals("yes") || playChoice.equals("y");
	        }

	        System.out.println("Thank you for playing. Your total rounds won: " + rounds);

	        scanner.close();
	    }
	}


