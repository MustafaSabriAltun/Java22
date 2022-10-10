
public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] baseKrediManager = new BaseKrediManager[]
                {new OgretmenKrediManager(), new TarımKrediManager(), new OgrenciKrediManager()};

        for (BaseKrediManager krediManager : baseKrediManager){
            System.out.println(krediManager.hesapla(1000));
        }

	}

}
//overrideable-- üzerine yazılabilirlik. Öğrenci kredısı için farklı bir oran istendiğinde.
//Base clasında kullanılan imzanın aynısı kullanıldığı takdirde clas kendi içerisindeki kodu çalıştırır ve miras
//kodunu ezer.
//**eğeerr ezilmesini istemiyorsan. Base clasındaki imzaya [public double final hesapla (double tutar){...}] yaparsan 
//yanı final  kelimesini eklersen kimse ezemez  base deki kodu.