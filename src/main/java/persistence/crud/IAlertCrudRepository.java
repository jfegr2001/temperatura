package persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import persistence.entity.AlertEntity;

@Repository
public interface IAlertCrudRepository extends JpaRepository<AlertEntity , Long> {


}
