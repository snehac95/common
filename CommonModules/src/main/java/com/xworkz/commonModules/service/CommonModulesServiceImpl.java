package com.xworkz.commonModules.service;

import java.util.Objects;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.commonModules.dao.CommonModulesDAO;
import com.xworkz.commonModules.dto.CommonModulesDTO;
import com.xworkz.commonModules.entity.CommonModulesEntity;

@Service
public class CommonModulesServiceImpl implements CommonModulesService{
	
	@Autowired
	private  CommonModulesDAO  commonModulesDAO;

	public CommonModulesServiceImpl() {
		System.out.println("Created \t "+this.getClass().getSimpleName());
	}

	public boolean validateAndSave(CommonModulesDTO commonModulesDTO) {
		boolean valid = false;
		try {
			System.out.println("validateAndSave invoked " + commonModulesDTO);
			
			if(Objects.nonNull(commonModulesDTO)) {
				System.out.println("starting validation for " + commonModulesDTO);
				String username = commonModulesDTO.getUsername();
				if (username !=null && !username.isEmpty() && username.length() >=5) {
				System.out.println("username is valid");
				valid = true;
				} else {
					System.out.println("username is invalid");
					if(username == null) {
						System.out.println("username is null");
					}
					if(username !=null && username.length() <5) {
						System.out.println("name length is less than 5");
					}
					valid = false;
				}
				String  email = commonModulesDTO.getEmail();
				if ( email !=null && ! email.isEmpty() &&  email.length() >=5) {
					System.out.println("email is valid");
					valid = true;	
			} else {
				if(valid) {
					System.out.println("email is invalid");
					valid = false;
					
				}
			}
				
		}
			
			//return valid;
			
			if(valid) {
				System.out.println("Data is valid ,will convert  to entity");
				
				CommonModulesEntity commonModulesEntity = new CommonModulesEntity();
				
				BeanUtils.copyProperties(commonModulesDTO, commonModulesEntity);
				
				System.out.println("entity is ready \t "+ commonModulesEntity);
				commonModulesDAO.save(commonModulesEntity);
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	
	}








