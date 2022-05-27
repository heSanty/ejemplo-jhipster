package mx.conacyt.componentes.informacion.service.mapper;

import mx.conacyt.componentes.informacion.domain.CompFormatoDocumento;
import mx.conacyt.componentes.informacion.service.api.dto.CompFormatoDocumentoDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface CompFormatoDocumentoMapper extends EntityMapper<CompFormatoDocumentoDto, CompFormatoDocumento> {}
