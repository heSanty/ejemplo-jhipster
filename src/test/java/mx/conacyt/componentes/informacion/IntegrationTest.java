package mx.conacyt.componentes.informacion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import mx.conacyt.componentes.informacion.InformacionMsApp;
import mx.conacyt.componentes.informacion.config.TestSecurityConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { InformacionMsApp.class, TestSecurityConfiguration.class })
public @interface IntegrationTest {
}
