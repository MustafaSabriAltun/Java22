package oopWithNLayeredApp.core.logging;

public class FileLogger implements Logger {
	@Override
	//base sınıftan geldıgını gostriyor bu override
	public void log(String data) {
		System.out.println("Dosyaya loglandı :" + data );
		
		
	}
 
}
