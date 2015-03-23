import java.io.*;

class kali{
	public static void main(String []args) throws Exception {
		int n;
		int m;
		
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println(" Ini adalah Perkalian Bilangan N x M. Silahkan tekan Enter!");
	input.readLine();
	System.out.print(" Masukkan bilangan N :");
		
	n = Integer.parseInt(input.readLine());
	
	System.out.print(" Masukkan bilangan M :");
		
	m = Integer.parseInt(input.readLine());
	
	
		System.out.print(" Hasil bil "+n+"x"+m+" = ");
	
		for (int i = 1; i <= m; i++){
			System.out.print(n +" ");
			
			if(i <= m -1){
				System.out.print("+ ");	
			}
				
			
		}
		
	
	}
	
}