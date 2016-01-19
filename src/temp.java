import java.awt.EventQueue;

import javax.swing.JFrame;

import CharecterCreatorGui.BasicCharecterGui;
import CharecterCreatorGui.AbilityBuilderGui;

public class temp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Charecter.CreateCharecter me = new Charecter.CreateCharecter();
		

		BasicCharecterGui bCG = new BasicCharecterGui(me);
		bCG.setVisible(true);
		
		
		AbilityBuilderGui aBG = new AbilityBuilderGui(me);
		aBG.setVisible(true);
		
		@SuppressWarnings("unused")
		int hey = 0;
		hey += 1;
		
	}

}
