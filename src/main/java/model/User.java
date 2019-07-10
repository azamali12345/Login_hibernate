package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userTable")
public class User 
{
	private String firstname;
	private String lastName;
	
	@Id
	private String username;
	
	private String password;
	
	private String confirmPassword;
	private String DOB;
	private String mobile;
	private String mail;
	
	public User()
	{}

	public User(String firstname, String lastName, String username, 
			String password, String confirmPassword, String dOB,
			String mobile, String mail) 
	{
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.confirmPassword = confirmPassword;
		DOB = dOB;
		this.mobile = mobile;
		this.mail = mail;
	}

	public String getFirstname() 
	{
		return firstname;
	}

	public void setFirstname(String firstname) 
	{
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public String getConfirmPassword() 
	{
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) 
	{
		this.confirmPassword = confirmPassword;
	}

	public String getDOB() 
	{
		return DOB;
	}

	public void setDOB(String dOB)
	{
		DOB = dOB;
	}

	public String getMobile() 
	{
		return mobile;
	}

	public void setMobile(String mobile) 
	{
		this.mobile = mobile;
	}

	public String getMail() 
	{
		return mail;
	}

	public void setMail(String mail) 
	{
		this.mail = mail;
	}

	@Override
	public String toString() 
	{
		return "User [firstname=" + firstname + ", lastName=" 
	+ lastName + ", username=" + username + ", password="
				+ password + ", confirmPassword=" + confirmPassword 
				+ ", DOB=" + DOB + ", mobile=" + mobile + ", mail="
				+ mail + "]";
	}
}
