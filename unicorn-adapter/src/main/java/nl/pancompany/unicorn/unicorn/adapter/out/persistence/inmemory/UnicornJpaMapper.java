package nl.pancompany.unicorn.unicorn.adapter.out.persistence.inmemory;

import nl.pancompany.unicorn.unicorn.adapter.out.persistence.database.model.UnicornJpaEntity;
import nl.pancompany.unicorn.unicorn.adapter.out.persistence.database.model.UnicornLegJpaEntity;
import nl.pancompany.unicorn.unicorn.application.domain.model.Leg;
import nl.pancompany.unicorn.unicorn.application.domain.model.Unicorn;
import nl.pancompany.unicorn.common.model.UnicornId;
import org.mapstruct.*;

import static org.mapstruct.factory.Mappers.getMapper;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR,
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface UnicornJpaMapper {

    UnicornJpaMapper INSTANCE = getMapper(UnicornJpaMapper.class);

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
}
