package youtubeEğitim;

abstract class BaseCreditManager implements CreditManager{
//Override--üstüne yaz demek
    public abstract void calculate();

    
    public void save() {
        System.out.println("Kaydedildi");
    }
}
