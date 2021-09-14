
public class array_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] scores = new int[4][4];
		
		int i = 0;
		int j = 0;
		
		for(i=0; i<3; i++) 
		{
			for(j=0; j<=3; j++) 
			{
				if(j < 3)
				{
					scores[i][j] = (i*3)+j+1;
					System.out.print(scores[i][j]+ " ");
				} else {
					scores[i][j] = scores[i][j-1] + scores[i][j-2] + scores[i][j-3];
					System.out.print(scores[i][j]+ " ");
				}
			}
			System.out.println();
		}
		for(i=0; i<=3; i++) {
			scores[3][i] = scores[0][i] + scores[1][i] + scores[2][i];
			System.out.print(scores[3][i]+ " ");
		}
		
	}

}
