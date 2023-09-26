package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal {
	public static int iguanas, serpientes;
	private final static ArrayList<Reptil> reptiles = new ArrayList<>();
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre, int edad, String habitat, String genero, String escamas,int cola) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas=escamas;
		this.largoCola=cola;
		reptiles.add(this);
	}
	public Reptil() {
		reptiles.add(this);
	}

	public static int cantidadReptiles() {
		return reptiles.size();
	}
	public String movimiento() {
		return "reptar";
	}
	public static Reptil crearIguana(String nombre,int edad,String genero) {
		iguanas++;
		Reptil iguana = new Reptil(nombre,edad,"humedal",genero,"verde",3);
		reptiles.add(iguana);
		return iguana;
	}
	public static Reptil crearSerpiente(String nombre,int edad,String genero) {
		serpientes++;
		Reptil serpiente = new Reptil(nombre,edad,"jungla",genero,"blanco",1);
		reptiles.add(serpiente);
		return serpiente;
	}
	public static int getIguanas () {
        return Reptil.iguanas;
    }
    public static void setIguanas (int iguanas) {
        Reptil.iguanas = iguanas;
    }
    public static int getSerpientes () {
        return Reptil.serpientes;
    }
    public static void setSerpientes (int serpientes) {
        Reptil.serpientes = serpientes;
    }
    public String getColorEscamas () {
        return this.colorEscamas;
    }
    public void setColorEscamas (String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }
    public int getLargoCola () {
        return this.largoCola;
    }
    public void setLargoCola (int largoCola) {
        this.largoCola = largoCola;
    }
}
