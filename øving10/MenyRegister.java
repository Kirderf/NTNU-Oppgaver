package øving10;

import java.util.ArrayList;

/*
• Å registrere en ny rett.
• Å finne en rett, gitt navnet.
• Å finne alle retter av en gitt type.
• Å registrere en ny meny som består av ett sett med retter.
• Å finne alle menyer med totalpris innenfor et gitt intervall.
*/

public class MenyRegister {
	private ArrayList<Meny> menyer;

	MenyRegister() {
		this.setMenyer(new ArrayList<Meny>());

	}

	public ArrayList<Meny> getMenyer() {
		return menyer;
	}

	public void setMenyer(ArrayList<Meny> menyer) {
		this.menyer = menyer;
	}

	public boolean addMeny(Meny meny) {
		menyer.add(meny);
		return true;
	}

	public boolean addMeny(String menyNavn, Rett forrett, Rett hovedrett, Rett dessert) {
		Meny nyMeny = new Meny(menyNavn);
		nyMeny.addRett(forrett);
		nyMeny.addRett(hovedrett);
		nyMeny.addRett(dessert);
		menyer.add(nyMeny);
		return true;
	}

	public boolean addRettToMeny(Meny meny, Rett rett) {
		meny.addRett(rett);
		return true;
	}

	public Rett getRett(String navn) {
		for (int i = 0; i < menyer.size(); i++) {
			for (int j = 0; j < menyer.get(i).getMeny().size(); j++) {
				if (menyer.get(i).getMeny().get(j).getName() == navn) {
					return menyer.get(i).getMeny().get(j);
				}
			}
		}
		return null;
	}

	public Meny getTypeRett(String type) {
		Meny typeMeny = new Meny(type);
		for (int i = 0; i < menyer.size(); i++) {
			for (int j = 0; j < menyer.get(i).getMeny().size(); j++) {
				if (menyer.get(i).getMeny().get(j).getType() == type) {
					typeMeny.addRett(menyer.get(i).getMeny().get(j));
				}
			}
		}
		return typeMeny;

	}

	public MenyRegister getMenyTotalPrisIntervall(int nedrePris, int øvrePris) {
		MenyRegister prisMeny = new MenyRegister();
		for (int i = 0; i < menyer.size(); i++) {
			if (menyer.get(i).getTotalPris() >= nedrePris && menyer.get(i).getTotalPris() <= øvrePris) {
				prisMeny.addMeny(menyer.get(i));
			}
		}
		return prisMeny;

	}

	@Override
	public String toString() {
		return "MenyRegister [menyer=" + menyer + "]";
	}
}
