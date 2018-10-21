
public class Kwadrat {
	public static void main(String[] args) {
		int n = 1;
		
		boolean kwadrat = false;
		int i = 2;
		while(i<n && !kwadrat){
			if (i*i == n)
				kwadrat = true;
			i++;
		}
		if (kwadrat)
			System.out.println("TAK");
		else
			System.out.println("NIE");
	}

}
