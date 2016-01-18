package Charecter.CharecterClasses;

public class Charecter {
	
	//General Char items
	public String charecterName;
	public String playerName;
	public Classes charClass;
	public Races race;
	public int level;
	public Alignment alignment;
	public int exp;
	
	//stats
	public int strength;
	public int dexterity;
	public int constitution;
	public int intelligence;
	public int wisdom;
	public int charisma;
	
	public int StatBonus(int statLevel)
	{
		return (int) Math.floor((statLevel-10)/2);
	}
	
	//base skills
	public int baseAcrobatics;
	public int baseAnimalHandling;
	public int baseArcana;
	public int baseAthletics;
	public int baseDeception;
	public int BaseHistory;
	public int baseInsight;
	public int baseIntimidation;
	public int baseInvestigation;
	public int baseMedicine;
	public int baseNature;
	public int basePerception;
	public int basePerformance;
	public int basePersuasion;
	public int baseReligion;
	public int baseSleightOfHand;
	public int baseStealth;
	public int baseSurvival;
	
	//battle
	public int baseAc;
	public int currentHP;
	public int totalHP;
	
	public Attack[] attacks;
	public Spell[] spells;
	public Equipment[] equipmentInBag;
	public Weapon[] weaponsInBag;
	public Armour[] armourInBag;
	
	public Equipment leftHand;
	public Equipment rightHand;
	public Equipment legs;
	public Equipment torso;
	public Equipment head;
	public Equipment feet;
	
	public Languages[] language;
	



}
