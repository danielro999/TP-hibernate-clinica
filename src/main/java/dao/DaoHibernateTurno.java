package dao;

import org.hibernate.Session;
import pacheco.tp6grupo16.entidad.Turno;

public class DaoHibernateTurno {
	
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

}
