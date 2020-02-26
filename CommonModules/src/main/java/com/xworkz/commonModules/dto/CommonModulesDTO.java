package com.xworkz.commonModules.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CommonModulesDTO {
	private String username;
	private String email;
	private String  mobile;
	private int password;
	private int confirmpassword;
	
	
	public void CommonModulesDTO() {
		System.out.println("Created \t"+this.getClass().getName());
	}


	@Override
	public String toString() {
		return "CommonModulesDTO [username=" + username + ", email=" + email + ", mobile=" + mobile + ", password="
				+ password + ", confirmpassword=" + confirmpassword + "]";
	}


	


}
