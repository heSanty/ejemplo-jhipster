package mx.conacyt.componentes.informacion.service.impl;

import java.util.Optional;
import mx.conacyt.componentes.informacion.repository.CompFormatoDocumentoRepository;
import mx.conacyt.componentes.informacion.service.CompFormatoDocumentoService;
import mx.conacyt.componentes.informacion.service.api.dto.CompFormatoDocumentoDto;
import mx.conacyt.componentes.informacion.web.api.mapper.CompFormatoDocumentoMapper;
import org.springframework.stereotype.Service;

@Service
public class CompFormatoDocumentoServiceImpl implements CompFormatoDocumentoService {

    private CompFormatoDocumentoRepository compFormatoDocumentoRepository;

    private CompFormatoDocumentoMapper compFormatoDocumentoMapper;

    public CompFormatoDocumentoServiceImpl(
        CompFormatoDocumentoRepository compFormatoDocumentoRepository,
        CompFormatoDocumentoMapper compFormatoDocumentoMapper
    ) {
        this.compFormatoDocumentoRepository = compFormatoDocumentoRepository;
        this.compFormatoDocumentoMapper = compFormatoDocumentoMapper;
    }

    @Override
    public Optional<CompFormatoDocumentoDto> findOne(Long id) {
        return Optional.of(compFormatoDocumentoMapper.toDto(compFormatoDocumentoRepository.findById(id).get()));
    }
}
