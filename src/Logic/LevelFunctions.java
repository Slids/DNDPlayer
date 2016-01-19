package Logic;

import Charecter.CharecterClasses.Classes;

public class LevelFunctions {

	public static int ExpForNextLevel(int level)
	{
		switch(level)
		{
		case 1: return 300;
		case 2: return 600;
		case 3: return 1800;
		case 4: return 3800;
		case 5: return 7500;
		case 6: return 9000;
		case 7: return 11000;
		case 8: return 14000;
		case 9: return 16000;
		case 10: return 21000;
		case 11: return 15000;
		case 12: return 20000;
		case 13: return 20000;
		case 14: return 30000;
		case 15: return 30000;
		case 16: return 30000;
		case 17: return 40000;
		case 18: return 40000;
		case 19: return 50000;
		}
		return 0;
	}
	
	public static int MinExpForLevel(int level)
	{
		int total = 0;
		for( int levels = 1; levels < level; level++)
			total += ExpForNextLevel(levels);
		return total;
	}
	
	public static int MaxExpForLevel(int level)
	{
		return MinExpForLevel(level) - 1;
	}
	
	
}
