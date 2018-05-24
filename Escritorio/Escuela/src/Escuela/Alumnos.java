package Escuela;

public abstract class Alumnos {

	protected String nombre;
	protected String apellidos;
	protected int edad;
	protected String asignatura;
	
	public Alumnos(String nom, String cognoms, int edat, String asig)
	{
		this.nombre=nom;
		this.apellidos=cognoms;
		this.edad=edat;
		this.asignatura=asig;
	}
	
	public void setNombre(String name)
	{
		this.nombre=name;
	}
	public String getName()
	{
		return nombre;
	}
	public void setApellidos(String surname)
	{
		this.apellidos=surname;
	}
	public String getApellidos()
	{
		return apellidos;
	}
	
	public void setEdad(int edad)
	{
		this.edad=edad;
	}
	public int getEdad()
	{
		return edad;
	}
	public void setAsignatura(String asig)
	{
		this.asignatura=asig;
	}
	public String getAsignatura()
	{
		return asignatura;
	}
	

	
	
	public abstract void HacerDeberes();

}