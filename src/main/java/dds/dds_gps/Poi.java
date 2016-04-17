package dds.dds_gps;

public class Poi {

	private Posicion posicion;
	private String nombre;
	private String calle;
	private int numero;

	Poi(Posicion posicion, String nom, String calle, int num) {
		this.posicion = posicion;
		this.nombre = nom;
		this.calle = calle;
		this.numero = num;
	}

	public boolean esValido() {
		return (this.sinGeolocalizar() || this.sinNombre());
	}
	

	public boolean sinGeolocalizar() {
		return posicion.esValida();
	}

	public boolean sinNombre() {
		return (this.nombre == null ? true : false);
	}

	public double distanciaDe(Poi lugar) {
		return posicion.distanciaA(lugar.posicion);
	}

	public boolean esCercanaDe(Poi lugar) {
		return (getDistMax() < distanciaDe(lugar));
	}

	public int getDistMax() {
		return 5;
	}

}
