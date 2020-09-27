package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado;
	public int ranas;
	public int salamandras;
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
	public void crearRana(String nombre, int edad, String genero) {
		Reptil(nombre, edad, "selva",genero,,"rojo",true);
	}
	public void crearSalamandra(String nombre, int edad, String genero) {
		Reptil(nombre, edad, "selva",genero,,"negro y amarillo",false);
	}
	Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel,
			boolean venenoso){
		super(nombre, edad, habitat, genero, zona);
		this.setColorPiel(colorPiel);
		this.setVenenoso(venenoso);
		
		listado.add(this);
	}
	Anfibio(){
		setTotalAnimales(getTotalAnimales()+1);
	}
}
