package Escuela;

public class Slytherin extends Alumnos {
	
	private String TipoArma;
	
	public Slytherin(String nom, String cognoms, int edat, String asig,String arma)
	{
		super(nom, cognoms, edat, asig);
		this.TipoArma=arma;	
	}
	
	public void setTipoArmas(String tipoArm)
	{
		this.TipoArma=tipoArm;
	}
	
	public String getTipoArmas()
	{
		return TipoArma;
	}
	
	@Override
	public void HacerDeberes()
	{
		System.out.println("Torturé a un elfo doméstico para que los hiciera");
	}
}