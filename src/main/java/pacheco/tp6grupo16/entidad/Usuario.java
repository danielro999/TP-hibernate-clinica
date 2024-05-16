package pacheco.tp6grupo16.entidad;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "USUARIOS")
public class Usuario implements Serializable {
	
	//implementar serializable
	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne(mappedBy = "usuario", fetch = FetchType.LAZY)
    private Medico medico;
    
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    
	
    private String contrasenia;

    
    
    public Usuario() {
	}

	public Usuario(Medico medico, String nombreUsuario, String contrasenia) {
		super();
		this.medico = medico;
		this.nombreUsuario = nombreUsuario;
		this.contrasenia = contrasenia;
	}


    
    
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public void setContrasenia(String contraseña) {
		this.contrasenia = contraseña;
	}

	@Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                '}';
    }
}
