package net.guochen.cheer.sample.ch10;

interface drawTest{  //����ӿ�
	public void draw();     //���巽��
}

//����ƽ���ı����࣬����̳����ı����࣬��ʵ����drawTest�ӿ�
class ParalelogramgleUseInterface extends QuadrangleUseInterface
     implements drawTest{
public void draw(){    //���ڸ���ʵ���˽ӿڣ�������Ҫ����draw()����
	System.out.println("ƽ���ı���.draw()");
  }
 public void doAnyThing(){       //���Ǹ��෽��
	 //SomeSentence
  }

}
class SquareUseInterface extends QuadrangleUseInterface implements
    drawTest{
	public void draw(){
		System.out.println("������.draw()");
	}
	public void doAnyThing(){
		//SomeSentence
	}
}
class AnyThingUseinterface extends QuadrangleUseInterface{
	public void doAnyThing(){
		
	}
}
public class QuadrangleUseInterface{      //�����ı�����
	public void doAnyThing(){
		//SomeSentence
	}
    public static void main(String[] agrs){
    	drawTest[]d={     //�ӿ�Ҳ���Խ�������ת�Ͳ���
    			new SquareUseInterface(),new ParalelogramgleUseInterface()};
    	for(int i=0;i<d.length;i++){
    		d[i].draw();		  //����draw()����
    	}
    }
	
}













