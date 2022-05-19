package mx.conacyt.componentes.informacion;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("mx.conacyt.componentes.informacion");

        noClasses()
            .that()
            .resideInAnyPackage("mx.conacyt.componentes.informacion.service..")
            .or()
            .resideInAnyPackage("mx.conacyt.componentes.informacion.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..mx.conacyt.componentes.informacion.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
