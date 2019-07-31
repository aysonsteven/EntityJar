package jar.blog.tech.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jar.blog.tech.model.TblUser;

@Repository
public interface UserDao extends CrudRepository<TblUser, Integer> {

    TblUser findByUsername(String username);
    
    TblUser findById( int id );
}
