package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade Süresi";
		
		System.out.println(ortaMetin);
		System.out.println(altMetin);
		
		//integer
		int vade = 12;
		
		double dolarDun = 18.20;
		double dolarBugun = 18.20;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun < dolarDun)
		{ //true
			okYonu = "down.svg";
			System.out.println(okYonu);
		} 
		else if (dolarBugun > dolarDun)
		{ //false
			okYonu = "up.svg";
			System.out.println(okYonu);
		}	
		else
		{ 
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		//array
		String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan","Mutlu Emekli"};
		
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}

}
