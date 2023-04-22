package mx.com.mag.myFirstApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name = "usuarios")
public class UsuarioModel {
	@Id
	@SequenceGenerator (
			name = "usario_sequence",
			sequenceName = "usuario_sequence",
			allocationSize = 1,
			initialValue = 1
	)
	@GeneratedValue (
			strategy = GenerationType.SEQUENCE,
			generator = "usuario_sequence"
	)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "usuario")
	private String usuario;
	
	@Column(name = "contrasena")
	private String contrasena;
}
