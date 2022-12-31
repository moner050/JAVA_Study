package programmers.lv0;

// 치킨 쿠폰
// https://school.programmers.co.kr/learn/courses/30/lessons/120884
public class ChickenCoupon_120884 {
    public static void main(String[] args) {
//        int chicken = 100;
//        int chicken = 1081;
        int chicken = 1999;

        System.out.println(solution1(chicken));
        System.out.println(solution2(chicken));
    }

    public static int solution1(int chicken) {
        int result = 0;
        int emptyCoupon = chicken % 10;
        int coupon = chicken / 10;

        result += coupon;
        coupon += emptyCoupon;

        while(true) {
            emptyCoupon = coupon % 10;
            coupon /= 10;
            result += coupon;

            if(coupon == 0) break;

            coupon += emptyCoupon;
        }

        return result;
    }

    public static int solution2(int chicken) {
        int result = 0;

        while(chicken >= 10) {
            int coupon = chicken / 10;
            int emptyCoupon = chicken % 10;

            chicken = coupon + emptyCoupon;

            result += coupon;
        }

        return result;
    }
}
