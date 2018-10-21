import javax.swing.JOptionPane;


public class Mininum {
	public static void main(String[] args) {
		String w = JOptionPane.showInputDialog("a = " );
		int a = Integer.parseInt(w);
		w = JOptionPane.showInputDialog("b = " );
		int b = Integer.parseInt(w);
		w = JOptionPane.showInputDialog("c = " );
		int c = Integer.parseInt(w);
		
		if(a < b) 
			if( a < c )
				System.out.println("a = " + a);
			else
				System.out.println("c = " + c);
		else
			if(b < c)
				System.out.println("b = " + b);
			else
				System.out.println("c = " + c);
	}

}
