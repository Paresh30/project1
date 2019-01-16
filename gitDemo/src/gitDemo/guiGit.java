package gitDemo;
import javax.swing.JOptionPane;


public class guiGit {

		public static void main(String[] args) {
			String height;
			height = JOptionPane.showInputDialog(null, "Enter wave height");
	      int   ht= Integer.parseInt(height);
	      
	      if (ht>=30) {
	    	  
	    	  JOptionPane.showMessageDialog(null, "Go home");
	      }
	      else {
	    	  JOptionPane.showMessageDialog(null, "Enjoy");
	      }
		}

	}


