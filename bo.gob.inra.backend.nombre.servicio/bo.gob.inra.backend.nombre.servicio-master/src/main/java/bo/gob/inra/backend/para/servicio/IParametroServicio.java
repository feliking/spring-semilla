package bo.gob.inra.backend.para.servicio;

import java.util.List;
import java.util.Optional;

import bo.gob.inra.backend.para.modelo.EnParametro;

public interface IParametroServicio {

	List<EnParametro> recuperarPorIdGrupo(int idGrupo);
	Optional<EnParametro> recuperarPorId(int id);
	EnParametro guardar(EnParametro parametro);
	EnParametro actualizar(int id, EnParametro parametro);
}
