package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {

		DortIslem dortIslem = new DortIslem();
		int sonuc1 = dortIslem.Topla(3, 4);
		int sonuc2 = dortIslem.Cikar(7, 5);
		int sonuc3 = dortIslem.Carp(5, 8);
		int sonuc4 = dortIslem.Bol(10, 5);

		System.out.println(sonuc1);
		System.out.println(sonuc2);
		System.out.println(sonuc3);
		System.out.println(sonuc4);
	}

}
