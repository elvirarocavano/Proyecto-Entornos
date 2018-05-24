package Escuela;

public class Gryffindor extends Alumnos {
	
	private String TipoMascota;
	
	
	public Gryffindor(String nom, String cognoms, int edat, String asig,String TipMas)
	{
		super(nom, cognoms, edat, asig);
		this.TipoMascota=TipMas;	
	}
	public void setMascotas(String tipo)
	{
		this.TipoMascota=tipo;
	}
	
	public String getMascotas()
	{
		return TipoMascota;
	}
	
	@Override
	public void HacerDeberes()
	{
		System.out.println("Por supuesto que los he hecho");
	}
	
}
