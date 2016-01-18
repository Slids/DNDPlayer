package Logic.Dice;

import java.util.ArrayList;
import java.util.Collections;

public class CommonDiceFunctions {
	
	/**
	 * Return the sum of the max m rolls given n rolls
	 *
	 * @param  m The number of elements you went to sum through
	 * @param  n The number of rolls you wish to make
	 * @return      the sum of the max m
	 */
	public static int GetTotalMaxMD6OfN(int m, int n) throws Exception
	{
		if( m>n)
			throw new Exception("m should be less then or equal to n");
		
		DiceBag db = new DiceBag();
		ArrayList<Integer> rolls = new ArrayList<Integer>();
		int total = 0;
		
		for( int rollNum = 0; rollNum < n; rollNum++)
		{
			if( rollNum < m)
				rolls.add(db.RollD6());
			else
			{
				int roll = db.RollD6();
				int minRoll = Collections.min(rolls);
				if (roll > minRoll)
				{
					rolls.remove((Object)minRoll);
					rolls.add(roll);
				}	
			}
		}
		
		for(int roll : rolls)
		{
			total += roll;
		}
		return total;
	}
}
