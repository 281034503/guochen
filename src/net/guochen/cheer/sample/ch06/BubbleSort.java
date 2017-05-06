package net.guochen.cheer.sample.ch06;

public class BubbleSort {

	
	public static void main(String[] args){
		int[] array={63,4,24,1,3,15};   //����һ�����飬�������Ԫ�ض��������
		BubbleSort sort=new BubbleSort();    //����ð��������Ķ���
		sort.sort(array);    //�������򷽷�����������
	}
		
	/**
	*ð������
	*
	*@param array
	*           Ҫ���������
	*/
	public void sort(int[]array){
		for (int i=1;i<array.length;i++){    //�Ƚ�������������Ԫ�أ��ϴ��������ð��
			for(int j=0;j<array.length-i;j++){
				if (array[j]>array[j+1]){
					int temp=array[j];   //�ѵ�һ��Ԫ��ֵ���浽��ʱ������
					array[j]=array[j+1];   //�ѵڶ���Ԫ��ֵ���浽��һ��Ԫ�ص�Ԫ��
					array[j+1]=temp;     //����ʱ��������һ��Ԫ��ԭֵ�����浽�ڶ���Ԫ����	
				}
			}	
		}
		showArray(array);    //���ð������������Ԫ��
	
	}
/**
 * ��ʾ�������е�����Ԫ��
 *
 *@param array
 *      Ҫ��ʾ������
 */
	public void showArray(int[] array){
		for(int i:array){      //��������
			System.out.println(">"+i);     //���ÿ������Ԫ��ֵ
		}
		System.out.println();
	}
}
