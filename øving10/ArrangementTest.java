package øving10;

import javax.swing.*;

public class ArrangementTest {
	public static void main(String[] args) {

		ArrangmentRegister Oversikt = new ArrangmentRegister();
		System.out.println(Oversikt.toString());
		Oversikt.nyttArrangement();
		Oversikt.nyttArrangement();

		JOptionPane.showMessageDialog(null, Oversikt.toString());
		
	}

}
