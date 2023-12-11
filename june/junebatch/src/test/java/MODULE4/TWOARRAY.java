package MODULE4;

public class TWOARRAY {
	public static void main(String[] args) {
		int[] [] a = new int[3] [4];
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[0][3] = 40;
		for(int r = 0;r<a.length;r++){
			for(int k = 0;k<a[0].length;k++){
			System.out.println(a[r][k]);
		}
		}
				
	}

}
