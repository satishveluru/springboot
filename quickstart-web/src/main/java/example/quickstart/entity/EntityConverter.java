package example.quickstart.entity;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply=false)
public class EntityConverter implements AttributeConverter<String, Boolean>{

	@Override
	public Boolean convertToDatabaseColumn(String attribute) {
		return null;
	}

	@Override
	public String convertToEntityAttribute(Boolean dbData) {
		return null;
	}

}
