package methodOverloading;

public class DortIslem {
	public int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	// iki metot ismi de "topla" olmasına rağmen aynı anda ikisi de kullanılabilir
	// çünkü her ikisine de verdiğimiz parametre sayısı aynı değil (parametre imzaları farklı)
	// üstteki metot da parametre sayısı 2 iken 
	// aşağıdaki metot da parametre sayısı 3'dür. Kısacası bu kullanıma overloading denir
	
	public int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1 + sayi2 + sayi3;
	}

}
