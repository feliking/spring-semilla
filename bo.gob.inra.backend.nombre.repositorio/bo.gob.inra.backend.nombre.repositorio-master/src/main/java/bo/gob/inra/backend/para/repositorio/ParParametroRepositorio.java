package bo.gob.inra.backend.para.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bo.gob.inra.backend.para.modelo.EnParametro;

@Repository
public interface ParParametroRepositorio extends JpaRepository<EnParametro, Integer> {
	
	List<EnParametro> findByidGrupoParametro(Integer idGrupo);
}
