package CharecterCreatorGui;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Charecter.CreateCharecter;
import Charecter.CharecterClasses.Charecter;
import Logic.Dice.CommonDiceFunctions;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTextPane;

public class AbilityBuilderGui extends JDialog {

	private JPanel contentPane;
	private JTextPane txtPleaseSelectYour;

	/**
	 * Create the frame.
	 */
	public AbilityBuilderGui(CreateCharecter charecter)  {
		setTitle("Ability Builder");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.setModal(true);
		setBounds(100, 100, 450, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		int[] possibleAbil = {0,0,0,0,0,0};
		
		JLabel lblStrength = new JLabel("Strength");
		lblStrength.setBounds(22, 51, 56, 16);
		contentPane.add(lblStrength);
		
		JLabel lblDex = new JLabel("Dexterity");
		lblDex.setBounds(22, 80, 56, 16);
		contentPane.add(lblDex);
		
		JLabel lblCon = new JLabel("Constitution");
		lblCon.setBounds(22, 109, 56, 16);
		contentPane.add(lblCon);
		
		JLabel lblInt = new JLabel("Intelligence");
		lblInt.setBounds(22, 138, 56, 16);
		contentPane.add(lblInt);
		
		JLabel lblWis = new JLabel("Wisdon");
		lblWis.setBounds(22, 167, 56, 16);
		contentPane.add(lblWis);
		
		JLabel lblCha = new JLabel("Charisma");
		lblCha.setBounds(22, 196, 56, 16);
		contentPane.add(lblCha);
		
		JComboBox<Integer> cBStrength = new JComboBox<Integer>();
		cBStrength.setEnabled(false);
		cBStrength.setBounds(104, 51, 133, 22);
		contentPane.add(cBStrength);
		
		JComboBox<Integer> cBDex = new JComboBox<Integer>();
		cBDex.setEnabled(false);
		cBDex.setBounds(104, 80, 133, 22);
		contentPane.add(cBDex);
		
		JComboBox<Integer> cBCon = new JComboBox<Integer>();
		cBCon.setEnabled(false);
		cBCon.setBounds(104, 106, 133, 22);
		contentPane.add(cBCon);
		
		JComboBox<Integer> cBInt = new JComboBox<Integer>();
		cBInt.setEnabled(false);
		cBInt.setBounds(104, 138, 133, 22);
		contentPane.add(cBInt);
		
		JComboBox<Integer> cBWis = new JComboBox<Integer>();
		cBWis.setEnabled(false);
		cBWis.setBounds(104, 167, 133, 22);
		contentPane.add(cBWis);

		JComboBox<Integer> cBCha = new JComboBox<Integer>();
		cBCha.setEnabled(false);
		cBCha.setBounds(104, 196, 133, 22);
		contentPane.add(cBCha);
		
		JLabel lblPossibleStats = new JLabel("New label");
		lblPossibleStats.setEnabled(false);
		lblPossibleStats.setBounds(133, 17, 178, 16);
		contentPane.add(lblPossibleStats);
		
		JButton btnDoneWithAbilities = new JButton("Done with abilities");
		btnDoneWithAbilities.setEnabled(false);
		btnDoneWithAbilities.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int[] chosen = {(int)cBStrength.getSelectedItem(), (int)cBDex.getSelectedItem(),
						(int)cBCon.getSelectedItem(),(int)cBInt.getSelectedItem(),
						(int)cBWis.getSelectedItem(),(int)cBCha.getSelectedItem()};
				Arrays.sort(chosen);
				if(Arrays.equals(chosen, possibleAbil))
				{
					charecter.ChooseStats((int)cBCha.getSelectedItem(), (int)cBCon.getSelectedItem(), 
							(int)cBDex.getSelectedItem(), (int)cBInt.getSelectedItem(), 
							(int)cBStrength.getSelectedItem(), (int)cBWis.getSelectedItem());
					setVisible(false);
					try {
						this.finalize();
					} catch (Throwable e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		btnDoneWithAbilities.setBounds(22, 247, 169, 25);
		contentPane.add(btnDoneWithAbilities);
		

		JButton btnRollDice = new JButton("Roll Dice");
		btnRollDice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
				for(int i = 0; i < 6; i++)
					possibleAbil[i] = CommonDiceFunctions.GetTotalMaxMD6OfN(3, 4);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				Arrays.sort(possibleAbil);
				lblPossibleStats.setText(
						Arrays.stream(possibleAbil)
						.mapToObj(Integer::toString)
						.collect(Collectors.joining(", ")));
				lblPossibleStats.setVisible(true);
				cBStrength.setEnabled(true);
				btnDoneWithAbilities.setEnabled(true);
				cBDex.setEnabled(true);
				cBCon.setEnabled(true);
				cBInt.setEnabled(true);
				cBWis.setEnabled(true);
				cBCha.setEnabled(true);
				cBStrength.setModel(new DefaultComboBoxModel<Integer>( Arrays.stream(possibleAbil).boxed().toArray(Integer[]::new)));
				cBDex.setModel(new DefaultComboBoxModel<Integer>( Arrays.stream(possibleAbil).boxed().toArray(Integer[]::new)));
				cBCon.setModel(new DefaultComboBoxModel<Integer>( Arrays.stream(possibleAbil).boxed().toArray(Integer[]::new)));
				cBInt.setModel(new DefaultComboBoxModel<Integer>( Arrays.stream(possibleAbil).boxed().toArray(Integer[]::new)));
				cBWis.setModel(new DefaultComboBoxModel<Integer>( Arrays.stream(possibleAbil).boxed().toArray(Integer[]::new)));
				cBCha.setModel(new DefaultComboBoxModel<Integer>( Arrays.stream(possibleAbil).boxed().toArray(Integer[]::new)));
				
			}
		});
		btnRollDice.setBounds(12, 13, 97, 25);
		contentPane.add(btnRollDice);
		
		txtPleaseSelectYour = new JTextPane();
		txtPleaseSelectYour.setEditable(false);
		txtPleaseSelectYour.setText("Please select your abilities. You must frst roll. Every element of the list can be chosen for one and only one ability. Clicking done before this has finished will do nothing.");
		txtPleaseSelectYour.setBounds(22, 289, 370, 54);
		contentPane.add(txtPleaseSelectYour);
		
		
	}
}
