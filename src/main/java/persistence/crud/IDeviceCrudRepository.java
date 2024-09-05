package persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import persistence.entity.DeviceEntity;

@Repository
public interface IDeviceCrudRepository extends JpaRepository<DeviceEntity , Long> {
}
