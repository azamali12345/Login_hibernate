package service;

import model.User;

public interface IUser 
{
	public boolean register(User user);
	
	public boolean login(String username,String password);
	
	public void reset(String username,String password,String confirmPassword);
}
