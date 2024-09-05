package persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import persistence.entity.UserEntity;

@Repository
public interface IUserCrudRepository extends JpaRepository<UserEntity , Long> {


    UserEntity findUsernameById(Long id);

}
