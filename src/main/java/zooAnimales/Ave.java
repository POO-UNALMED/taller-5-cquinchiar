package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal{
	private static ArrayList<Ave> listado;
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	public static ArrayList<Ave> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado=listado;
	}
	public int cantidadAves() {
		return 3;
	}
	public String movimiento() {
		return "volar";
	}
	public void crearHalcon(String nombre, int edad, String genero) {
		Ave(nombre, edad, "montañas",genero,,"cafe glorioso");
	}
	public void crearAguila(String nombre, int edad, String genero) {
		Ave(nombre, edad, "montanas",genero,,"blanco y amarillo");
	}
	Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas){
		super(nombre, edad, habitat, genero, zona);
		this.setColorPlumas(colorPlumas);
		
		listado.add(this);
	}
	Ave(){
		setTotalAnimales(getTotalAnimales()+1);
	}
}
