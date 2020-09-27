package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public boolean getPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public static ArrayList<Mamifero> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado=listado;
	}
	public int cantidadMamiferos() {
		return listado.size();
	}
	public void crearCaballo(String nombre, int edad, String genero) {
		Mamifero(nombre, edad, "pradera",genero,,true,4);
	}
	public void crearLeon(String nombre, int edad, String genero) {
		Mamifero(nombre, edad, "pradera",genero,,true,4);
	}
	Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, Boolean pelaje,
			int patas){
		super(nombre, edad, habitat, genero, zona);
		this.setPelaje(pelaje);
		this.setPatas(patas);
		listado.add(this);
	}
	Mamifero(){
		setTotalAnimales(getTotalAnimales()+1);
	}
	
	
}
