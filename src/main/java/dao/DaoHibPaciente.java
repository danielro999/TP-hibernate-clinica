package dao;

import org.hibernate.Session;

import pacheco.tp6grupo16.entidad.Paciente;

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
}
