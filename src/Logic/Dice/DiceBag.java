package Logic.Dice;

import java.util.Random;

public class DiceBag {
	private Random rand = new Random();
	private int numD4 = 0;
	private int numD6 = 0;
	private int numD8 = 0;
	private int numD12 = 0;
	private int numD20 = 0;
	private int numD100 = 0;
	
	public DiceBag()
	{
	}
		
	public DiceBag(int d4, int d6, int d8, int d12, int d20, int d100)
	{
		numD4 = d4;
		numD6 = d6;
		numD8 = d8;
		numD12 = d12;
		numD20 = d20;
		numD100 = d100;
	}

	public int RollAll()
	{
		return this.RollAllD4() + this.RollAllD6() + this.RollAllD8() + 
				this.RollAllD12() + this.RollAllD20() + this.RollAllD100();
		
	}

	public int RollD4()
	{
		return rand.nextInt(4) + 1;
	}

	public int RollD6()
	{
		return rand.nextInt(6) + 1;
	}

	public int RollD8()
	{
		return rand.nextInt(8) + 1;
	}

	public int RollD12()
	{
		return rand.nextInt(12) + 1;
	}

	public int RollD20()
	{
		return rand.nextInt(20) + 1;
	}

	public int RollD100()
	{
		return rand.nextInt(100) + 1;
	}

	public int RollAllD4()
	{
		int total = 0;
		for (int i = 0; i < this.numD4; i++)
			total += this.RollD4();
		return total;
	}

	public int RollAllD6()
	{
		int total = 0;
		for (int i = 0; i < this.numD6; i++)
			total += this.RollD6();
		return total;
	}

	public int RollAllD8()
	{
		int total = 0;
		for (int i = 0; i < this.numD8; i++)
			total += this.RollD8();
		return total;
	}

	public int RollAllD12()
	{
		int total = 0;
		for (int i = 0; i < this.numD12; i++)
			total += this.RollD12();
		return total;
	}

	public int RollAllD20()
	{
		int total = 0;
		for (int i = 0; i < this.numD20; i++)
			total += this.RollD20();
		return total;
	}

	public int RollAllD100()
	{
		int total = 0;
		for (int i = 0; i < this.numD100; i++)
			total += this.RollD100();
		return total;
	}

	public int GetNumD4()
	{
		return this.numD4;
	}

	public int GetNumD6()
	{
		return this.numD6;
	}

	public int GetNumD8()
	{
		return this.numD8;
	}

	public int GetNumD12()
	{
		return this.numD12;
	}

	public int GetNumD20()
	{
		return this.numD20;
	}

	public int GetNumD100()
	{
		return this.numD100;
	}

	public void SetNumD4(int d4)
	{
		this.numD4 = d4;
	}
	
	public void SetNumD6(int d6)
	{
		this.numD6 = d6;
	}

	public void SetNumD8(int d8)
	{
		this.numD8 = d8;
	}

	public void SetNumD12(int d12)
	{
		this.numD12 = d12;
	}

	public void SetNumD20(int d20)
	{
		this.numD20 = d20;
	}

	public void SetNumD100(int d100)
	{
		this.numD100 = d100;
	}
}
