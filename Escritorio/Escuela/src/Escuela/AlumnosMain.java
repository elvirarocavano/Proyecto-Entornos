package Escuela;
import java.util.Scanner;
public class AlumnosMain {
	static Scanner teclado=new Scanner(System.in);

	final static String[] arrayNom={"Ana","Laura","Jose","María","Belén","Paco","Miguel","Angel","Vicent","Elvi","Pablo","Alex"}; 
	final static String[] arrayApell={"Ab Ba","Bc Cb","Cd Dc","De Ed","Ef Fe","Fg GF","Gh Hg","Hi Ih","Ij JI","Jk Kj","Kl lk","Lm Ml","Mn Nm"}; 
	final static int[] arrayEdad={18,20,19,21,22,24,23};   
	final static String[] arrayAnimales= {"perro","gato","tortuga","periquito","hamster","coballa"};
	final static String[] arrayPlantas= {"geranios","rosas","margaritas","Bugambillas"};
	final static String[] arrayArmas= {"machete","pistola","navaja","puño americano"};
	final static String[] arrayLibros={"isla del tesoro", "las hijas del capital","los desaparecidos","Las hijas del capitán"};

	public static void main(String[] args) {

	
		System.out.println("Cuantos alumnos para la casa Gryffindor");
		int numGry=teclado.nextInt();
		System.out.println("Cuantos alumnos para la casa Slytherin");
		int numSlyth=teclado.nextInt();
		System.out.println("Cuantos alumnos para la casa Hufflepuff");
		int numHuff=teclado.nextInt();
		System.out.println("Cuantos alumnos para la casa Ravenclaw");
		int numRaven=teclado.nextInt();

		int cantAlumnos=numGry+numSlyth+numHuff+numRaven;
		
		Alumnos arrayAlumnos[]=new Alumnos[cantAlumnos];    //array de Alumnos---------------------------
		
			for(int j=0;j<numGry;j++)
			{
				arrayAlumnos[j]=crearGryffindor();     //alumnos Gryffindor
					System.out.println("Nombre "+arrayAlumnos[j].getName()+" Apellidos "+arrayAlumnos[j].getApellidos()+" Edad "+arrayAlumnos[j].getEdad()+" Asignatura "+arrayAlumnos[j].getAsignatura()+" Mascota "+arrayAlumnos[j].ge);
			}
			
			for(int k=numGry;k<(numGry+numSlyth);k++)   //alumnos Slytherin
			{
				arrayAlumnos[k]=creaSlytherin();
				
			
			}
			for(int m=(numGry+numSlyth);m<(numGry+numSlyth+numHuff);m++)   //alumnos Hufflepuff
			{
				arrayAlumnos[m]=creaHufflepuff();
				
				
			}
			for(int n=0;n<numRaven;n++)    // alumnos Ravenclaw;
			{
				arrayAlumnos[n]=creaRavenclaw();
				
				
			}	
		}


	public static int calculoAleatorio(int num)
	{	
		int calc;
		return calc = (int)Math.floor(Math.random()*num);		
	}

	public static Gryffindor crearGryffindor() 
	{
		String nombre=arrayNom[calculoAleatorio(arrayNom.length)];
		String apellido=arrayApell[calculoAleatorio(arrayApell.length)];
		int edad=arrayEdad[calculoAleatorio(arrayEdad.length)];
		String mascota=arrayAnimales[calculoAleatorio(arrayAnimales.length)];

		return new Gryffindor(nombre,apellido,edad,"Entornos de Desarrollo",mascota);
	}
	
	public static Hufflepuff creaHufflepuff() 
	{
		String nombre=arrayNom[calculoAleatorio(arrayNom.length)];
		String apellido=arrayApell[calculoAleatorio(arrayApell.length)];
		int edad=arrayEdad[calculoAleatorio(arrayEdad.length)];
		String planta=arrayPlantas[calculoAleatorio(arrayPlantas.length)];

		return new Hufflepuff(nombre,apellido,edad,"Lenguaje de Marcas",planta);
	}

	public static Ravenclaw creaRavenclaw() 
	{
		String nombre=arrayNom[calculoAleatorio(arrayNom.length)];
		String apellido=arrayApell[calculoAleatorio(arrayApell.length)];
		int edad=arrayEdad[calculoAleatorio(arrayEdad.length)];
		String libro=arrayLibros[calculoAleatorio(arrayLibros.length)];

		return new Ravenclaw (nombre,apellido,edad,"Entornos de Desarrollo",libro);
	}
	
	public static Slytherin creaSlytherin() 
	{
		String nombre=arrayNom[calculoAleatorio(arrayNom.length)];
		String apellido=arrayApell[calculoAleatorio(arrayApell.length)];
		int edad=arrayEdad[calculoAleatorio(arrayEdad.length)];
		String arma=arrayArmas[calculoAleatorio(arrayArmas.length)];

		return new Slytherin(nombre,apellido,edad,"Entornos de Desarrollo",arma);
	}

}
