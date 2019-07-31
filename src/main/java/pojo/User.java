package pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {
	private String userId;

	private String userAccount;

	private String userPassword;

	private String userDepartment;

	private String userType;

	private static final long serialVersionUID = 1L;

}