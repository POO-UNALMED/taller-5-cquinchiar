package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal{
	private static ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
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
	public static Animal crearSalmon(String nombre, int edad, String genero) {
		Pez a =new Pez(nombre, edad, "oceano",genero,"rojo",6);
		salmones++;
		return a;
	}
	public static Animal crearBacalao(String nombre, int edad, String genero) {
		Pez a = new Pez(nombre, edad, "oceano",genero,"gris",6);
		bacalaos++;
		return a;
	}
	Pez(String nombre, int edad, String habitat, String genero, String colorEscamas,
			int cantidadAletas){
		super(nombre, edad, habitat, genero);
		this.setColorEscamas(colorEscamas);
		this.setCantidadAletas(cantidadAletas);
		
		listado.add(this);
	}
	Pez(){
		listado.add(this);
		setTotalAnimales(getTotalAnimales()+1);
	}
}
