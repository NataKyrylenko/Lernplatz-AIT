package Projects.ait.repositiries;

import Projects.ait.model.User;

public interface UserRepository extends CrudRepository<User>{
    public User findById();
    
}
