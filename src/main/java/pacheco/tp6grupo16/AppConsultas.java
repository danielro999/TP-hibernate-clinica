package pacheco.tp6grupo16;

public class AppConsultas {

	public static void main(String[] args) {
		ConsultasHql consultasHql = new ConsultasHql();

		System.out.println("\n     ---  Medicos con legajo de mayor a menor ---\n");

		consultasHql.mostrarMedicosOrdenadosPorLegajoDesc();
		consultasHql.cerrar();

		System.out.println("\n     ---  Medicos con legajo de menor a mayor ---\n");
		consultasHql.mostrarMedicosOrdenadosPorLegajoAsc();
		
		System.out.println("\n     ---  mostrar turnos con medicos ---\n");
		consultasHql.mostrarTurnosPorDia();
	
		
		
	}

}
