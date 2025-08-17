import java.awt.*;
import java.awt.event.*;
class change implements  ActionListener
{
	Frame f ;
	Button b ;
	Label l    ;
	change()
	{
	 f = new Frame("hello");
	 b =new Button("click me");
	 l =new Label("hello")	;
	 
	 f.setSize(800,800);
	 f.setLayout(null);
	 //f.setBackground(Color.RED);
	 
	 b.setBounds(50, 50, 50, 50);
	 l.setBounds(100, 100, 100, 100);
	 
	 b.addActionListener(this);
	 
	 f.add(b);
	 f.add(l);
	
	 f.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		f.setBackground(Color.BLUE);
		l.setText("welcome to the java");
	}
	
	}
public class exam {

	public static void main(String[] args) {
	
		new change();

	}

}
