module nl.pancompany.unicorn.unicorn.application {

    exports nl.pancompany.unicorn.unicorn.application.domain.model;
    exports nl.pancompany.unicorn.unicorn.application.port.in;
    exports nl.pancompany.unicorn.unicorn.application.port.out;

    requires transitive nl.pancompany.unicorn.common;

    requires static lombok;
    requires org.slf4j;
    requires org.jmolecules.architecture.hexagonal;
    requires org.jmolecules.ddd;
    requires jakarta.validation;
}