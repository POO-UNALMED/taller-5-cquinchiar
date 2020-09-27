package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal{
	private static ArrayList<Pez> listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	public static ArrayList<Pez> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado=listado;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int cantidadPeces() {
		return 6;
	}
	public String movimiento() {
		return "nadar";
	}
	public void crearSalmon(String nombre, int edad, String genero) {
		Pez(nombre, edad, "oceano",genero,,"rojo",6);
	}
	public void crearBacalao(String nombre, int edad, String genero) {
		Pez(nombre, edad, "oceano",genero,,"gris",6);
	}
	Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas,
			int cantidadAletas){
		super(nombre, edad, habitat, genero, zona);
		this.setColorEscamas(colorEscamas);
		this.setCantidadAletas(cantidadAletas);
		
		listado.add(this);
	}
	Pez(){
		setTotalAnimales(getTotalAnimales()+1);
	}
}
