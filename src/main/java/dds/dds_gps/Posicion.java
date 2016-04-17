package dds.dds_gps;

public class Posicion {

	private double longitud = 361;
	private double latitud = 361;
	
	Posicion(double lon, double lat){
		this.longitud = lon;
		this.latitud = lat;
	}
	
	public boolean esValida(){
		return (longitud < 361) && (latitud < 361);
	};
	

	public double distanciaA(Posicion posicion) {
		double theta = this.longitud - posicion.longitud;
		double dist = Math.sin(deg2rad(this.latitud)) * Math.sin(deg2rad(posicion.latitud)) + Math.cos(deg2rad(this.latitud)) * Math.cos(deg2rad(posicion.latitud)) * Math.cos(deg2rad(theta));
		dist = Math.acos(dist);
		dist = rad2deg(dist);
		dist = dist * 60 * 1.1515;
		dist = dist * 1.609344;  // para pasarlo a kilometros
		
		return (dist*1000); //a metros
	}

	private static double deg2rad(double deg) {
		return (deg * Math.PI / 180.0);
	}
	
	private static double rad2deg(double rad) {
		return (rad * 180 / Math.PI);
	}
			
	
	public double getLongitud() {
		return longitud;
	}
	
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	public double getLatitud() {
		return latitud;
	}
	
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	
}
