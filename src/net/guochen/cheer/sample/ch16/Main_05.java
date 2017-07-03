package net.guochen.cheer.sample.ch16;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;





public class Main_05 {
	public static void main(String[] args){
		Class<?> recordC=null;
		try{
			recordC=Class.forName("Record");
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			
		}
		
		System.out.print("----���췽������������----");
		Constructor[]declaredConstructors=recordC.getDeclaredConstructors();  //������й��췽��
		for(int i=0;i<declaredConstructors.length;i++){
			Constructor constructor=declaredConstructors[i];   //�������췽��
			
			//�鿴�Ƕ�����ָ�����͵�ע��
			
			if(constructor.isAnnotationPresent(Constructor_Annotation.class)){
				//���ָ�����͵�ע��
				Constructor_Annotation ca=(Constructor_Annotation) constructor.getAnnotation(Constructor_Annotation.class);
				System.out.println(ca.value());//���ע����Ϣ
				
			}
			
			Annotation[][]parameterAnnotations=constructor.getParameterAnnotations();
			//��ò�����ע��
			
			for(int j=0;j<parameterAnnotations.length;j++){
				int length=parameterAnnotations[j].length;
				//���ָ������ע�͵ĳ���
			    if(length==0)  //�������Ϊ0���ʾû��Ϊ�ò�������ע��
				System.out.println("    δ����Annotation�Ĳ���");
			    else
			    	for(int k=0;k<length;k++){
			    		Field_Method_Parameter_Annotation pa=(Field_Method_Parameter_Annotation)parameterAnnotations[j][k];
			    		//��ò�����ע��
			    		System.out.println("   "+pa.describe()); //��ò�������
			    		System.out.println("    "+pa.type());   //��ò�������
			    	}
			
			}
			System.out.println();
			
		}
		System.out.println();
		
		System.out.println("----�ֶε���������----");
		Field[] declaredFields=recordC.getDeclaredFields();//��������ֶ�
		for(int i=0;i<declaredFields.length;i++){
			Field field=declaredFields[i];  //�����ֶ�
			if(field.isAnnotationPresent(Field_Method_Parameter_Annotation.class)){
			//���ָ�����͵�ע��
				
				Field_Method_Parameter_Annotation fa=field.getAnnotation(Field_Method_Parameter_Annotation.class);
				System.out.print("     "+fa.describe());   //����ֶε�����
				System.out.print("     "+fa.type());    //����ֶε�����
				
			}
			
		}
		
		System.out.println();
		System.out.println("-----��������������-----");
		Method[]methods=recordC.getDeclaredMethods();
		//������з���
		
		for(int i=0;i<methods.length;i++){
			Method method=methods[i];//��������
			
			if(method.isAnnotationPresent(Field_Method_Parameter_Annotation.class)){
				//�鿴�Ƿ����ָ�����͵�ע��
				Field_Method_Parameter_Annotation ma=method.getAnnotation(Field_Method_Parameter_Annotation.class);
				//���ָ�����͵�ע��
				System.out.println(ma.describe());  //��÷���������
				System.out.println(ma.type());  //��÷����ķ���ֵ����
				
			}
			Annotation[][]parameterAnnotations=method.getParameterAnnotations();
			//��ò�����ע��
			for(int j=0;j<parameterAnnotations.length;j++){
				int length=parameterAnnotations[j].length;
				//���ָ������ע�͵ĳ���
				if(length==0) //�������Ϊ0��ʾû��Ϊ�ò�������ע��
					System.out.println("    δ����Annotation�Ĳ���");
				else
					for(int k=0;k<length;k++){
						
						Field_Method_Parameter_Annotation pa=(Field_Method_Parameter_Annotation)parameterAnnotations[j][k];
						System.out.println("    "+pa.describe());//��ò���������
						System.out.println("    "+pa.type());  //��ò���������
						
						
					}
			}
			System.out.println();
		}
		
	}

}