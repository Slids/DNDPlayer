package CharecterCreatorGui;

import Charecter.CreateCharecter;
import java.util.stream.IntStream;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import Charecter.CharecterClasses.*;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BasicCharecterGui extends JFrame {

	private JPanel contentPane;
	private JTextField charName;

	/**
	 * Create the frame.
	 */
	public BasicCharecterGui(CreateCharecter charecter) {
		setTitle("Basic Charecter Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 624);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		charName = new JTextField();
		charName.setBounds(43, 57, 116, 22);
		contentPane.add(charName);
		charName.setColumns(10);
		
		JLabel lblCharecterName = new JLabel("Charecter Name");
		lblCharecterName.setBounds(43, 29, 116, 16);
		contentPane.add(lblCharecterName);
		
		JLabel lblCharecterClass = new JLabel("Charecter Class");
		lblCharecterClass.setBounds(43, 92, 116, 16);
		contentPane.add(lblCharecterClass);
		
		JComboBox<Classes> cBClass = new JComboBox<Classes>();
		cBClass.setModel(new DefaultComboBoxModel<Classes>( Classes.values()));
		cBClass.setBounds(43, 121, 84, 22);
		contentPane.add(cBClass);
		
		JLabel lblRace = new JLabel("Race");
		lblRace.setBounds(43, 161, 56, 16);
		contentPane.add(lblRace);
		
		JComboBox<Races> cBRace = new JComboBox<Races>();
		cBRace.setModel(new DefaultComboBoxModel<Races>(Races.values()));
		cBRace.setBounds(43, 190, 84, 22);
		contentPane.add(cBRace);
		
		JLabel lvlLevel = new JLabel("Level");
		lvlLevel.setBounds(43, 227, 56, 16);
		contentPane.add(lvlLevel);
		
		JComboBox<Integer> cBLevel = new JComboBox<Integer>();
		cBLevel.setEditable(true);
		cBLevel.setModel(new DefaultComboBoxModel( IntStream.range(1,21).boxed().toArray()));
		cBLevel.setBounds(43, 256, 84, 22);
		contentPane.add(cBLevel);
		
		JLabel lblAlignment = new JLabel("Alignment");
		lblAlignment.setBounds(43, 291, 84, 16);
		contentPane.add(lblAlignment);
		
		JComboBox<Alignment> cBAlignment = new JComboBox<Alignment>();
		cBAlignment.setModel(new DefaultComboBoxModel<Alignment>(Alignment.values()));
		cBAlignment.setBounds(43, 320, 84, 22);
		contentPane.add(cBAlignment);
		
		JButton btnDoneWithBasisc = new JButton("Done With Basisc");
		btnDoneWithBasisc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				charecter.ChooseBasicData(charName.getText(), (Classes)cBClass.getSelectedItem(), 
						(Races)cBRace.getSelectedItem(), (Integer)cBLevel.getSelectedItem(), (Alignment)cBAlignment.getSelectedItem());
				setVisible(false);
				try {
					this.finalize();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnDoneWithBasisc.setBounds(43, 380, 131, 25);
		contentPane.add(btnDoneWithBasisc);
	}
}
