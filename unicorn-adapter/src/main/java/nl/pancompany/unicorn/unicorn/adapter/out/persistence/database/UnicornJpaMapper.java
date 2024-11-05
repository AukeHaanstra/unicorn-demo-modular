package nl.pancompany.unicorn.unicorn.adapter.out.persistence.database;

import nl.pancompany.unicorn.unicorn.adapter.out.persistence.database.model.UnicornJpaEntity;
import nl.pancompany.unicorn.unicorn.adapter.out.persistence.database.model.UnicornLegJpaEntity;
import nl.pancompany.unicorn.unicorn.application.domain.model.Leg;
import nl.pancompany.unicorn.unicorn.application.domain.model.Unicorn;
import nl.pancompany.unicorn.common.model.UnicornId;
import org.mapstruct.*;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR,
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface UnicornJpaMapper {

    @Mapping(target = "unicornId", source = "unicornId", qualifiedByName = "mapUnicornId")
    Unicorn map(UnicornJpaEntity unicornJpaEntity);

    @Named("mapUnicornId")
    default UnicornId mapUnicornId(String value) {
        return UnicornId.of(value);
    }

    @Mapping(target = "id", ignore = true)
    UnicornJpaEntity map(Unicorn unicorn);

    default String mapUnicornId(UnicornId unicornId) {
        return unicornId == null ? null : unicornId.toStringValue();
    }

    @Mapping(target = "unicorn", ignore = true)
    @Mapping(target = "id", ignore = true)
    UnicornLegJpaEntity map(Leg leg);

    @Mapping(target = "id", ignore = true)
    void map(Unicorn unicorn, @MappingTarget UnicornJpaEntity unicornJpaEntity);
}