package mx.conacyt.componentes.informacion.web.api.impl;

import java.util.Optional;
import mx.conacyt.componentes.informacion.service.CompFormatoDocumentoService;
import mx.conacyt.componentes.informacion.service.api.dto.CompFormatoDocumentoDto;
import mx.conacyt.componentes.informacion.web.api.InformacionApiDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import tech.jhipster.web.util.ResponseUtil;

@Service
public class InformacionApiDelegateImp implements InformacionApiDelegate {

    private CompFormatoDocumentoService compFormatoDocumentoService;

    public InformacionApiDelegateImp(CompFormatoDocumentoService compFormatoDocumentoService) {
        this.compFormatoDocumentoService = compFormatoDocumentoService;
    }

    @Override
    public ResponseEntity<CompFormatoDocumentoDto> getCompFormatoDocumentoUsingGET(Long id) {
        Optional<CompFormatoDocumentoDto> compFormatoDocumentoDto = compFormatoDocumentoService.findOne(id);
        return ResponseUtil.wrapOrNotFound(compFormatoDocumentoDto);
    }
}
