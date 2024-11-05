module nl.pancompany.unicorn.common {

    exports nl.pancompany.unicorn.common;
    exports nl.pancompany.unicorn.common.events;
    exports nl.pancompany.unicorn.common.model;
    exports nl.pancompany.unicorn.common.validation;

    requires static lombok;
    requires jakarta.validation;
    requires org.jmolecules.event;
}