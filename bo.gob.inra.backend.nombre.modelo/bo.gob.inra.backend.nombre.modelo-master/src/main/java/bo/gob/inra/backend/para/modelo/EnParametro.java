package bo.gob.inra.backend.para.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Parametro", schema = "INRA", catalog = "BDSistema")
public class EnParametro implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdParametro", nullable = false)
	private Integer idParametro;
	@Column(name = "IdGrupoParametro", nullable = false)
	private Integer idGrupoParametro;
	@Column(name = "Nombre", nullable = false)
	private String nombre;
	@Column(name = "CodigoDDRR")
	private String codigoDdrr;
	@Column(name = "Descripcion")
	private String descripcion;
	@Column(name = "Estado")
	private Integer estado;
	@Temporal(TemporalType.DATE)
	@Column(name = "Fecha")
	private Date fecha;
	@Column(name = "CuentaUsuario")
	private String cuentaUsuario;
	@Column(name = "IdUsuarioLog")
	private Integer idUsuarioLog;

	public EnParametro(Integer idParametro, Integer idGrupoParametro, String nombre, String codigoDdrr,
			String descripcion, Integer estado, Date fecha, String cuentaUsuario, Integer idUsuarioLog) {
		super();
		this.idParametro = idParametro;
		this.idGrupoParametro = idGrupoParametro;
		this.nombre = nombre;
		this.codigoDdrr = codigoDdrr;
		this.descripcion = descripcion;
		this.estado = estado;
		this.fecha = fecha;
		this.cuentaUsuario = cuentaUsuario;
		this.idUsuarioLog = idUsuarioLog;
	}

	public Integer getIdParametro() {
		return idParametro;
	}

	public void setIdParametro(Integer idParametro) {
		this.idParametro = idParametro;
	}

	public Integer getIdGrupoParametro() {
		return idGrupoParametro;
	}

	public void setIdGrupoParametro(Integer idGrupoParametro) {
		this.idGrupoParametro = idGrupoParametro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigoDdrr() {
		return codigoDdrr;
	}

	public void setCodigoDdrr(String codigoDdrr) {
		this.codigoDdrr = codigoDdrr;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getCuentaUsuario() {
		return cuentaUsuario;
	}

	public void setCuentaUsuario(String cuentaUsuario) {
		this.cuentaUsuario = cuentaUsuario;
	}

	public Integer getIdUsuarioLog() {
		return idUsuarioLog;
	}

	public void setIdUsuarioLog(Integer idUsuarioLog) {
		this.idUsuarioLog = idUsuarioLog;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "EnParametro [idParametro=" + idParametro + ", idGrupoParametro=" + idGrupoParametro + ", nombre="
				+ nombre + ", codigoDdrr=" + codigoDdrr + ", descripcion=" + descripcion + ", estado=" + estado
				+ ", fecha=" + fecha + ", cuentaUsuario=" + cuentaUsuario + ", idUsuarioLog=" + idUsuarioLog + "]";
	}

}
