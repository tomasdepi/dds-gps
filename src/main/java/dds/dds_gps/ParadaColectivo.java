package dds.dds_gps;

public class ParadaColectivo extends Poi{
	
	ParadaColectivo(Posicion pos, String nom, String calle, int num) {
		super(pos, nom, calle, num);
	}
	
	public int getDistMax(){
		return 1;
	}
	
	public boolean estaDisponible(){
		return true;
	}
	
}
