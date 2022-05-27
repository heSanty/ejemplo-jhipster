package mx.conacyt.componentes.informacion.repository;

import mx.conacyt.componentes.informacion.domain.CompFormatoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompFormatoDocumentoRepository extends JpaRepository<CompFormatoDocumento, Long> {}
