package dds.dds_gps;

public class Local extends Poi implements Libreria{

	Local(double lon, double lat, String nom, String calle, int num) {
		super(lon, lat, nom, calle, num);
	}
	
	public int getDistMax(){
		return 1;
	}
	
}
