import java.util.Scanner;

public class sorting_practice {
	
	static int z = 0;
	static int i = 0;
	static int j = 0;
	static int m = 0;
	static int length = 10;
	static int[] ary = new int[length];
	static boolean bonLoop = true;
	
	//print�Լ�
	public static void printarray(int[] ary) {
		for (i=0; i<10; i++) 
		{
			System.out.println(ary[i]);
		}
	}
	
	//��������
	public static void select(int[] ary) {
		for (i=0; i<10; i++) {
			for(j=i+1; j<10; j++) {
				if(ary[j]<ary[i]) {
					m = ary[i];
					ary[i] = ary[j];
					ary[j] = m;
				}
			}
		}
		printarray(ary);
	}
	
	//������
	public static void quick(int[] ary,int length) 
	{
		int pivot = ary[0];
		for(i=length-1; i>j; i--)
		{
			System.out.println("�̰��� i�Դϴ� " + i);
			if(ary[i]<pivot)
			{
				m = ary[i];
				for(j=1; j<i; j++)
				{
					System.out.println("�̰��� j�Դϴ� " + j);
					if(ary[j]>pivot)
					{
						ary[i] = ary[j];
						ary[j] = m;
						break;
					}
				}
				
			}
			if(i==j+2)
			{
				z = i;
				break;
			}

		}
		quick(ary, z+1);
		printarray(ary);
	}
	
	//��������
	public static void bubble(int[] ary) {
		for(j=0; j<9; j++) {
			for (i=0; i<9; i++) {
				if(ary[i+1]<ary[i]) {
					m = ary[i];
					ary[i] = ary[i+1];
					ary[i+1] = m;
				}
			}
		}
		
		printarray(ary);
	}

	//main
	public static void main(String[] args) {

		int[] array = new int[10];
		
		Scanner sc = new Scanner(System.in);

		for (i=0; i<10; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Choose your sorting");
		System.out.println("1 : ��������");
		System.out.println("2 : ������");
		System.out.println("3 : ��������");
		
		
		while(bonLoop){
			
			Scanner scan = new Scanner(System.in);
			
			switch(scan.nextInt()) {
			case 1:
				select(array);
				bonLoop = false;
				break;
			case 2:
				quick(array,length);
				bonLoop = false;
				break;
			case 3:
				bubble(array);
				bonLoop = false;
				break;
			default:
				System.out.println("��ȣ�� �ٽ� �Է����ּ���");
				break;
			}
			scan.close();
			
		}
		
		sc.close();


	}

}
