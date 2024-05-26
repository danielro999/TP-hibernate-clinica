package pacheco.tp6grupo16;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import dao.ConfiguracionHibernate;
import java.util.List;
import pacheco.tp6grupo16.entidad.Medico;

public class ConsultasHql {
	private SessionFactory sessionFactory;

	public ConsultasHql() {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		sessionFactory = config.buildSessionFactory();
	}

	public void mostrarMedicosOrdenadosPorLegajoDesc() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		String hql = "FROM Medico m ORDER BY m.legajo DESC";
		List<Medico> medicos = session.createQuery(hql).list();

		for (Medico medico : medicos) {
			System.out.println(medico);
		}

		tx.commit();
		session.close();
	}

	public void cerrar() {
		sessionFactory.close();
	}

	public void mostrarMedicosOrdenadosPorLegajoAsc() {
		ConfiguracionHibernate cfgH = new ConfiguracionHibernate();
		Session session = cfgH.abrirConexion();

		List<Medico> listaMedicos = (List<Medico>)session.createQuery("FROM Medico m ORDER BY m.legajo ASC").list();
		for (Medico medico : listaMedicos) {
			System.out.println(medico);
		}

		session.close();

	}

}
