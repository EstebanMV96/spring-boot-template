package com.manglu.util;
import org.modelmapper.ModelMapper;

public class ModelUtils {
		
	
	public static <T> T mapObjectToClass(Object obj, Class<T> mapClass) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(obj, mapClass);
	}

}