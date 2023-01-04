package Fakultet;

public class Fakultet {
	private String fakultet;
	private int smerovi;
	private int studenti;

	public Fakultet(String fakultet, int smerovi, int studenti) {
		this.fakultet = fakultet;
		this.smerovi = smerovi;
		this.studenti = studenti;
	}

	public String getFakultet() {
		return fakultet;
	}

	public void setFakultet(String fakultet) {
		this.fakultet = fakultet;
	}

	public int getSmerovi() {
		return smerovi;
	}

	public void setSmerovi(int smerovi) {
		this.smerovi = smerovi;
	}

	public int getStudenti() {
		return studenti;
	}

	public void setStudenti(int studenti) {
		this.studenti = studenti;
	}

}
