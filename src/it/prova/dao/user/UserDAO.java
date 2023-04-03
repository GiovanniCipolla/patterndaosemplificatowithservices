package it.prova.dao.user;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import it.prova.dao.IBaseDAO;
import it.prova.model.User;

public interface UserDAO extends IBaseDAO<User> {
	
	
	public List<User> findAllByUsernameIniziale(String iniziale) throws Exception;
	public List<User> findAllByCreatiPrimaDi(LocalDate dataConfronto) throws Exception;
	public User signIn(String loginInput, String passwordInput) throws Exception;
		
}