package net.guochen.cheer.sample.ch06;

public class BubbleSort {

	
	public static void main(String[] args){
		int[] array={63,4,24,1,3,15};   //创建一个数组，这个数组元素都是乱序的
		BubbleSort sort=new BubbleSort();    //创建冒泡排序类的对象
		sort.sort(array);    //调用排序方法将数组排序
	}
		
	/**
	*冒泡排序
	*
	*@param array
	*           要排序的数组
	*/
	public void sort(int[]array){
		for (int i=1;i<array.length;i++){    //比较两个相邻两个元素，较大的数往后冒泡
			for(int j=0;j<array.length-i;j++){
				if (array[j]>array[j+1]){
					int temp=array[j];   //把第一个元素值保存到临时变量中
					array[j]=array[j+1];   //把第二个元素值保存到第一个元素单元中
					array[j+1]=temp;     //把临时变量（第一个元素原值）保存到第二个元素中	
				}
			}	
		}
		showArray(array);    //输出冒泡排序后的数组元素
	
	}
/**
 * 显示是数组中的所有元素
 *
 *@param array
 *      要显示的数组
 */
	public void showArray(int[] array){
		for(int i:array){      //遍历数组
			System.out.println(">"+i);     //输出每个数组元素值
		}
		System.out.println();
	}
}
