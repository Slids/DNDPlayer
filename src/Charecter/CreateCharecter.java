package Charecter;
import Logic.*;

import java.util.Arrays;

import Charecter.CharecterClasses.*;

public class CreateCharecter {
	private Charecter me = new Charecter();
	
	public void ChooseBasicData(String name, Classes charClass, Races race, int level,
			Alignment align)
	{
		me.charecterName = name;
		me.charClass = charClass;
		me.race = race;
		me.level = level;
		me.alignment = align;
		me.exp = LevelFunctions.MinExpForLevel(level);
	}
	
	public void ChooseStats(int charisma, int constitution, int dexterity,
			int intelligence, int strength, int wisdom)
	{
		me.charisma = charisma;
		me.constitution = constitution;
		me.dexterity = dexterity;
		me.intelligence = intelligence;
		me.strength = strength;
		me.wisdom = wisdom;
	}
	
	public void ChooseAlignment(Alignment align)
	{
		me.alignment = align;
	}

	public void ChooseSkills(int acrobatics, int animalHandling, int arcana,
			int athletics, int deception, int history, int insight, int intimidation,
			int investigation, int medicine, int nature, int perception,
			int performance, int persuasion, int religion, int sOH, int stealth,
			int survival)
	{
		me.baseAcrobatics= acrobatics;
		me.baseAnimalHandling = animalHandling;
		me.baseArcana = arcana;
		me.baseAthletics = athletics;
		me.baseDeception = deception;
		me.BaseHistory = history;
		me.baseInsight = insight;
		me.baseIntimidation = intimidation;
		me.baseInvestigation = investigation;
		me.baseMedicine = medicine;
		me.baseNature = nature;
		me.basePerception = perception;
		me.basePerformance = performance;
		me.basePersuasion = persuasion;
		me.baseReligion = religion;
		me.baseSleightOfHand = sOH;
		me.baseStealth = stealth;
		me.baseSurvival = survival;
	}
	
	public void ChooseLanguage(Languages[] languages)
	{
		me.language = languages;
	}

	public void ChooseBattleStats(int hp)
	{
		me.baseAc = 10;
		me.currentHP = hp;
		me.totalHP = hp;
	}

	public void ChooseAttacks( Attack[] attacks, Spell[] spells)
	{
		me.attacks = attacks;
		me.spells = spells;
	}

	public void ChooseEquipment( Equipment[] equipment, Armour[] armour, Weapon[] weapons)
	{
		me.equipmentInBag = equipment;
		me.armourInBag = armour;
		me.weaponsInBag = weapons;
	}

	public void ChooseEqupped(Equipment leftHand, Equipment rightHand, Equipment legs, Equipment torso,
			Equipment head, Equipment feet)
	{
		if(IsEquipmentInBag(leftHand))
			me.leftHand = leftHand;

		if(IsEquipmentInBag(rightHand))
			me.leftHand = leftHand;

		if(IsEquipmentInBag(legs))
			me.legs = legs;

		if(IsEquipmentInBag(torso))
			me.torso = torso;
		
		if(IsEquipmentInBag(head))
			me.head = head;
		
		if(IsEquipmentInBag(feet))
			me.feet = feet;
	}
	
	private Boolean IsEquipmentInBag(Equipment equip)
	{
		return Arrays.stream(me.equipmentInBag).anyMatch(a -> a.Name == equip.Name) ||
		Arrays.stream(me.armourInBag).anyMatch(a -> a.Name == equip.Name)||
		Arrays.stream(me.armourInBag).anyMatch(a -> a.Name == equip.Name);
	}

}
