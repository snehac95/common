package com.xworkz.commonModules.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;



import lombok.Data;
@Component
@Entity
@Table(name="modules")
@Data
public class CommonModulesEntity implements Serializable {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name ="id")
	private int id;
	@Column(name = "Username")
	private String Username;
	@Column(name = "Email")
	private String  Email;
	@Column(name = "Mobile")
	private String Mobile;
	@Column(name = "Password")
	private int  Password;

	@Column(name ="Confirmpassword")
	private int Confirmpassword;


	public CommonModulesEntity() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public CommonModulesEntity(String username,String email,String mobile,int password,int confirmpassword ) {
		//super();
		Username = username;
		Email = email;
		Mobile= mobile;
		 Password=password;
		 Confirmpassword=confirmpassword;
		
		
	}
	

}





