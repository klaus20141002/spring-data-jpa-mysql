package com.julie.mikaelson.test.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name="ts_common_person")
public class Person {
	
	
	private String fullname ;
	private String password ;
	private Date birthday;
	private String lastname ;
	
	private String email;
	
	@Column(name="COMPANY_ADDRESS")
	private Long companyAddress ;
	
	
	
	
	
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(Long companyAddress) {
		this.companyAddress = companyAddress;
	}

	public Person() {
		
	}
	
	public Person(String fullname, String password, String lastname,Date birthday) {
		super();
		this.fullname = fullname;
		this.password = password;
		this.lastname = lastname;
		this.birthday = birthday;
	}
	
	
	
	

	public Person(String fullname, String password, Date birthday,
			String lastname, String email, Long companyAddress) {
		super();
		this.fullname = fullname;
		this.password = password;
		this.birthday = birthday;
		this.lastname = lastname;
		this.email = email;
		this.companyAddress = companyAddress;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the fullname
	 */
	public String getFullname() {
		return fullname;
	}

	/**
	 * @param fullname the fullname to set
	 */
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id ;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [fullname=" + fullname + ", password=" + password
				+ ", birthday=" + birthday + ", lastname=" + lastname
				+ ", email=" + email + ", companyAddress=" + companyAddress
				+ ", id=" + id + "]";
	}

	

	
	
	
	
	

}
