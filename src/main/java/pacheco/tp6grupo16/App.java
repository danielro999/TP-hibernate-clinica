package pacheco.tp6grupo16;

import java.util.List;

import org.hibernate.Session;

import dao.ConfiguracionHibernate;
import dao.DaoHibernate;
import pacheco.tp6grupo16.entidad.Especialidad;
import pacheco.tp6grupo16.entidad.Medico;
import pacheco.tp6grupo16.entidad.Usuario;

public class App {
	public static void main( String[] args )
	{
		//carga de Medicos
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



		
		//usuario 1 por medico
		Usuario usuario1 = new Usuario (m1, "kisCampora", "dios");
		m1.setUsuario(usuario1);
		Usuario usuario2 = new Usuario (m2, "cabra", "genio");
		m2.setUsuario(usuario2);
		Usuario usuario3 = new Usuario (m3,"leon","casta");
		m3.setUsuario(usuario3);
		Usuario usuario4 = new Usuario (m4,"spineta","clande");
		m4.setUsuario(usuario4);
		Usuario usuario5 = new Usuario (m5,"eljose","rama");
		m5.setUsuario(usuario5);
		Usuario usuario6 = new Usuario (m6, "marie", "1234");
		m6.setUsuario(usuario6);
		Usuario usuario7 = new Usuario (m7, "wolt", "2345");
		m7.setUsuario(usuario7);
		Usuario usuario8 = new Usuario (m8,"mildi","3456");
		m8.setUsuario(usuario8);
		Usuario usuario9 = new Usuario (m9,"agie","4567");
		m9.setUsuario(usuario9);
		Usuario usuario10 = new Usuario (m10,"mar","5678");
		m10.setUsuario(usuario10);
		Usuario usuario11 = new Usuario (m11,"juliet","6789");
		m11.setUsuario(usuario11);
		
		//especialidades
		Especialidad especialidad1 = new Especialidad();
		Especialidad especialidad2 = new Especialidad();
		Especialidad especialidad3 = new Especialidad();
		Especialidad especialidad4 = new Especialidad();
		
		especialidad1.setNombre("clinico");
		especialidad2.setNombre("pediatra");
		especialidad3.setNombre("traumatologo");
		especialidad4.setNombre("cardiologo");
		
		
		guardarEspecialidad(especialidad1);
		guardarEspecialidad(especialidad2);
		guardarEspecialidad(especialidad3);
		guardarEspecialidad(especialidad4);
		
		m1.setEspecialidad(especialidad1);
		m2.setEspecialidad(especialidad1);
		m3.setEspecialidad(especialidad1);
		m4.setEspecialidad(especialidad1);
		m5.setEspecialidad(especialidad2);
		m6.setEspecialidad(especialidad2);
		m7.setEspecialidad(especialidad4);	
		m8.setEspecialidad(especialidad4);
		m9.setEspecialidad(especialidad4);
		m10.setEspecialidad(especialidad3);
		m11.setEspecialidad(especialidad1);
 		
		
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
		
	
				
		Medico medicoTraido;
		medicoTraido= DaoHibernate.leerMedico(1);
		//ver medico que traje
		System.out.println("El legajo " + medicoTraido.getLegajo() + " es: " + medicoTraido);
		
		
	}
	
	private static  void guardarEspecialidad(Especialidad esp)
	{
		//variables de configuracion de Hibernate
		ConfiguracionHibernate configuracion = new ConfiguracionHibernate();
		Session session = configuracion.abrirConexion();
		
		session.beginTransaction();//preparar el trabajo
		session.save(esp);
		//guarda y cierra
		session.getTransaction().commit();
		configuracion.cerrarSession();
	}
}
