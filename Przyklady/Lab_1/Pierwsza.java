
public class Pierwsza {
	public static void main(String[] args) {
		int n = 997;
		
		boolean pierwsza = true;
		int i = 2;
		while(i<n && pierwsza){
			if (n%i == 0)
				pierwsza = false;
			i++;
		}
		if (pierwsza)
			System.out.println("TAK");
		else
			System.out.println("NIE");
	}

}
