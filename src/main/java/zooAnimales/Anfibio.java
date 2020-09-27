package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public static ArrayList<Anfibio> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado=listado;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public int cantidadAnfibios() {
		return 8;
	}
	public String movimiento() {
		return "saltar";
	}
	public static Animal crearRana(String nombre, int edad, String genero) {
		Anfibio a = new Anfibio(nombre, edad, "selva",genero,"rojo",true);
		ranas++;
		return a;
	}
	public static Animal crearSalamandra(String nombre, int edad, String genero) {
		Anfibio a = new Anfibio(nombre, edad, "selva",genero,"negro y amarillo",false);
		salamandras++;
		return a;
	}
	Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel,
			boolean venenoso){
		super(nombre, edad, habitat, genero);
		this.setColorPiel(colorPiel);
		this.setVenenoso(venenoso);
		
		listado.add(this);
	}
	Anfibio(){
		listado.add(this);
		setTotalAnimales(getTotalAnimales()+1);
	}
}
