package net.guochen.cheer.sample.ch06;
/**
 * 
 * @author Administrator
 *
 */
public class ReverseSort {
	public static void mian(String[] args){
		int[]array={10,20,30,40,50,60};    //����һ������
		ReverseSort sorter=new ReverseSort();   //������ת������Ķ���
		sorter.sort(array);    //�����������ķ��������鷴ת
	}
	/**
	 * 
	 * @param array
	 * Ҫ���������
	 */
	public void sort(int[]array){
		System.out.println("����ԭ�����ݣ� ");
		showArray(array);
		int temp;
		int len=array.length;
		for(int i=0;i<len/2;i++){
			temp=array[i];
			array[i]=array[len-1-i];
			array[len-1-i]=temp;
		}
		System.out.println("���鷴ת�����ݣ� ");
		showArray(array);    //�������������ֵ
	}
	/**
	 * ��ʾ�����е�����Ԫ��
	 * 
	 * @param array
	 *      Ҫ��ʾ������
	 */
	public void showArray(int[] array){
		for(int i:array){     // ��������
			System.out.println("\t"+i);    // ���ÿ������Ԫ��ֵ
		}
		System.out.println();
	}

}
