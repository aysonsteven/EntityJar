package jar.blog.tech.service;

import jar.blog.tech.dto.UserDto;
import jar.blog.tech.model.TblUser;

import java.util.List;

public interface UserService {

    TblUser save(UserDto user);
    List<TblUser> findAll();
    void delete(int id);

    TblUser findOne(String username);

    TblUser findById(int id);

    UserDto update(UserDto userDto);
}
