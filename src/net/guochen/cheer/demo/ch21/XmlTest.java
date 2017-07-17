package net.guochen.cheer.demo.ch21;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlTest {
	public static void main(String [] args){
		
		
		Student s=new Student();
		s.setID("zhongguo");
		s.setName("zhangsan ");
		
		Classroom cr=new Classroom();
		cr.setTitle("2017 weekend");
		s.setClassroom(cr);	

		String xmlString=null;
		XmlMapper xmlMapper=new XmlMapper();	
		
		try{
			xmlString=xmlMapper.writeValueAsString(s);
		}catch (JsonProcessingException e){
			e.printStackTrace();
		}
		
		System.out.println(xmlString);
		
		Student ss=null;
		try{
			ss=xmlMapper.readValue(xmlString, Student.class);
		}catch (JsonParseException e){
			e.printStackTrace();
		}catch (JsonMappingException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		System.out.println(ss);
	}
}
