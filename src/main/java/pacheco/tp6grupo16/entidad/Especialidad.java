package pacheco.tp6grupo16.entidad;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "ESPECIALIDADES")
public class Especialidad implements Serializable {
	
	//implementar serializable
	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    
    //@OneToMany(mappedBy = "especialidad")
   // private List<Medico> medicos;

    public Especialidad() { }
    
	public Especialidad(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}



	// Getters y Setters
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/*
	public List<Medico> getMedicos() {
		return medicos;
	}

	public void setMedicos(List<Medico> medicos) {
		this.medicos = medicos;
	}
	*/

	@Override
	public String toString() {
		return "Especialidad [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
