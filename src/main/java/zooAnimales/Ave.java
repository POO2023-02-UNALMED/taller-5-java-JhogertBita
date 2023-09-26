package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal {
	public static int aguilas,halcones;
	private final static ArrayList<Ave> aves = new ArrayList<>();
	private String colorPlumas;
	
	
	public Ave(String nombre, int edad, String habitat, String genero, String plumas) {
		super(nombre,edad,habitat,genero);
		this.colorPlumas=plumas;
		aves.add(this);
	}
	public Ave() {
		aves.add(this);
	}

	public static int cantidadAves() {
		return aves.size();
	}
	public String movimiento() {
		return "volar";
	}
	public static Ave crearAguila(String nombre,int edad,String genero) {
		aguilas++;
		Ave aguila= new Ave(nombre,edad,"montana",genero,"blanco y amarillo");
		aves.add(aguila);
		return aguila;
	}
	public static Ave crearHalcon(String nombre,int edad,String genero) {
		halcones++;
		Ave halcon= new Ave(nombre,edad,"montana",genero,"cafe glorioso");
		aves.add(halcon);
		return halcon;
	}
        public static int getAguilas () {
        return Ave.aguilas;
    }
    public static void setAguilas (int aguilas) {
        Ave.aguilas = aguilas;
    }
	public static int getHalcones () {
        return Ave.halcones;
    }
    public static void setHalcones (int halcones) {
        Ave.halcones = halcones;
    }
    public String getColorPlumas () {
        return this.colorPlumas;
    }
    public void setColorPlumas (String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
}