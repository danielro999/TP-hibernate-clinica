package dao;

import java.util.List;
import org.hibernate.Session;
import pacheco.tp6grupo16.entidad.Medico;
import pacheco.tp6grupo16.entidad.Turno;

public class DaoHibTurno {
	
	public static void crearTurno(Turno t) {
		//variables de configuracion de Hibernate
		ConfiguracionHibernate configuracion = new ConfiguracionHibernate();
		Session session = configuracion.abrirConexion();
		
		session.beginTransaction();//preparar el trabajo
		session.save(t);
		//guarda y cierra
		session.getTransaction().commit();
		configuracion.cerrarSession();
	}
	
	public static void eliminarTurno(Turno turno) 
	{
		//variables de configuracion de Hibernate
		ConfiguracionHibernate configuracion = new ConfiguracionHibernate();
		Session session = configuracion.abrirConexion();
		//preparar el trabajo
		session.beginTransaction();
		//elimina el medico 
 		session.delete(turno);
		//guarda y cierra
		session.getTransaction().commit();
		configuracion.cerrarSession();
	}
	
	public static void eliminarTurnoPorId(long id) 
	{
		//variables de configuracion de Hibernate
		ConfiguracionHibernate configuracion = new ConfiguracionHibernate();
		Session session = configuracion.abrirConexion();
		//preparar el trabajo
		session.beginTransaction();
	
		Turno turno =(Turno)session.get(Turno.class, id);
 		session.delete(turno);
	
		session.getTransaction().commit();
		configuracion.cerrarSession();
	}
	
	public static List<Turno> traerTunos() 
	{
	ConfiguracionHibernate configuracion = new ConfiguracionHibernate();
	Session session = configuracion.abrirConexion();
	
	session.beginTransaction();
	List<Turno>turnos=session.createCriteria(Turno.class).list();
	
    return turnos;
	}
	
	


}
