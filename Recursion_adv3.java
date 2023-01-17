
public class Recursion_adv3 {
//Q-> Place the Tiles of size (1 x m) on  a floor of size (n x m)
	
	public static int placeTiles(int n, int m) {
		if(n==m) {
			return 2;
		}
		if(n<m) {
			return 1;
		}
		
		// Vertically placement of tiles
		int verticalPlacement = placeTiles(n-m,m);
		
		//Horizontally placement of tiles
		int horizontalPlacement = placeTiles(n-1,m);
		
		return verticalPlacement + horizontalPlacement;
	}
	
	public static void main(String[]args) {
		int n = 5, m = 4;
		System.out.println("Total Placements ways:"+placeTiles(n,m));
	}
}
