package Escuela;

public class Hufflepuff extends Alumnos {

	private String TipoPlanta;
	
	public Hufflepuff(String nom, String cognoms, int edat, String asig,String Tiplant)
	{
		super(nom, cognoms, edat, asig);
		
		this.TipoPlanta=Tiplant;	
	}
	public void setPlantas(String tipo)
	{
		this.TipoPlanta=tipo;
	}
	
	public String getPlantas()
	{
		return TipoPlanta;
	}
	
	@Override
	public void HacerDeberes()
	{
		System.out.println("¿Había deberes?");
	}
}