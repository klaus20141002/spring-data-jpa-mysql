package com.julie.mikaelson.test.model;

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
	
	private String lastname ;
	
	public Person() {
	}
	
	public Person(String fullname, String password, String lastname) {
		super();
		this.fullname = fullname;
		this.password = password;
		this.lastname = lastname;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + fullname + ", password=" + password + ", id=" + id
				+ "]";
	}
	
	
	
	
	

}
