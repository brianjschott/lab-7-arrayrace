public class ArrayRaceRunner
{
	public static void main( String args[] )
	{
		ArrayRace r = new ArrayRace();
		System.out.println( r );
		while( r.turn() )
		{
			System.out.println( r );
		}
		System.out.println( r.getWinner() );
		
	}
}
