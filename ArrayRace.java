import java.lang.System;
import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class ArrayRace
{
	private int one; //should be the integer 1
	private int two; //should be the integer 2
	private int oneCount; //how many times player one gets to the end
	private int twoCount; //how many times player two gets to the end
	private int[] track; //the track
	private int turn; //the value represents whose turn it is
	private int winner; //the value representing the winner
	
	// Assigns track to be an array of length 18, filled with 0s
	// Should also initialize all other values
	public ArrayRace()
	{
	}
	
	// Includes all the steps for a player's turn
	// It should, at the very least, move the player whose turn it currently is a random number of spaces,
	// and then check to see if that spot is occupied. If it is, replace the value and bump the other player back to start
	// If someone moves past the end of the array, then that player's count should be incremented
	
	// If no one's count is >= 5, then return true
	// If someone's count is >= 5, return false
	public boolean turn()
	{
		
		return false;
	}
	
	// returns name of winner and a congratulatory message
	public String getWinner()
	{
		
		return "";
  	} 
  	
	// This is a pre-written function that prints the ArrayRace as a String, which is basically
	// the array and the count values
  public String toString()
  {
  	return Arrays.toString( track ) + " one count = " + oneCount + " twoCount = " + twoCount;
  }
}
