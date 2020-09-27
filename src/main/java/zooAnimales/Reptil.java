package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado;
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	public static ArrayList<Reptil> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Reptil> listado) {
		Reptil.listado=listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	public int cantidadReptiles() {
		return 4;
	}
	public String movimiento() {
		return "reptar";
	}
	public void crearIguana(String nombre, int edad, String genero) {
		Reptil(nombre, edad, "humedal",genero,,"verde",3);
	}
	public void crearSerpiente(String nombre, int edad, String genero) {
		Reptil(nombre, edad, "jungla",genero,,"blanco",1);
	}
	Reptil(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas,
			int largoCola){
		super(nombre, edad, habitat, genero, zona);
		this.setColorEscamas(colorEscamas);
		this.setLargoCola(largoCola);
		
		listado.add(this);
	}
	Reptil(){
		setTotalAnimales(getTotalAnimales()+1);
	}
}
