import java.util.Scanner;

public class sorting_practice {
	
	//2016112330 이형석
	static int i = 0;
	static int j = 0;
	static int m = 0;
	static int length = 10;
	static int[] ary = new int[length];
	static boolean bonLoop = true;
	
	//print함수
	public static void printarray(int[] ary) {
		for (i=0; i<10; i++) 
		{
			System.out.println(ary[i]);
		}
	}
	
	//선택정렬
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
	
	//퀵정렬
	public void quick(int[] ary, int l, int r){
        int left = l;
        int right = r;
        int pivot = ary[(l+r)/2];
        
        do{
            while(ary[left] < pivot) left++;
            while(ary[right] > pivot) right--;
            if(left <= right){    
                int temp = ary[left];
                ary[left] = ary[right];
                ary[right] = temp;
                left++;
                right--;
            }
        }while (left <= right);
        
        if(l < right) quick(ary, l, right);
        if(r > left) quick(ary, left, r);


    }
		

	
	//버블정렬
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
		System.out.println("1 : 선택정렬");
		System.out.println("2 : 퀵정렬");
		System.out.println("3 : 버블정렬");
		
		
		while(bonLoop){
			
			Scanner scan = new Scanner(System.in);
			
			
			switch(scan.nextInt()) {
			case 1:
				select(array);
				bonLoop = false;
				break;
			case 2:
				sorting_practice sort = new sorting_practice();
				sort.quick(array,0,length-1);
				printarray(array);
				bonLoop = false;
				break;
			case 3:
				bubble(array);
				bonLoop = false;
				break;
			default:
				System.out.println("번호를 다시 입력해주세요");
				break;
			}
			
			
		}

	}

}
