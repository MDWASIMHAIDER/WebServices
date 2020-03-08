package com.nt.serializer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;



public class MySerializer extends JsonSerializer<Date>{

	@Override
	public void serialize(Date value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonProcessingException {
	//	SimpleDateFormat formatter = new SimpleDateFormat("EEE MM dd yyyy HH:mm:ss 'GMT'ZZZ (z)");
		SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
		String format = formatter.format(value);
        jgen.writeString(format);
		
		
	}

}
