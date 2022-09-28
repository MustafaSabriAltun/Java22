package inheritanceDemo;
// burada direk "anne clas"olan basekredımanagerı calgırdıgımızda dıger kredıleri de refere eder.
//yanı ulasılabılır referans edebilir.
public class KrediUI {
	 public void KrediHesapla(BaseKrediManager baseKrediManager){
	        baseKrediManager.Hesapla();
	    }
}
