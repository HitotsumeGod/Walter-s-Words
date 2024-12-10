import javax.swing.*;
import java.awt.*;

class frameworks { 

	public static JFrame f;
	public static JTextField t;

	public void createScreen() {
		
		Font SERIF = new Font("Serif", Font.PLAIN, 24);
		f = new JFrame();
		t = new JTextField("                                                        ");
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JLabel l = new JLabel("Input your unsorted phrase below and watch the magic happen!");
		ImageIcon img = new ImageIcon("walter.jpeg");
		JLabel imAg = new JLabel(img);
		l.setFont(SERIF);
		f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
		p2.setLayout(new BorderLayout());
		t.addActionListener(new actioner());
		p1.add(l);
		p1.add(imAg);
		p2.add(t, BorderLayout.CENTER);
		f.add(p1);
		f.add(p2);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
		
	
	}

}
