package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class ConfiguracionHibernate {
	//dos variables
		private SessionFactory sessioFactory;
		private Session session;
		
		//constructor
		public ConfiguracionHibernate()
		{
			Configuration configuration =new Configuration();
			configuration.configure();
			ServiceRegistry serviceregistry = new ServiceRegistryBuilder()
					.applySettings(configuration.getProperties())
					.buildServiceRegistry();
			sessioFactory=configuration.buildSessionFactory(serviceregistry);//apunta a mi hibernate.cfg.xml y sus configuraciones
		}
		
		//metodo abrir  punto1 
		public Session abrirConexion() 
		{
			session=sessioFactory.openSession();
			return session;
		}
		
		public void cerrarSession()
		{
			session.close();
			cerrarSessionFactory();
			
		}
		public void cerrarSessionFactory()
		{
			sessioFactory.close();
		}

}
