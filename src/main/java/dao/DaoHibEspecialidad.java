package dao;

import org.hibernate.Session;

import pacheco.tp6grupo16.entidad.Especialidad;

public class DaoHibEspecialidad {

	public static void crearEspecialidad(Especialidad esp)
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
