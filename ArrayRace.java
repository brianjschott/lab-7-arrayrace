import java.lang.System;
import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class ArrayRace
{
	private int one;
	private int two;
	private int oneCount;
	private int twoCount;
	private int[] track;
	private int turn;
	private int winner;
	
	// C
	public ArrayRace()
	{
	}
	
	public boolean turn()
	{
		return false;
	}
	
	public String getWinner()
	{
		return "";
  } 
  	
  public String toString()
  {
  	return Arrays.toString( track ) + " one count = " + oneCount + " twoCount = " + twoCount;
  }
}
