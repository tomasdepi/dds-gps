package dds.dds_gps;

public class Local extends Poi{

	Rubro rubro;
	
	Local(Posicion pos, String nom, String calle, int num,Rubro rubro) {
		super(pos, nom, calle, num);
		this.rubro = rubro;
	}
	
	public boolean esCercanaDe(Poi lugar) {
		return (rubro.getDistMax() < distanciaDe(lugar));
	}

	
}
