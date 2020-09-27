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
	public static Animal crearCaballo(String nombre, int edad, String genero) {
		Mamifero a = new Mamifero(nombre, edad, "pradera",genero,true,4);
		caballos++;
		return a;
	}
	public static Animal crearLeon(String nombre, int edad, String genero) {
		Mamifero a = new Mamifero(nombre, edad, "pradera",genero,true,4);
		leones++;
		return a;
	}
	Mamifero(String nombre, int edad, String habitat, String genero, Boolean pelaje,
			int patas){
		super(nombre, edad, habitat, genero);
		this.setPelaje(pelaje);
		this.setPatas(patas);
		listado.add(this);
	}
	Mamifero(){
		listado.add(this);
		setTotalAnimales(getTotalAnimales()+1);
	}
	
	
}
