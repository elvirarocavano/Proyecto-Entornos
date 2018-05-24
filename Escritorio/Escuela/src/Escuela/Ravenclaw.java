package Escuela;

public class Ravenclaw extends Alumnos {

	private String TipoLibro;
	

	public Ravenclaw(String nom, String cognoms, int edat, String asig,String Tiplibro)
	{
		super(nom, cognoms, edat, asig);
		
		this.TipoLibro=Tiplibro;	
	}
	public void setLibro(String tipo)
	{
		this.TipoLibro=tipo;
	}
	
	public String getLibro()
	{
		return TipoLibro;
	}
	
	@Override
	public void HacerDeberes()
	{
		System.out.println("¿Había deberes?");
	}
	
}