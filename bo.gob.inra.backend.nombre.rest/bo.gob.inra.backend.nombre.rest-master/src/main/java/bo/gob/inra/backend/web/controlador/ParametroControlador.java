package bo.gob.inra.backend.web.controlador;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import bo.gob.inra.backend.para.modelo.EnParametro;
import bo.gob.inra.backend.para.servicio.IParametroServicio;

@RestController
@RequestMapping("/api/v1")
public class ParametroControlador {

	@Autowired
	IParametroServicio parametroServicio;

	@GetMapping("/grupo/{id}/parametros")
	public ResponseEntity<List<EnParametro>> listarPorGrupo(@PathVariable int id) {
		List<EnParametro> parametros = parametroServicio.recuperarPorIdGrupo(id);
		return new ResponseEntity<List<EnParametro>>(parametros, HttpStatus.OK);
	}

	@GetMapping("/parametros/{id}")
	public EnParametro recuperarParametro(@PathVariable int id) {
		Optional<EnParametro> parametro = parametroServicio.recuperarPorId(id);
		if (!parametro.isPresent())
			return null;
		return parametro.get();
	}

	@PostMapping("/parametros")
	public ResponseEntity<String> crearParametro(@RequestBody EnParametro parametro) {
		EnParametro parametroAlmacenado = parametroServicio.guardar(parametro);
		String respuesta="";
		return new ResponseEntity<String>(respuesta, HttpStatus.CREATED);
	}

	@PutMapping("/parametros/{id}")
	public ResponseEntity<Object> actualizarParametro(@PathVariable int id, @RequestBody EnParametro parametro) {
		parametroServicio.actualizar(id, parametro);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
}
