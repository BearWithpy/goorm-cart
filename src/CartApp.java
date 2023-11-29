import java.util.HashSet;
import java.util.Set;

public class CartApp {
    public static void main(String[] args) {
        //상품 목록 생성
        Set<Product> productSet = new HashSet<>();

        // TODO: 상품 클래스를 생성하여 상품목록에 넣는다.
        productSet.add(new Product("p01", "Apple", 54.99));
        productSet.add(new Product("p01", "Apple", 54.99));
        productSet.add(new Product("p01", "Apple", 54.99));
        productSet.add(new Product("p02", "Banana", 54.99));

        Product apple1 = new Product("p01", "Apple", 54.99);
        Product apple2 = new Product("p01", "Apple", 54.99);
        Product banana = new Product("p02", "Banana", 4.99);
        Product lemon = new Product("p03", "Lemon", 94.99);

        System.out.println(apple2.equals(apple1));

        //상품 목록 확인
        System.out.println("고유한 상품 목록 : ");
        for (Product product : productSet) {
            System.out.println(product.getName() + " : " + product.getPrice());
        }

        //장바구니 생성
        Cart myCart = new Cart();

        // TODO: 상품을 장바구니에 추가
        myCart.addProduct(apple1, 4);
        myCart.addProduct(apple2, 2);
        myCart.addProduct(banana, 2);
        myCart.addProduct(lemon, 3);


        // TODO: 상품을 장바구니에서 제거
        myCart.removeProduct(lemon, 3);
        myCart.removeProduct(banana, 1);

        System.out.println();
        // TODO: 장바구니에 현재 담긴 상품들을 출력 (상품이름, 각 상품의 갯수)
        myCart.showItems();
    }
}