package pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Information implements Serializable {
	private String informationId;

	private String informationTitle;

	private String informationMessage;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date informationDate;

	private String informationType;

	private Integer ishot;

	private static final long serialVersionUID = 1L;

}