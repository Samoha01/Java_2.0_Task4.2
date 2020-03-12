/**
 * @author Samohin Alexander
 */

package Task4_2;

public class Task4_2 {
    public static void main (String[] args) {
        System.out.println("подарок состоит из следующих сладостей: ");
        Candy candy = new Candy("Птичье молоко", 500, 750, "Сладкие");
        JellyBean jellyBean = new JellyBean("Бон Пари", 550, 400.99, 1700);
        Chocolate chocolate = new Chocolate("Сникерс", 150, 1300, "Молочный");
        Sweets[] gift = {candy, jellyBean, chocolate};
        for (Sweets someSweet : gift) {
            System.out.println(someSweet.toString());
        }
        double sumWeight = candy.getWeight() + jellyBean.getWeight() + chocolate.getWeight();
        System.out.println("Общий вес подарка: " + sumWeight);
        double sumPrice = candy.getPrice() + jellyBean.getPrice() + chocolate.getPrice();
        System.out.println("Общая сумма подарка: " + sumPrice);
    }
}