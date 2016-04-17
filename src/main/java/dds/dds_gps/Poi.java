package dds.dds_gps;

public class Poi {

	private double longitud = 361;
	private double latitud = 361;
	private String nombre;
	private String calle;
	private int numero;
	
	Poi(double lon, double lat, String nom, String calle, int num){
		this.longitud = lon;
		this.latitud = lat;
		this.nombre = nom;
		this.calle = calle;
		this.numero = num;
	}
	
	public boolean esValido(){
		return (this.sinGeolocalizar() || this.sinNombre() ? false : true);
	}
	
	public boolean sinGeolocalizar(){
		return (this.longitud==361 || this.latitud==361 ? true : false);
	}
	
	public boolean sinNombre(){
		return (this.nombre==null ? true: false);
	}
	
	public int distanciaDe(Poi lugar){
		//funcion loca de calculo de distancia
		return 1;
	}
	
	public boolean estaLejosDe(Poi lugar){
		return (getDistMax() > distanciaDe(lugar) ? true : false);
		//return (distanciaDe(lugar) > distMax ? true : false);
	}
	
	public int getDistMax(){
		return 5;
	}
	
}
