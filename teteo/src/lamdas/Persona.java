package lamdas;

public class Persona {
	
	private String nombre;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public Persona(String nombre, int edad, String apellidos) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.apellidos = apellidos;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	private int edad;
	private String apellidos;
	public Persona(String string, int i) {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", apellidos=" + apellidos + "]";
	}
	
}
