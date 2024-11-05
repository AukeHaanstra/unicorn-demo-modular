module magic.adapter {

    requires nl.pancompany.unicorn.magic.application;

    requires static lombok;
    requires jakarta.persistence;
    requires org.jmolecules.architecture.hexagonal;
    requires org.jmolecules.ddd;
    requires org.jmolecules.event;
    requires org.mapstruct;
    requires org.springframework.modulith.events.api;
    requires spring.context;
    requires spring.beans;
    requires spring.data.jpa;
}