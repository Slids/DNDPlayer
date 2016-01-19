package CharecterCreatorGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Charecter.CharecterClasses.*;
import Charecter.CharecterClasses.Charecter;
import Charecter.CharecterClasses.Classes;
import Charecter.CharecterClasses.Races;

import Charecter.CreateCharecter;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class StatBuilderGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StatBuilderGui frame = new StatBuilderGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StatBuilderGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 606);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		CreateCharecter charecter = new CreateCharecter();
		charecter.ChooseBasicData("dumbName", Classes.Barbarian, Races.Aasimar, 10, Alignment.Chaotic_Evil);
		
		JLabel lblTotalStatPoints = new JLabel("Total Stat Points Available");
		lblTotalStatPoints.setBounds(12, 13, 174, 16);
		contentPane.add(lblTotalStatPoints);
		
		JLabel lblTotalStatPts = new JLabel("");
		lblTotalStatPts.setBounds(265, 13, 56, 16);
		contentPane.add(lblTotalStatPts);
		
		JLabel lblAcrobatics = new JLabel("Acrobatics");
		lblAcrobatics.setBounds(12, 42, 100, 16);
		contentPane.add(lblAcrobatics);
		
		JLabel lblAnimalHandling = new JLabel("Animal Handling");
		lblAnimalHandling.setBounds(12, 71, 100, 16);
		contentPane.add(lblAnimalHandling);
		
		JLabel lblArcana = new JLabel("Arcana");
		lblArcana.setBounds(12, 100, 100, 16);
		contentPane.add(lblArcana);
		
		JLabel lblAthletics = new JLabel("Athletics");
		lblAthletics.setBounds(12, 129, 100, 16);
		contentPane.add(lblAthletics);
		
		JLabel lblDeception = new JLabel("Deception");
		lblDeception.setBounds(12, 158, 100, 16);
		contentPane.add(lblDeception);
		
		JLabel lblHistory = new JLabel("History");
		lblHistory.setBounds(12, 187, 100, 16);
		contentPane.add(lblHistory);
		
		JLabel lblInsight = new JLabel("Insight");
		lblInsight.setBounds(12, 216, 100, 16);
		contentPane.add(lblInsight);
		
		JLabel lblIntimidation = new JLabel("Intimidation");
		lblIntimidation.setBounds(12, 245, 100, 16);
		contentPane.add(lblIntimidation);
		
		JLabel lblInvestigation = new JLabel("Investigation");
		lblInvestigation.setBounds(12, 274, 100, 16);
		contentPane.add(lblInvestigation);
		
		JLabel lblMedicine = new JLabel("Medicine");
		lblMedicine.setBounds(12, 303, 100, 16);
		contentPane.add(lblMedicine);
		
		JLabel lblNature = new JLabel("Nature");
		lblNature.setBounds(12, 332, 100, 16);
		contentPane.add(lblNature);
		
		JLabel lblPerception = new JLabel("Perception");
		lblPerception.setBounds(12, 361, 100, 16);
		contentPane.add(lblPerception);
		
		JLabel lblPerformance = new JLabel("Performance");
		lblPerformance.setBounds(12, 390, 100, 16);
		contentPane.add(lblPerformance);
		
		JLabel lblPersuasion = new JLabel("Persuasion");
		lblPersuasion.setBounds(12, 419, 100, 16);
		contentPane.add(lblPersuasion);
		
		JLabel lblReligion = new JLabel("Religion");
		lblReligion.setBounds(12, 448, 100, 16);
		contentPane.add(lblReligion);
		
		JLabel lblSleightOfHand = new JLabel("Sleight of Hand");
		lblSleightOfHand.setBounds(12, 477, 100, 16);
		contentPane.add(lblSleightOfHand);
		
		JLabel lblStealth = new JLabel("Stealth");
		lblStealth.setBounds(12, 506, 100, 16);
		contentPane.add(lblStealth);
		
		JLabel lblSurvival = new JLabel("Survival");
		lblSurvival.setBounds(12, 535, 100, 16);
		contentPane.add(lblSurvival);
		
		JComboBox cBAcrobatics = new JComboBox();
		cBAcrobatics.setBounds(265, 42, 56, 22);
		contentPane.add(cBAcrobatics);
		
		JComboBox cBAnimalHandling = new JComboBox();
		cBAnimalHandling.setBounds(265, 71, 56, 22);
		contentPane.add(cBAnimalHandling);
		
		JComboBox cBArcana = new JComboBox();
		cBArcana.setBounds(265, 100, 56, 22);
		contentPane.add(cBArcana);
		
		JComboBox cBAthletics = new JComboBox();
		cBAthletics.setBounds(265, 129, 56, 22);
		contentPane.add(cBAthletics);
		
		JComboBox cBDeception = new JComboBox();
		cBDeception.setBounds(265, 158, 56, 22);
		contentPane.add(cBDeception);
		
		JComboBox cBHistory = new JComboBox();
		cBHistory.setBounds(265, 187, 56, 22);
		contentPane.add(cBHistory);
		
		JComboBox cBInsight = new JComboBox();
		cBInsight.setBounds(265, 216, 56, 22);
		contentPane.add(cBInsight);
		
		JComboBox cBIntimidation = new JComboBox();
		cBIntimidation.setBounds(265, 245, 56, 22);
		contentPane.add(cBIntimidation);
		
		JComboBox cBInvestigation = new JComboBox();
		cBInvestigation.setBounds(265, 274, 56, 22);
		contentPane.add(cBInvestigation);
		
		JComboBox cBMedicine = new JComboBox();
		cBMedicine.setBounds(265, 303, 56, 22);
		contentPane.add(cBMedicine);
		
		JComboBox cBNature = new JComboBox();
		cBNature.setBounds(265, 332, 56, 22);
		contentPane.add(cBNature);
		
		JComboBox cBPerception = new JComboBox();
		cBPerception.setBounds(265, 361, 56, 22);
		contentPane.add(cBPerception);
		
		JComboBox cBPerformance = new JComboBox();
		cBPerformance.setBounds(265, 390, 56, 22);
		contentPane.add(cBPerformance);
		
		JComboBox cBPersuasion = new JComboBox();
		cBPersuasion.setBounds(265, 419, 56, 22);
		contentPane.add(cBPersuasion);
		
		JComboBox cBReligion = new JComboBox();
		cBReligion.setBounds(265, 448, 56, 22);
		contentPane.add(cBReligion);
		
		JComboBox cBSlightOfHand = new JComboBox();
		cBSlightOfHand.setBounds(265, 477, 56, 22);
		contentPane.add(cBSlightOfHand);
		
		JComboBox cBStealth = new JComboBox();
		cBStealth.setBounds(265, 506, 56, 22);
		contentPane.add(cBStealth);
		
		JComboBox cBSurvival = new JComboBox();
		cBSurvival.setBounds(265, 532, 56, 22);
		contentPane.add(cBSurvival);
		
		
	}

}
