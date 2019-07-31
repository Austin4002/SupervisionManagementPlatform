package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConvert implements Converter<String, Date>{

	@Override
	public Date convert(String source) {
		try {
			if(null!=source) {
				DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				return df.parse(source);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
