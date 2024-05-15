package pacheco.tp6grupo16;

import java.util.List;

import dao.DaoHibernate;
import pacheco.tp6grupo16.entidad.Medico;

public class App {
	public static void main( String[] args )
	{
		//carga de datos
		Medico m1= new Medico("Kristina", "kisn" , "fem", "02-02-45", "Peron y Eva 1000" , "recoleta", "kristinakisn@gmail.com", "2352-3543" );
		Medico m2= new Medico("leo", "Messi" , "masc", "02-02-90", "Peron 1000" , "miami", "leoMessi@gmail.com", "101010-1010" );
		Medico m3= new Medico("javier", "milei" , "masc", "02-02-72", "av. mitre 444" , "v.Lopez", "libertad@yahoo.com", "2352-3543" );
		Medico m4= new Medico("albert", "ferandez" , "masc", "02-02-44", "ibai 444" , "madrid", "euroa@yahoo.com", "22352-3543" );
		Medico m5= new Medico("jose", "ramirez" , "masc", "02-02-44", "ibai 444" , "madrid", "euroa@yahoo.com", "22352-3543" );
		Medico m6= new Medico("mariel", "gomez" , "fem", "02-02-44", "ibai 444" , "madrid", "euroa@yahoo.com", "22352-3543" );
		Medico m7= new Medico("walter", "shafer" , "masc", "02-02-44", "ibai 444" , "madrid", "euroa@yahoo.com", "22352-3543" );
		Medico m8= new Medico("mildonio", "cardozo" , "masc", "02-02-44", "ibai 444" , "madrid", "euroa@yahoo.com", "22352-3543" );
		Medico m9= new Medico("anglelica", "pareira" , "fem", "02-02-44", "ibai 444" , "madrid", "euroa@yahoo.com", "22352-3543" );
		Medico m10= new Medico("marina", "miro" , "masc", "02-02-44", "ibai 444" , "madrid", "euroa@yahoo.com", "22352-3543" );
		Medico m11= new Medico("julieta", "biondi" , "fem", "02-02-44", "ibai 444" , "madrid", "euroa@yahoo.com", "22352-3543" );

		
		DaoHibernate.crearMedico(m1);
		DaoHibernate.crearMedico(m2);
		DaoHibernate.crearMedico(m3);
		DaoHibernate.crearMedico(m4);
		DaoHibernate.crearMedico(m5);
		DaoHibernate.crearMedico(m6);
		DaoHibernate.crearMedico(m7);
		DaoHibernate.crearMedico(m8);
		DaoHibernate.crearMedico(m9);
		DaoHibernate.crearMedico(m10);
		DaoHibernate.crearMedico(m11);
		
		DaoHibernate.traerMedicos();
		
		//actualizacion de registro 2
	//	Medico m2Act= new Medico(2, "diego", "maradona" , "masc", "02-02-44", 
		//		"segurola 440" , "cielo", "euroa@yahoo.com", "22352-3543" );
		
	//	DaoHibernate.actualizarMedico(m2Act);
		
		//eliminacion de registro 1
	//	DaoHibernate.eliminarMedicoID(1);
		//eliminacion por objeto		
	//	DaoHibernate.eliminarMedicoObjeto(m11);
				
		Medico medicoTraido;
		medicoTraido= DaoHibernate.leerMedico(3);
		//ver medico que traje
		System.out.println("El legajo " + medicoTraido.getLegajo() + " es: " + medicoTraido);
		
		//lista de medicos
		List<Medico> misMedicos;  
		misMedicos=DaoHibernate.traerMedicos();
		 for (Medico med : misMedicos)
		    {
		        System.out.println(med);
		    }	
	}
}
