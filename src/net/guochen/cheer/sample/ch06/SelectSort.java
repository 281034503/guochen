package net.guochen.cheer.sample.ch06;
/**
 * ֱ��ѡ�������㷨ʵ��
 * @author Administrator
 *
 */
public class SelectSort {
	public static void main(String[] args){
		int[] array={63,4,24,1,3,15};   //����һ�����飬�������Ԫ���������
		SelectSort sort=new SelectSort();   //����ֱ��������Ķ���
		sort.sort(array);    //�����������ķ�������������
	}
	/**
	 * ֱ��ѡ������
	 * 
	 * @param array
	 *      Ҫ���������
	 */
	public void sort(int[]array){
		int index;
		for (int i=1;i<array.length;i++){
			index=0;
			for(int j=1;j<=array.length-i;j++){
				if (array[j]>array[index]){
					index=j;
				}
			}
			//������λ��array.length-i��index(���ֵ)�ϵ�������
			int temp=array[array.length-i];   //�ѵ�һ��Ԫ��ֵ���浽��ʱ������
			array[array.length-i]=array[index];   //�ѵڶ���Ԫ��ֵ���浽��һ��Ԫ�ص�Ԫ��
			array[index]=temp;     //����ʱ����Ҳ���ǵ�һ��Ԫ��ԭֵ���浽�ڶ���Ԫ����
		}
		showArray(array);      //���ֱ��ѡ������������ֵ
	}
	/**
	 * ��ʾ�����е�����Ԫ��
	 * 
	 * @param array
	 *     Ҫ��ʾ������
	 */
	public void showArray(int[]array){
		for(int i:array){      //��������
		 System.out.println(">"+i);     //���ÿ������Ԫ��ֵ
		}
		System.out.println();
	}

}
