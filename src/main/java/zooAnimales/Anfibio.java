package zooAnimales;
import java.util.ArrayList;
public class Anfibio extends Animal {
	public static int ranas, salamandras;
	private final static ArrayList<Anfibio> anfibios = new ArrayList<>();
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String piel,boolean ven) {
		super(nombre,edad,habitat,genero);
		this.colorPiel=piel;
		this.venenoso=ven;
		anfibios.add(this);
	}
	public Anfibio() {
		anfibios.add(this);
	}
	public static int cantidadAnfibios() {
		return anfibios.size();
	}
	public String movimiento() {
		return "saltar";
	}
    public boolean isVenenoso () {
        return this.venenoso;
    }
    public void setVenenoso (boolean venenoso) {
        this.venenoso = venenoso;
    }
    public String getColorPiel () {
        return this.colorPiel;
    }
    public void setColorPiel (String colorPiel) {
        this.colorPiel = colorPiel;
    }

	public static Anfibio crearRana(String nombre,int edad,String genero) {
		ranas++;
		Anfibio rana = new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		anfibios.add(rana);
		return rana;
	}
	public static Anfibio crearSalamandra(String nombre,int edad,String genero) {
		salamandras++;
		Anfibio salamandra = new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
		anfibios.add(salamandra);
		return salamandra;
	}
    public static int getRanas () {
        return Anfibio.ranas;
    }
    public static void setRanas (int ranas) {
        Anfibio.ranas = ranas;
    }
    public static int getSalamandras () {
        return Anfibio.salamandras;
    }
    public static void setSalamandras (int salamandras) {
        Anfibio.salamandras = salamandras;
    }
}