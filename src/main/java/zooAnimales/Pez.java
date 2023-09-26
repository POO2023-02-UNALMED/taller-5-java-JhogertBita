package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
	public static int salmones, bacalaos;
	private final static ArrayList<Pez> peces = new ArrayList<>();
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, String escamas,int aletas) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas=escamas;
		this.cantidadAletas=aletas;
		peces.add(this);
	}
	public Pez() {
		peces.add(this);
	}

	public static int cantidadPeces() {
		return peces.size();
	}
	public String movimiento() {
		return "nadar";
	}
	public static Pez crearSalmon(String nombre,int edad,String genero) {
		salmones++;
		Pez salmon = new Pez(nombre,edad,"oceano",genero,"rojo",6);
		peces.add(salmon);
		return salmon;
	}
	public static Pez crearBacalao(String nombre,int edad,String genero) {
		bacalaos++;
		Pez bacalao = new Pez(nombre,edad,"oceano",genero,"gris",6);
		peces.add(bacalao);
		return bacalao;
	}
	public static int getSalmones () {
        return Pez.salmones;
    }
    public static void setSalmones (int salmones) {
        Pez.salmones = salmones;
    }
    public static int getBacalaos () {
        return Pez.bacalaos;
    }
    public static void setBacalaos (int bacalaos) {
        Pez.bacalaos = bacalaos;
    }
    public String getColorEscamas () {
        return this.colorEscamas;
    }
    public void setColorEscamas (String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }
    public int getCantidadAletas () {
        return this.cantidadAletas;
    }
    public void setCantidadAletas (int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
}