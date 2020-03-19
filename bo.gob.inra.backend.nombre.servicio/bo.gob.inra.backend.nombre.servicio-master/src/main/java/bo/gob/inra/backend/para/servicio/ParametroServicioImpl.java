package bo.gob.inra.backend.para.servicio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import bo.gob.inra.backend.para.modelo.EnParametro;
import bo.gob.inra.backend.para.repositorio.ParParametroRepositorio;

@Service
public class ParametroServicioImpl implements IParametroServicio {
	@Autowired
	ParParametroRepositorio parametroRepositorio;

	@Override
	@Transactional(readOnly = true)
	public List<EnParametro> recuperarPorIdGrupo(int idGrupo) {
		return parametroRepositorio.findByidGrupoParametro(idGrupo);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<EnParametro> recuperarPorId(int id) {
		return parametroRepositorio.findById(id);
	}

	@Override
	public EnParametro guardar(EnParametro parametro) {
		return parametroRepositorio.save(parametro);
	}

	@Override
	public EnParametro actualizar(int id, EnParametro parametro) {
		Optional<EnParametro> parametroRecuperado = parametroRepositorio.findById(id);
		if (!parametroRecuperado.isPresent())
			return null;
		EnParametro parametroPorActualizar = parametroRecuperado.get();
		parametroPorActualizar.setIdGrupoParametro(parametro.getIdGrupoParametro());
		parametroPorActualizar.setNombre(parametro.getNombre());
		return parametroRepositorio.save(parametroPorActualizar);
	}
}
