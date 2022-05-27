package mx.conacyt.componentes.informacion.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//import lombok.Data;

/**
 * A CompFormatoDocumento.
 */
//@Data
@Entity
@Table(name = "comp_formato_documento")
public class CompFormatoDocumento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long idCompFormatoDocumento;

    @Column(name = "id_comp_docto_funcionalidad")
    private Long idCompDoctoFuncionalidad;

    @Column(name = "id_formato_documento")
    private Long idFormatoDocumento;

    @Column(name = "nombre")
    private String nombre;

    public Long getIdCompFormatoDocumento() {
        return idCompFormatoDocumento;
    }

    public void setIdCompFormatoDocumento(Long idCompFormatoDocumento) {
        this.idCompFormatoDocumento = idCompFormatoDocumento;
    }

    public Long getIdCompDoctoFuncionalidad() {
        return idCompDoctoFuncionalidad;
    }

    public void setIdCompDoctoFuncionalidad(Long idCompDoctoFuncionalidad) {
        this.idCompDoctoFuncionalidad = idCompDoctoFuncionalidad;
    }

    public Long getIdFormatoDocumento() {
        return idFormatoDocumento;
    }

    public void setIdFormatoDocumento(Long idFormatoDocumento) {
        this.idFormatoDocumento = idFormatoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
