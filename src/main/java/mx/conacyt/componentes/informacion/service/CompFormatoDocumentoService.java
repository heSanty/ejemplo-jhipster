package mx.conacyt.componentes.informacion.service;

import java.util.Optional;
import mx.conacyt.componentes.informacion.service.api.dto.CompFormatoDocumentoDto;

public interface CompFormatoDocumentoService {
    Optional<CompFormatoDocumentoDto> findOne(Long id);
}
