package jar.blog.tech.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jar.blog.tech.dao.TokenDao;
import jar.blog.tech.dto.TokenDto;
import jar.blog.tech.model.TblTokens;
import jar.blog.tech.service.TokenService;
@Service(value = "tokenService")
public class TokenServiceImpl implements TokenService{
	@Autowired TokenDao tokenDao;
	@Override
	public String inserTokens(TokenDto token, int uid) {
		// TODO Auto-generated method stub
		System.out.println("tokeeeen->>"+token.getToken());
		TblTokens tokenObject = new TblTokens();
		tokenObject.setToken(token.getToken());
		tokenObject.setUid(token.getUid());
		tokenObject.setDateCreated(token.getDateCreated());
		tokenObject.setDateExpiration(token.getDateExpiration());
		tokenObject.setUid(uid);
		tokenDao.save(tokenObject);
		return "successfully saved token";
	}
	@Override
	public TblTokens findTokenByName(String tokenname) {
		System.out.println("tokitok -> "+ tokenname);
		
//		System.out.println("TOKEN - > "+ tokenDao.findByToken(tokenname).getToken());
		
		return tokenDao.findByToken(tokenname);
	}
	@Override
	public String deleteTokenByTokenName(String token) {
		TblTokens tokenObject = tokenDao.findByToken(token);
		if( tokenObject != null ) {
			tokenDao.deleteById(tokenObject.getId());;
		}else {
			return "token doesn't exist";
		}
		return "deleted";
	}
	

}
