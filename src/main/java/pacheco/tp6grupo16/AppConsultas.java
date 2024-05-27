package pacheco.tp6grupo16;

public class AppConsultas {

	public static void main(String[] args) {
		ConsultasHql consultasHql = new ConsultasHql();
/*
		System.out.println("\n     ---  Medicos con legajo de mayor a menor ---\n");

		consultasHql.mostrarMedicosOrdenadosPorLegajoDesc();
		consultasHql.cerrar();

		System.out.println("\n     ---  Medicos con legajo de menor a mayor ---\n");
		consultasHql.mostrarMedicosOrdenadosPorLegajoAsc();
		
		System.out.println("\n     ---  mostrar turnos con medico legajo 9 dia 01/01/2025 ---\n");
		consultasHql.mostrarTurnosPorDia();
		
		System.out.println("\n     ---  mostrar solo  legajos medicos ---\n");
		consultasHql.mostrarSoloLegajoMedico();
		
		System.out.println("\n     ---  mostrar medico con mayor legajo ---\n");
		consultasHql.mostrarMedicoConMayorLegajo();
*/		
		System.out.println("\n     ---  mostrar turno con fecha ---\n");
		consultasHql.mostrarEstadoTurnosPorFecha();
		
	}

}
