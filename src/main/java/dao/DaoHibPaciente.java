package dao;

import java.util.List;

import org.hibernate.Session;

import pacheco.tp6grupo16.entidad.Paciente;
import pacheco.tp6grupo16.entidad.Turno;

public class DaoHibPaciente {
	
	public static void crearPaciente(Paciente pas) {
		//variables de configuracion de Hibernate
				ConfiguracionHibernate configuracion = new ConfiguracionHibernate();
				Session session = configuracion.abrirConexion();
				
				session.beginTransaction();//preparar el trabajo
				session.save(pas);
				//guarda y cierra
				session.getTransaction().commit();
				configuracion.cerrarSession();
	}
	
	public static List<Paciente> ListarTurnos() 
	{
	ConfiguracionHibernate configuracion = new ConfiguracionHibernate();
	Session session = configuracion.abrirConexion();
	
	session.beginTransaction();
	List<Paciente>paciente =session.createCriteria(Paciente.class).list();
	
    return paciente ;
	}
	
}
