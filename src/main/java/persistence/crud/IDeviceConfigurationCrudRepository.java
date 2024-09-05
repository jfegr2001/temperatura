package persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import persistence.entity.DeviceConfigurationEntity;

@Repository
public interface IDeviceConfigurationCrudRepository extends JpaRepository<DeviceConfigurationEntity , Long> {
}
