module nl.pancompany.unicorn.magic.application {

    exports nl.pancompany.unicorn.magic.application.domain.model;
    exports nl.pancompany.unicorn.magic.application.port.in;
    exports nl.pancompany.unicorn.magic.application.port.out;

    requires transitive nl.pancompany.unicorn.common;

    requires static lombok;
    requires org.jmolecules.architecture.hexagonal;
    requires org.jmolecules.ddd;
    requires org.slf4j;
}