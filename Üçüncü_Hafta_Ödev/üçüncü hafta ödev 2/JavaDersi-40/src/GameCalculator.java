//abstract class yapımı sadece clasın basına eklemekle gerçekleşir.
//hesaplayı da abstract yaptıgımızda  bu baseyi ınherit eden classların tamamında hesapla diye bi imza
//olacak LAKİN hepsi override etmek zorunda dedik. çunku buradakı soyut bı imza 
//game over  kısmıda  herkeste aynı ve olması gereken bı sey oldugu ıcın override edilemez yaptık **final** kullanarak
public abstract class GameCalculator {
// ardından zaten kızar eger ınherıt edıtmıs bır clasta hesapla yoksa ımplemente et der
//ampulden edersın uzerınde de @override yazar zaten anlasılırlıgı arttırır.

	 public abstract void hesapla();

	    public final void gameOver(){
	        System.out.println("Oyun bitti");
	    }


}
