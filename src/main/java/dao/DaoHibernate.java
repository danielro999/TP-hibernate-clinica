package dao;

import java.util.List;

import org.hibernate.Session;

import pacheco.tp6grupo16.entidad.Medico;

public class DaoHibernate {

	public static void crearMedico(Medico medico)
	{
		//variables de configuracion de Hibernate
		ConfiguracionHibernate configuracion = new ConfiguracionHibernate();
		Session session = configuracion.abrirConexion();
		
		session.beginTransaction();//preparar el trabajo
		
		session.save(medico);
		//guarda y cierra
		session.getTransaction().commit();
		configuracion.cerrarSession();
	}
	
	public static Medico leerMedico(int id)
	{
		//variables de configuracion de Hibernate
		ConfiguracionHibernate configuracion = new ConfiguracionHibernate();
		Session session = configuracion.abrirConexion();
				
		session.beginTransaction();//preparar el trabajo
		Medico medicoLeido= (Medico)session.get(Medico.class, id);
		
		//cierra
		configuracion.cerrarSession();
		return medicoLeido;
	}
	
	public static List<Medico> traerMedicos () 
		{
		ConfiguracionHibernate configuracion = new ConfiguracionHibernate();
		Session session = configuracion.abrirConexion();
		
		session.beginTransaction();
		List<Medico>misMedicos=session.createCriteria(Medico.class).list();
		
		/*System.out.println("Lista de Medicos:");
	    for (Medico med : misMedicos)
	    {
	        System.out.println(med);
	    }	*/
	    
	    return misMedicos;
		}
	
	public static void eliminarMedicoID(int legajo) 
	{
		//variables de configuracion de Hibernate
		ConfiguracionHibernate configuracion = new ConfiguracionHibernate();
		Session session = configuracion.abrirConexion();
		//preparar el trabajo
		session.beginTransaction();
		//busca el medico por numero de legajo
		Medico medico =(Medico)session.get(Medico.class, legajo);
		//elimina el medico 
 		session.delete(medico);
		//guarda y cierra
		session.getTransaction().commit();
		configuracion.cerrarSession();
	}
	
	public static void eliminarMedicoObjeto(Medico medico) 
	{
		//variables de configuracion de Hibernate
		ConfiguracionHibernate configuracion = new ConfiguracionHibernate();
		Session session = configuracion.abrirConexion();
		//preparar el trabajo
		session.beginTransaction();
		//elimina el medico 
 		session.delete(medico);
		//guarda y cierra
		session.getTransaction().commit();
		configuracion.cerrarSession();
	}
	
	public static void actualizarMedico(Medico medico)
	{
		//variables de configuracion de Hibernate
		ConfiguracionHibernate configuracion = new ConfiguracionHibernate();
		Session session = configuracion.abrirConexion();
		
		session.beginTransaction();//preparar el trabajo
		
		session.update(medico);
		//guarda y cierra
		session.getTransaction().commit();
		configuracion.cerrarSession();
	}
	
	/*
	 // actualiza el registro con el numero de id
	public static void actualizarMedico(Medico medico, int legajo)
	{
		//variables de configuracion de Hibernate
		ConfiguracionHibernate configuracion = new ConfiguracionHibernate();
		Session session = configuracion.abrirConexion();
		//preparar el trabajo
		session.beginTransaction();
		//busca medico por el numeron del legajo
		medico.setLegajo(legajo);
		session.update(medico);
		//guarda y cierra
		session.getTransaction().commit();
		configuracion.cerrarSession();
	}
	*/
	
}
