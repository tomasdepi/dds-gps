package dds.dds_gps;

public class Main {

	public static void main(String[] args) {
		
		ParadaColectivo uno = new ParadaColectivo(10,10,"parada","nose",1);
		ParadaColectivo dos = new ParadaColectivo(10,10,"parada","nose",1);
		Poi tres = new Poi(10,10,"parada","nose",1);
		Local cuatro = new Local(10,10,"parada","nose",1);
		
		System.out.println(uno.estaLejosDe(dos));
		System.out.println(tres.estaLejosDe(tres));
		System.out.println(cuatro.getDistMax());
		
	}

}
