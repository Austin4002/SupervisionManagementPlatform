package pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Information implements Serializable {
	private String informationId;

	private String informationTitle;

	private String informationMessage;

	private Date informationDate;

	private String informationType;

	private Integer ishot;

	private static final long serialVersionUID = 1L;

}