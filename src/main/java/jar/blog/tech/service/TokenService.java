package jar.blog.tech.service;

import jar.blog.tech.dto.TokenDto;

import jar.blog.tech.model.TblTokens;

public interface TokenService {
	String inserTokens(TokenDto token, int uid);

	TblTokens findTokenByName(String token);
	
	String deleteTokenByTokenName(String token);
	
	
}
