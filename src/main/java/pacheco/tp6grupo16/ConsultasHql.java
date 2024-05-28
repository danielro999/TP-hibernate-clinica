package pacheco.tp6grupo16;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import dao.ConfiguracionHibernate;
import java.util.List;
import pacheco.tp6grupo16.entidad.Medico;
import pacheco.tp6grupo16.entidad.Turno;

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

		List<Object[]> listaMedicosAtributo = (List<Object[]>)session.createQuery(
				"SELECT m.legajo, m.nombre, m.apellido  FROM Medico m ORDER BY m.legajo ASC").list();
		for (Object[] medicoAtributo : listaMedicosAtributo) {
			System.out.println("Legajo: "
					 + medicoAtributo[0] 
							 + ", Nombre: " + medicoAtributo[1] 
									 + " " + medicoAtributo[2]);
		}

		session.close();
	}
	
	//listar turnos
	public void mostrarTurnosPorDia() {
		ConfiguracionHibernate cfgH = new ConfiguracionHibernate();
		Session session = cfgH.abrirConexion();
		List<Object[]> listaTurnos = (List<Object[]>)session.createQuery("FROM Turno as tur INNER JOIN tur.medico "
				+ "where tur.fecha = '01/01/2025' and tur.medico.legajo = 9").list();
		
		for (Object[] objetoTurno : listaTurnos) {
			Turno turno =(Turno)objetoTurno[0]; 
			Medico medico =(Medico)objetoTurno[1];
			
			System.out.println("-dia de Turno: "+ turno.getFecha() + " -Legajo Medico: "+ medico.getLegajo()
			+" -Apellido: " + medico.getApellido()
			+" -hora de turno: " + turno.getHora()  );
		}

		session.close();
	}
	
	//SELECT ONE COLUMN
	public void  mostrarSoloLegajoMedico() {
		ConfiguracionHibernate cfgH = new ConfiguracionHibernate();
		Session session = cfgH.abrirConexion();

		List<Integer> listaMedicos = (List<Integer>)session.createQuery("Select m.legajo FROM  Medico as m").list();
		for (Integer medLegajos : listaMedicos) {
			System.out.println("Nro de legajo: " + medLegajos);
		}
		session.close();
	}
	
	public void mostrarMedicoConMayorLegajo() {
	    ConfiguracionHibernate cfgH = new ConfiguracionHibernate();
	    Session session = cfgH.abrirConexion();

	    Transaction tx = session.beginTransaction();

	    String hql = "SELECT MAX(m.legajo) FROM Medico m";
	    Integer maxLegajo = (Integer) session.createQuery(hql).uniqueResult();

	    System.out.println("El médico con el mayor número de legajo tiene el legajo: " + maxLegajo);

	    tx.commit();
	    session.close();
	}
	public void mostrarEstadoTurnosEntreFechas(String fechaInicio, String fechaFinal) {
		ConfiguracionHibernate cfgH = new ConfiguracionHibernate();
		Session session = cfgH.abrirConexion();
		
		// consulta para obtener el estado de los turnos entre las fechas ingresada por paremetro
		@SuppressWarnings("unchecked")
		List<Object[]> listaPresentres = (List<Object[]>)session.createQuery(
				"SELECT t.fecha, t.estado FROM Turno t WHERE str_to_date(t.fecha, '%d/%m/%Y') "
				+ "BETWEEN "+ fechaInicio +" AND " + fechaFinal +
				"order by str_to_date(t.fecha, '%d/%m/%Y')").list();
		// variables para los calculos de los porcentajes
		int cantidadAusentes= 0;
		int cantidadPresentes= 0;
		float suma;
		float porcentajeAusente;
		float porcentajePresente;
		
		// iterar sobre los estados obtenidos, contando las cantidades de los ausentes y presenstes
		for (Object[] objetosTurno : listaPresentres) {
			System.out.println(objetosTurno[0]+" "+ objetosTurno[1] );
			if (objetosTurno[1].equals("ausente")) {
				cantidadAusentes+= 1;	
			}
			if (objetosTurno[1].equals("presente")) {
				cantidadPresentes+= 1;
			} 
		}
		// una ves contados las cantidades de ausentes y presentes se hacen los calculos procentuales
		suma= cantidadAusentes + cantidadPresentes;
		porcentajeAusente= cantidadAusentes / suma * 100;
		porcentajePresente = cantidadPresentes / suma * 100;
		
		//imprimir en pantalla los resultados
		System.out.println("\ncantidad ausentes= "+cantidadAusentes);
		System.out.println("cantidad presenetes= "+cantidadPresentes+"\n");
		System.out.printf("\nPorcentaje de ausentes= %.0f%%  \n", porcentajeAusente);
		System.out.printf("Porcentaje de presentes= %.0f%% ", porcentajePresente);
		session.close();
	}
	
}
