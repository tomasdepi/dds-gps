package dds.dds_gps;

public class ParadaColectivo extends Poi{
	
	ParadaColectivo(double lon, double lat, String nom, String calle, int num) {
		super(lon, lat, nom, calle, num);
	}
	
	public int getDistMax(){
		return 1;
	}
	
}
