package entidades;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class videojuego implements Serializable{
	@Id
	@GeneratedValue
	private int id;
	private String nombre;
	private String desarrollo;
	private int anyoLanzamiento;

	public videojuego() {
		
	}
	
	public videojuego(String nombre, String desarrollo, int anyoLanzamiento) {
		this.nombre = nombre;
		this.desarrollo = desarrollo;
		this.anyoLanzamiento = anyoLanzamiento;
	}
	
	public videojuego(int id, String nombre, String desarrollo, int anyoLanzamiento) {
		this.id = id;
		this.nombre = nombre;
		this.desarrollo = desarrollo;
		this.anyoLanzamiento = anyoLanzamiento;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDesarrollo() {
		return desarrollo;
	}
	public void setDesarrollo(String desarrollo) {
		this.desarrollo = desarrollo;
	}
	public int getAnyoLanzamiento() {
		return anyoLanzamiento;
	}
	public void setAnyoLanzamiento(int anyoLanzamiento) {
		this.anyoLanzamiento = anyoLanzamiento;
	}
}
