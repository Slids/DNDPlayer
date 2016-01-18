import java.awt.EventQueue;

import CharecterCreatorGui.BasicCharecterGui;

public class temp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Charecter.CreateCharecter me = new Charecter.CreateCharecter();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BasicCharecterGui frame = new BasicCharecterGui(me);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		@SuppressWarnings("unused")
		int hey = 0;
		hey += 1;
		
	}

}
