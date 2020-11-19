/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minh.util;

/**
 *
 * @author IamDell
 */
public class MathUtility {
    // class này chứa các hàm tiện ích dùng chung 
    // cho mọi nơi do đó nó phải nên la static
    
    public static final double PI = 3.1415;
    
    // hàm tính n giai thừa n >= 0 && n <= 20
    // nếu quá 20 tràn kiểu long
    // 0! = 1; 1! = 1; n! = 1.2.3...n
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n >= 0 & n <= 20");
            // đưa đầu vào ko hợp, ko nen trả về giá trị âm chỉ sai
        }
        if (n == 0 || n == 1) {
            return 1; //0! = 1! = 1
            // đến đây thì n > 1 và n <= 20 rồi
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        // 2. test = mắt
        System.out.println("5!: " + MathUtility.getFactorial(5));
        //              expected: 120,          actual:
        // hi vọng ra 120 khi gọi hàm
        
        // và test bộ data khác, test case, tình huống khác
        System.out.println("0!: " + MathUtility.getFactorial(0));
        //                  e: 1,   a: 1 -> okie
        
        // e: nếm về ngoại lệ IllegalArguemntException nếu giai thừa -5
        System.out.println("-5!: " + MathUtility.getFactorial(-5));
        
        System.out.println("CI for today");
    }
    
    // Code viết ra thi Developer phải test trước
    // Các hình thức test code:
    
    // 1. TDD, test driven development
    // Viết dàn khung của hàm getFactorail(int n)
    // Sau đó dựng hàm test()
    // chạy thử coi xanh | đỏ, đỏ nghĩa là lỗi, xanh nghĩa là ổn
    // cứ liên tực xanh đỏ như thế trong quá trình viết code
    // và sửa code, người ta gọi là lập trình hướng theo thõa mãn việc test, TDD
    
    // 2. sout (hàm kèm data) để coi kết quả ra sao, có đúng như EXPECTED
    // nó có phải trả về như thế hay ko -> xem kết quả test = mắt (xanh đỏ)
    // Máy so sánh giùm EXPECTED & ACTUALL: 
    // Nếu ALL E == A -> Xanh.
    // Nếu có ít nhất 1 cặp E != A -> Đỏ.
    // => Dùng thêm library UnitTest
    
    // 3. JOptionPane của bên JavaDesktop dể popup kết quả ra màn hình
    // vẫn xem = mắt
    
    // 4. Viết 1 trang web gọi hàm xử lí..., --> hao sức quá
   
// ==> ta dùng cách 1 và 2
}
