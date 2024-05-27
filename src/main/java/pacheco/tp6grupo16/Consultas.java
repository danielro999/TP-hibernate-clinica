package pacheco.tp6grupo16;
import java.util.List;
import org.hibernate.Session;
import pacheco.tp6grupo16.entidad.Medico;
import dao.ConfiguracionHibernate;

public class Consultas {

	public static void main(String[] args) {
		ConfiguracionHibernate cfgH = new ConfiguracionHibernate();
		Session session = cfgH.abrirConexion();
		
		List<Medico> listaMedicos = (List<Medico>)session.createQuery("FROM Medico").list();
		for (Medico medico : listaMedicos) {
			System.out.println("Medico = "+ medico.getNombre() + " "+ medico.getApellido()+ ", " + medico.getEspecialidad()+ ", " +
								medico.getUsuario());
		}		
		session.close();
	}

}
