package gestion;
import java.util.ArrayList;
public class Zoologico {
	private String nombre,ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<>();
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
	}
	public Zoologico() {
		this(null,null);
	}
    
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
		zona.setZoo(this);
	}
	public int cantidadTotalAnimales() {
		int n=0;
		for (int i=0; i<zonas.size(); i++) {
			n+=this.zonas.get(i).cantidadAnimales();
		}
		return n;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion=ubicacion;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setZona(ArrayList<Zona> zonas) {
		this.zonas=zonas;
	}
	public ArrayList<Zona> getZona() {
		return zonas;
	}
}