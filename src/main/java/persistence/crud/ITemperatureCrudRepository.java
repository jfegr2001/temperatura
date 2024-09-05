package persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import persistence.entity.TemperatureEntity;

@Repository
public interface ITemperatureCrudRepository extends JpaRepository<TemperatureEntity, Long> {
}
