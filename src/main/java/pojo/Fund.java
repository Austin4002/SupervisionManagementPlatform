package pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Fund implements Serializable {
	private String fundId;

	private String userId;

	private Float fundCost;

	private String fundType;

	private String fundRemark;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fundDate;

	private static final long serialVersionUID = 1L;

}