package net.guochen.cheer.sample.ch10;

public class Quadrangle {
	//ʵ���������ı��ζ�����������
	private Quadrangle[] qtest=new Quadrangle[6];
	private int nextindex=0;
	public void draw(Quadrangle q){   //����draw()����������Ϊ�ı��ζ���
		if (nextindex<qtest.length){
			qtest[nextindex]=q;
			System.out.println(nextindex);
			nextindex++;
		}
	}
	public static void main(String[] agrs){
	//ʵ���������ı��ζ������ڵ���draw()����	
		Quadrangle q=new Quadrangle();
		q.draw(new Square());       //�������ζ���Ϊ��������draw()����
		q.draw(new Parallelogramgle());    //��ƽ���ı��ζ���Ϊ��������draw()����
	}

}
//����һ���������࣬�̳��ı�����
class Square extends Quadrangle{
	public Square(){
		System.out.println("������");
	}
}
//����һ��ƽ���ı����࣬�̳��ı�����
class Parallelogramgle extends Quadrangle{
	public Parallelogramgle(){
		System.out.println("ƽ���ı���");
	}
}
