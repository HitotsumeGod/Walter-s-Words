import java.awt.event.*;

class actioner implements ActionListener {

	public void actionPerformed(ActionEvent e) {
	
		sorter s = new sorter();
		frameworks frameworks = new frameworks();
		String letters = frameworks.t.getText().trim();
		frameworks.t.setText(s.sort(letters));
		frameworks.f.setVisible(true);
	
	}

}
