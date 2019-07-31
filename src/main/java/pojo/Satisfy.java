package pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class Satisfy implements Serializable {
	private String satisfyId;

	private String userId;

	private String informationId;

	private Float satisfyStar;

	private static final long serialVersionUID = 1L;

}