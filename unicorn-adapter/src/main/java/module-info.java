module unicorn.adapter {

    requires nl.pancompany.unicorn.unicorn.application;

    requires static lombok;
    requires org.slf4j;
    requires jakarta.persistence;
    requires jakarta.transaction;
    requires org.jmolecules.architecture.hexagonal;
    requires org.jmolecules.ddd;
    requires org.jmolecules.event;
    requires org.mapstruct;
    requires org.springframework.modulith.events.api;
    requires spring.beans;
    requires spring.context;
    requires spring.data.jpa;
    requires spring.web;
    requires spring.webmvc;
    requires jakarta.cdi;
    requires jakarta.validation;
}