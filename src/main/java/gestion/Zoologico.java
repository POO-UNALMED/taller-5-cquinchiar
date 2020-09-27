package gestion;
import java.util.ArrayList;

import zooAnimales.Animal;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public void setNombre (String nombre) {
		this.nombre=nombre;
	}public String getNombre() {
		return nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public ArrayList<Zona> getZonas() {
		return zonas;
	}
	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas=zonas;
	}
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	public int cantidadTotalAnimales() {
		int con=0;
		for (int i=0;i<=zonas.size();i++) {
			con+=zonas.get(i).cantidadAnimales();
		}
		return con;
	}
	Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas){
		this.setNombre(nombre);
		this.setUbicacion(ubicacion);
		this.setZonas(zonas);
	}
	Zoologico(){
		
	}
	
}
