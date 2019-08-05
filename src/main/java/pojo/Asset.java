package pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Asset implements Serializable {
	private String assetId;

	private String userId;

	private Integer assetNumber;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date assetDate;

	private Float assetPrice;

	private String assetBelong;

	private Float assetDepreciation;

	private Integer assetYear;

	private String assetLocation;

	private static final long serialVersionUID = 1L;

}