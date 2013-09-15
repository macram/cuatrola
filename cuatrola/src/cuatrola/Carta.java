package cuatrola;

public class Carta {
	private Integer valor; // 10, 11, 12, 3, 1
	private Integer palo; // 0 = oros, 1 = copas, 2 = espadas, 3 = bastos
	
	public Carta(int valor, int palo) {
		this.valor=valor;
		this.palo=palo;
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getPalo() {
		return palo;
	}
	public void setPalo(int palo) {
		this.palo = palo;
	}
	public String toString() {
		String paloString = null;
		switch (this.palo) {
		case 0: paloString = "oros"; break;
		case 1: paloString = "copas"; break;
		case 2: paloString = "espadas"; break;
		case 3: paloString = "bastos"; break;
		}
		return valor.toString()+" de "+paloString+"\n";
	}
}
