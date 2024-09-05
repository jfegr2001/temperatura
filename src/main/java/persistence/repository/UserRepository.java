package persistence.repository;

import persistence.crud.IUserCrudRepository;

public  class UserRepository {


    private IUserCrudRepository  userCrud;


    public String  searchUserName(Long  id){

         return userCrud.findUsernameById(id).toString();

    }
}
