package øving10;


import java.util.Collections;

import javax.swing.JOptionPane;

public class ArrangementTest {
	public static void main(String[] args) {

		ArrangmentRegister Oversikt = new ArrangmentRegister();
		
		Oversikt.getArrangementList().add(new Arrangement("TESTER Per","NTNA","Bursdag",101910110850L)); // 1019 1011 0850
		Oversikt.getArrangementList().add(new Arrangement("TESTER Arne","NTNB","Bursdag",12010110850L)); // 120 1011 0850
		Oversikt.getArrangementList().add(new Arrangement("TESTER Bjarne","NTNA","Bursdag",201810110850L)); // 2018 1011 0850
		
		Oversikt.addArrangement();
		
		System.out.println("\nSorterer etter Navn");
		Collections.sort(Oversikt.getArrangementList(), new SortbyName());
		for(int i =0; i<Oversikt.getArrangementList().size(); i++)
			System.out.println(Oversikt.getArrangementList().get(i));
		
		System.out.println("\nSorterer etter Tid");
		Collections.sort(Oversikt.getArrangementList(), new SortbyTime());
		for(int i =0; i<Oversikt.getArrangementList().size(); i++)
			System.out.println(Oversikt.getArrangementList().get(i));
		
		System.out.println("\nSorterer etter Type");
		Collections.sort(Oversikt.getArrangementList(), new SortbyType());
		for(int i =0; i<Oversikt.getArrangementList().size(); i++)
			System.out.println(Oversikt.getArrangementList().get(i));
		
		JOptionPane.showMessageDialog(null, Oversikt.getArrangementer(JOptionPane.showInputDialog("Input sted")));
		JOptionPane.showMessageDialog(null, Oversikt.getArrangementer(Integer.parseInt(JOptionPane.showInputDialog(null, "Dato1:")), Integer.parseInt(JOptionPane.showInputDialog(null, "Dato1:"))));
	}

}
