/* CNNA results */

package esh.taskthree;

import javax.swing.*;

public class CourseStats {
	
	public static JOptionPane box = new JOptionPane();

	public static void main(String[] args) {
		
		int passes = 0;
		int failures = 0;
		// Counts how many times results was inputed by users
		int countf = 1;
		int grade ;
		
		// Loops everything up to 20 times.
		while (countf <= 20) {
			
			grade = Integer.parseInt(JOptionPane.showInputDialog("Enter the result: "));
			
			if (grade == 1) {
				
				passes = passes + 1;
				
			} else {
				failures = failures + 1;
			}
			
			countf = countf + 1;
		}
		
		JOptionPane.showMessageDialog(box, "Number of passes:" + passes + "\n" + "Number of failures: " + failures);
		
		// If conditions are met, proceed to following function.
		if (passes >= 16) {
			
			JOptionPane.showMessageDialog(box,  "Congratulation to the Tutors!");
			
		}
	}

}
