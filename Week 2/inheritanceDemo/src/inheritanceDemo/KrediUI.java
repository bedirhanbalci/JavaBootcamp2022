package inheritanceDemo;

public class KrediUI {
	
	//baseKrediManager tarim, asker, ogretmenmanager'ın annesi oldugu icin KrediUI de basekredi'yi verip
	//çocuklarından (tarım, ogretmen, askermanager) istediğimizi yollayabiliriz. reference type
	
	public void KrediHesapla(BaseKrediManager baseKrediManager) { 
		baseKrediManager.Hesapla();
		
		
	}

}

