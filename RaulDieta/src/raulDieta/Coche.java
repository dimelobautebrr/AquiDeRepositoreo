package raulDieta;

public class Coche {
	private String matricula;
	
	public Coche(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + "]";
	}
	
}
