package practiceÿvinger;

public class Fag {
	private int fagkode;
	private String fagnavn;
	private int studiepoeng;

	Fag(int fagkode, String fagnavn) {
		this.fagkode = fagkode;
		this.fagnavn = fagnavn;
		this.setStudiepoeng(30);
	}

	public int getFagkode() {
		return fagkode;
	}

	public String getFagnavn() {
		return fagnavn;
	}

	public int getStudiepoeng() {
		return studiepoeng;
	}

	public void setStudiepoeng(int studiepoeng) {
		this.studiepoeng = studiepoeng;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fag other = (Fag) obj;
		if (fagkode != other.fagkode)
			return false;
		if (fagnavn == null) {
			if (other.fagnavn != null)
				return false;
		} else if (!fagnavn.equals(other.fagnavn))
			return false;
		if (studiepoeng != other.studiepoeng)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fag [fagkode=" + fagkode + ", fagnavn=" + fagnavn + ", studiepoeng=" + studiepoeng + "]";
	}

}
