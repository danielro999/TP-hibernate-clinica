package pacheco.tp6grupo16;
import dao.DaoHibPaciente;
import java.util.List;

import dao.DaoHibEspecialidad;
import dao.DaoHibMedico;
import dao.DaoHibTurno;
import pacheco.tp6grupo16.entidad.Especialidad;
import pacheco.tp6grupo16.entidad.Medico;
import pacheco.tp6grupo16.entidad.Paciente;
import pacheco.tp6grupo16.entidad.Turno;                                
import pacheco.tp6grupo16.entidad.Usuario;

public class App {
	public static void main(String[] args) {
		// carga de Medicos
		Medico m1 = new Medico("Kristina", "kisn", "fem", "02-02-45", "Peron y Eva 1000", "recoleta",
				"kristinakisn@gmail.com", "2352-3543");
		Medico m2 = new Medico("leo", "Messi", "masc", "02-02-90", "Peron 1000", "miami", "leoMessi@gmail.com",
				"101010-1010");
		Medico m3 = new Medico("javier", "milei", "masc", "02-02-72", "av. mitre 444", "v.Lopez", "libertad@yahoo.com",
				"2352-3543");
		Medico m4 = new Medico("albert", "ferandez", "masc", "02-02-44", "ibai 444", "madrid", "euroa@yahoo.com",
				"22352-3543");
		Medico m5 = new Medico("jose", "ramirez", "masc", "02-02-44", "ibai 444", "madrid", "euroa@yahoo.com",
				"22352-3543");
		Medico m6 = new Medico("mariel", "gomez", "fem", "02-02-44", "ibai 444", "madrid", "euroa@yahoo.com",
				"22352-3543");
		Medico m7 = new Medico("walter", "shafer", "masc", "02-02-44", "ibai 444", "madrid", "euroa@yahoo.com",
				"22352-3543");
		Medico m8 = new Medico("mildonio", "cardozo", "masc", "02-02-44", "ibai 444", "madrid", "euroa@yahoo.com",
				"22352-3543");
		Medico m9 = new Medico("anglelica", "pareira", "fem", "02-02-44", "ibai 444", "madrid", "euroa@yahoo.com",
				"22352-3543");
		Medico m10 = new Medico("marina", "miro", "masc", "02-02-44", "ibai 444", "madrid", "euroa@yahoo.com",
				"22352-3543");
		Medico m11 = new Medico("julieta", "biondi", "fem", "02-02-44", "ibai 444", "madrid", "euroa@yahoo.com",
				"22352-3543");

		// usuario 1 por medico
		Usuario usuario1 = new Usuario(m1, "kisCampora", "dios");
		m1.setUsuario(usuario1);
		Usuario usuario2 = new Usuario(m2, "cabra", "genio");
		m2.setUsuario(usuario2);
		Usuario usuario3 = new Usuario(m3, "leon", "casta");
		m3.setUsuario(usuario3);
		Usuario usuario4 = new Usuario(m4, "spineta", "clande");
		m4.setUsuario(usuario4);
		Usuario usuario5 = new Usuario(m5, "eljose", "rama");
		m5.setUsuario(usuario5);
		Usuario usuario6 = new Usuario(m6, "marie", "1234");
		m6.setUsuario(usuario6);
		Usuario usuario7 = new Usuario(m7, "wolt", "2345");
		m7.setUsuario(usuario7);
		Usuario usuario8 = new Usuario(m8, "mildi", "3456");
		m8.setUsuario(usuario8);
		Usuario usuario9 = new Usuario(m9, "agie", "4567");
		m9.setUsuario(usuario9);
		Usuario usuario10 = new Usuario(m10, "mar", "5678");
		m10.setUsuario(usuario10);
		Usuario usuario11 = new Usuario(m11, "juliet", "6789");
		m11.setUsuario(usuario11);

		// especialidades
		Especialidad especialidad1 = new Especialidad("clinico");
		Especialidad especialidad2 = new Especialidad("pediatra");
		Especialidad especialidad3 = new Especialidad("traumatologo");
		Especialidad especialidad4 = new Especialidad("cardiologo");
		Especialidad especialidad5 = new Especialidad("urologo");
		Especialidad especialidad6 = new Especialidad("oculista");
		Especialidad especialidad7 = new Especialidad("nutrisionista");
		Especialidad especialidad8 = new Especialidad("diabetologa");
		Especialidad especialidad9 = new Especialidad("ginecologo");
		Especialidad especialidad10 = new Especialidad("neumonologo");
		
		
	    DaoHibEspecialidad.crearEspecialidad(especialidad1);
		DaoHibEspecialidad.crearEspecialidad(especialidad2);
		DaoHibEspecialidad.crearEspecialidad(especialidad3);
		DaoHibEspecialidad.crearEspecialidad(especialidad4);
		DaoHibEspecialidad.crearEspecialidad(especialidad5);
		DaoHibEspecialidad.crearEspecialidad(especialidad6);
		DaoHibEspecialidad.crearEspecialidad(especialidad7);
		DaoHibEspecialidad.crearEspecialidad(especialidad8);
		DaoHibEspecialidad.crearEspecialidad(especialidad9);
		DaoHibEspecialidad.crearEspecialidad(especialidad10);
		

		m1.setEspecialidad(especialidad1);
		m2.setEspecialidad(especialidad1);
		m3.setEspecialidad(especialidad1);
		m4.setEspecialidad(especialidad1);
		m5.setEspecialidad(especialidad2);
		m6.setEspecialidad(especialidad2);
		m7.setEspecialidad(especialidad4);
		m8.setEspecialidad(especialidad4);
		m9.setEspecialidad(especialidad4);
		m10.setEspecialidad(especialidad3);
		m11.setEspecialidad(especialidad1);

		// La clase Medico usa CascadeType.ALL para propagar la creacion de las tablas
		// relacionadas(usuario y especilidad)
		DaoHibMedico.crearMedico(m1);
		DaoHibMedico.crearMedico(m2);
		DaoHibMedico.crearMedico(m3);
		DaoHibMedico.crearMedico(m4);
		DaoHibMedico.crearMedico(m5);
		DaoHibMedico.crearMedico(m6);
		DaoHibMedico.crearMedico(m7);
		DaoHibMedico.crearMedico(m8);
		DaoHibMedico.crearMedico(m9);
		DaoHibMedico.crearMedico(m10);
		DaoHibMedico.crearMedico(m11);

		// crear pacientes
		Paciente paciente1 = new Paciente("walter", "guerrero", "21212121", "1549352758", "eva peron 2942", "garin",
				"bsas", "07/10/76", "walter@gmail.com");
		DaoHibPaciente.crearPaciente(paciente1);
		Paciente paciente2 = new Paciente("carla", "calatayud", "11111111", "66666666", "eva peron 2942", "garin",
				"bsas", "07/10/79", "carla@gmail.com");
		DaoHibPaciente.crearPaciente(paciente2);
		Paciente paciente3 = new Paciente("mateo", "guerrero", "222222222", "57575755", "eva peron 2942", "garin",
				"bsas", "07/10/2013", "mateo@gmail.com");
		DaoHibPaciente.crearPaciente(paciente3);
		Paciente paciente4 = new Paciente("rosario", "guerrero", "33333333", "78787878", "eva peron 2942", "garin",
				"bsas", "07/10/2006", "rosario@gmail.com");
		DaoHibPaciente.crearPaciente(paciente4);
		Paciente paciente5 = new Paciente("martin", "calatayud", "444444444", "808080880", "las rosas 1617", "talar",
				"bsas", "07/10/76", "walter@gmail.com");
		DaoHibPaciente.crearPaciente(paciente5);
		Paciente paciente6 = new Paciente("juan", "calatayud", "555555555", "574747474", "eva peron 2942", "pacheco",
				"bsas", "07/10/79", "carla@gmail.com");
		DaoHibPaciente.crearPaciente(paciente6);
		Paciente paciente7 = new Paciente("mateo", "guerrero", "66666666", "10010010", "eva peron 2942", "pacheco",
				"bsas", "07/10/2013", "mateo@gmail.com");
		DaoHibPaciente.crearPaciente(paciente7);
		Paciente paciente8 = new Paciente("rosario", "guerrero", "777777777", "454545454", "eva peron 2942", "escobar",
				"bsas", "07/10/2006", "rosario@gmail.com");
		DaoHibPaciente.crearPaciente(paciente8);
		Paciente paciente9 = new Paciente("rosario", "guerrero", "888888888", "123456788", "eva peron 2942", "san isidro",
				"bsas", "07/10/2006", "rosario@gmail.com");
		DaoHibPaciente.crearPaciente(paciente9);
		Paciente paciente10 = new Paciente("rosario", "guerrero", "99999999", "90909090", "eva peron 2942", "tigre",
				"bsas", "07/10/2006", "rosario@gmail.com");
		DaoHibPaciente.crearPaciente(paciente10);
		Paciente paciente11= new Paciente("rosario", "guerrero", "10101010101", "700700700", "eva peron 2942", "san fernado",
				"bsas", "07/10/2006", "rosario@gmail.com");
		DaoHibPaciente.crearPaciente(paciente11);


		// crear un turno
				Turno turno1 = new Turno(m1, paciente1, "20/06/24", "8hs", "primera ves", "particular");
				Turno turno2 = new Turno(m1, paciente2, "20/06/24", "8:30hs", "primera ves", "particular");
				Turno turno3 = new Turno(m3, paciente11, "22/06/24", "16hs", "chequeo", "galeno");
				Turno turno4 = new Turno(m1, paciente5, "21/06/24", "8hs", "control", "austral");
				Turno turno5 = new Turno(m1, paciente6, "21/06/24", "8:30hs", "control", "medicus");
				Turno turno6 = new Turno(m3, paciente7, "22/06/24", "16hs", "chequeo", "austral");
				Turno turno7 = new Turno(m1, paciente7, "23/06/24", "8hs", "chequeo", "ioma");
				Turno turno8 = new Turno(m1, paciente7, "24/06/24", "8:30hs", "primera ves", "femeba");
				Turno turno9 = new Turno(m3, paciente8, "25/06/24", "16hs", "analisis", "ospia");
				Turno turno10 = new Turno(m3, paciente8, "29/06/24", "16hs", "chequeo", "galeno");
				
				
				
				DaoHibTurno.crearTurno(turno1);
				DaoHibTurno.crearTurno(turno2);
				DaoHibTurno.crearTurno(turno3);
				DaoHibTurno.crearTurno(turno4);
				DaoHibTurno.crearTurno(turno5);
				DaoHibTurno.crearTurno(turno6);
				DaoHibTurno.crearTurno(turno7);
				DaoHibTurno.crearTurno(turno8);
				DaoHibTurno.crearTurno(turno9);
				DaoHibTurno.crearTurno(turno10);
		
		System.out.println("\n		---  Lista de pacientes  ---\n");
		 
		List<Paciente> pacientes = DaoHibPaciente.ListarTurnos();
		
		for (Paciente paciente : pacientes) {
			System.out.println(paciente);
		}
		
		
		
		System.out.println("\n		---  lista turnos  ---\n");
		
		List<Turno> turnos = DaoHibTurno.ListarTurnos();
		
		for (Turno turno : turnos) 
		{
			System.out.println(turno);
		}
		
		
		System.out.println("\n		---  turno id=1 eliminado  ---\n");

		DaoHibTurno.eliminarTurnoPorId(1);
		
		turnos = DaoHibTurno.ListarTurnos();
		for (Turno turno : turnos) 
		{
			System.out.println(turno);
		}
		
	
		System.out.println("\n		---  turno id=2 actualizado  ---\n");

		Turno turnoUpd = new Turno(2, m3, paciente1, "20/06/25", "700hs", "mal aliento", "particular");
		DaoHibTurno.actualizarTurno(turnoUpd);
		turnos = DaoHibTurno.ListarTurnos();
		for (Turno turno : turnos) {
			System.out.println(turno);
		}
		
	
		System.out.println( "\n		---  Medicos y sus usuarios  ---\n");

		List<Medico> medicos = DaoHibMedico.ListarMedicos();
		
		for (Medico medico : medicos) 
		{
			System.out.println("medico= " + medico.getNombre()+ " " + medico.getApellido() + ", "
								+ "ususario= " + medico.getUsuario().getNombreUsuario());
		}
		
		
		
	}
}
