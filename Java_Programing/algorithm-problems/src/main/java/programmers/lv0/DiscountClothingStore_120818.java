package programmers.lv0;

// 옷가게 할인 받기
// https://school.programmers.co.kr/learn/courses/30/lessons/120818
public class DiscountClothingStore_120818 {
    public static void main(String[] args) {
//        int price = 150000;
        int price = 580000;

        System.out.println(solution(price));
        System.out.println((int)Math.round(5.5));
    }

    public static int solution(int price) {
        Customer customer = new Customer(price);
        return customer.getPrice();
    }

    public static class Customer {
        private final int price;

        public Customer(int price) {
            if(price >= 100000 && price < 300000) {
                this.price = price - (int)Math.round(price * 0.05);
            }
            else if(price >= 300000 && price < 500000) {
                this.price = price - (int)Math.round(price * 0.1);
            }
            else if(price >= 500000) {
                this.price = price - (int)Math.round(price * 0.2);
            }
            else {
                this.price = price;
            }
        }

        private int getPrice() {
            return this.price;
        }
    }
}
