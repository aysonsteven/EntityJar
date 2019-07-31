package jar.blog.tech.dao;

import org.springframework.data.repository.CrudRepository;

import jar.blog.tech.model.TblTokens;

public interface TokenDao extends CrudRepository<TblTokens, Integer>{

//	TokenDto findByTokenName(@Param("tokenName") String tokenName);
	TblTokens findByToken(String tokenName);
}
