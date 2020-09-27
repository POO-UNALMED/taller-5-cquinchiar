package zooAnimales;
import java.util.ArrayList;
import gestion.*;
public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public void setNombre (String nombre) {
		this.nombre=nombre;
	}public String getNombre() {
		return nombre;
	}
	public static int getTotalAnimales() {
		return totalAnimales;
	}
	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String movimiento() {
		return "desplazarse";
	}
	public static String totalPorTipo() {
		return "Mamiferos: "+ Mamifero.getListado().size()+"\n"+
		"Aves: "+ Ave.getListado().size()+"\n"+
		"Reptiles: "+ Reptil.getListado().size()+"\n"+
		"Peces: "+ Pez.getListado().size()+"\n"+
		"Anfibios: "+ Anfibio.getListado().size();
	}
	public String toString() {
		if(this.zona.getNombre()!="") {
			return "Mi nombre es "+this.getNombre()+", tengo una edad de "+this.getEdad()+
					", habito en "+this.getHabitat()+" y mi genero es"+this.getGenero()+
					", la zona en la que me ubico es "+this.zona.getNombre()+
					", en el "+this.zona.getZoo().getNombre();
		}else {
			return "Mi nombre es "+this.getNombre()+", tengo una edad de "+this.getEdad()+
					", habito en "+this.getHabitat()+" y mi genero es"+this.getGenero();
		}
	}
	Animal(String nombre, int edad, String habitat, String genero){
		setTotalAnimales(getTotalAnimales()+1);
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
	}
	Animal(){
		setTotalAnimales(getTotalAnimales()+1);
	}
}
