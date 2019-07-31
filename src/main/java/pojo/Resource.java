package pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class Resource implements Serializable {
	private String resourceId;

	private String userId;

	private String resourceName;

	private Integer resourceNumber;

	private Float resourceValue;

	private String resourceLocation;

	private String resourceRemark;

	private static final long serialVersionUID = 1L;

}