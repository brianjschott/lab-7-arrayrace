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
	
	// Assigns track to be an array with values, and initializes all other values
	public ArrayRace()
	{
	}
	
	public boolean turn()
	{
		
		return false;
	}
	
	// returns name of winner and a congratulatory message (only call this method if someone's count is >= 5)
	public String getWinner()
	{
		
		return "";
  	} 
  	
  public String toString()
  {
  	return Arrays.toString( track ) + " one count = " + oneCount + " twoCount = " + twoCount;
  }
}
