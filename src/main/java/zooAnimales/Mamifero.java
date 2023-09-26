package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal {
	public static int caballos, leones;
	private final static ArrayList<Mamifero> mamiferos = new ArrayList<>();
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje,int patas) {
		super(nombre,edad,habitat,genero);
		this.pelaje=pelaje;
		this.patas=patas;
		mamiferos.add(this);
	}
	public Mamifero() {
		mamiferos.add(this);
	}

	public static int cantidadMamiferos() {
		return mamiferos.size();
	}
	public static Mamifero crearCaballo(String nombre,int edad,String genero) {
		caballos++;
		Mamifero caballo = new Mamifero(nombre,edad,"pradera",genero,true,4);
		mamiferos.add(caballo);
		return caballo;
	}
	public static Mamifero crearLeon(String nombre,int edad,String genero) {
		leones++;
		Mamifero leon = new Mamifero(nombre,edad,"selva",genero,true,4);
		mamiferos.add(leon);
		return leon;
	}
	public static int getCaballos () {
        return Mamifero.caballos;
    }
    public static void setCaballos (int caballos) {
        Mamifero.caballos = caballos;
    }
    public static int getLeones () {
        return Mamifero.leones;
    }
    public static void setLeones (int leones) {
        Mamifero.leones = leones;
    }
    public boolean isPelaje () {
        return this.pelaje;
    }
    public void setPelaje (boolean pelaje) {
        this.pelaje = pelaje;
    }
    public int getPatas () {
        return this.patas;
    }
    public void setPatas (int patas) {
        this.patas = patas;
    }
}