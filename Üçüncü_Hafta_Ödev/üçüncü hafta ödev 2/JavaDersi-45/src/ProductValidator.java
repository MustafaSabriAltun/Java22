
public class ProductValidator {
	static {
        System.out.println("Statik yapıcı blok çalıştı");
    }
    static {
        System.out.println("Statik yapıcı blok çalıştı");
    }
    public ProductValidator() {
        System.out.println("Yapıcı blok çalıştı");
    }
// isEmpty boş demek . eğer başına ! gelirse olumsuz yapar yanı değilse yapar. ilk defa gördükk 14. satır
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public void bisey(){

    }

    //inner class
    public static class BaskaBirClass{
        public static void sil(){

        }
    }
}
