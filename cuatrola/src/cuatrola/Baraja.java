package cuatrola;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Baraja {
	private List<Carta> mazo;

	public Baraja() {
		this.mazo=new LinkedList<Carta>();
		this.inicializarMazo();
	}
	
	public List<Carta> getMazo() {
		return mazo;
	}

	public void setMazo(List<Carta> mazo) {
		this.mazo = mazo;
	}
	
	public void inicializarMazo() {
		List<Integer> valoresCartas=new LinkedList<Integer>();
		valoresCartas.add(0, new Integer(10));
		valoresCartas.add(1, new Integer(11));
		valoresCartas.add(2, new Integer(12));
		valoresCartas.add(3, new Integer(3));
		valoresCartas.add(4, new Integer(1));
		
		for (int i=0; i<4; i++) {
			for (int j=0; j<5; j++) {
				this.mazo.add(new Carta(valoresCartas.get(j), i));
			}
		}
	}
	
	public void barajar() {
		List<Carta> temporal = new LinkedList<Carta>();
		int quedan=20;
		int random;
		Random generator = new Random();
		for (int i=0; i<20; i++) {
			random=generator.nextInt(quedan);
			System.out.println(random);
			temporal.add(this.mazo.get(random));
			mazo.remove(random);
			quedan--;
		}
		this.mazo=temporal;
	}
	
	public String toString() {
		String aDevolver = "";
		for (int i=0; i<this.mazo.size(); i++) {
			aDevolver=aDevolver+this.mazo.get(i);
		}
		return aDevolver;
	}
	
	public static void main(String args []) {
		Baraja b = new Baraja();
		System.out.println(b);
		b.barajar();
		System.out.println(b);
	}
}
