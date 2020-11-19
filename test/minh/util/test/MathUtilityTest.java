/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minh.util.test;

import minh.util.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IamDell
 */
public class MathUtilityTest {
    
    // mình sẽ test các tình huống xài hàm getFatorial() tại đây
    // tình huống là tham số đưa vào: dương, âm, dương trong khoảng 0...20
    // tình huống xài hàm, test hàm gọi là TEST CASES
    // thường ta ó tình huống thành công và thất bại
    // thành congoL đưa vào valua hợp lệ 0...20
    // thất bại: đưa vào âm, > 20, bị ăn đòn
    // hàm phải bắt các tình huống này, và giờ ta test thử coi hàm xử lí đúng hay chưa
    
    @Test // biến hàm này thành public static void main()
    // quy tắc đặt tên hàm cho việc test phần mềm: rất nhiều quy tắc
    // nhưng nói chung tên hàm sẽ bao gồm ngữ nghĩa kết quả trả về, tình trạng
    // ko giống quy tắc đặt tên hàm khi viết app
    // mình đang viết code để test app
    
    public void getFratorial_RunsWell_IfValidArgument (){
        assertEquals(120, MathUtility.getFactorial(5));
        // tui muốn check xem có đúng là gọi hàm 5 giai thừa có trả về 120 hay ko?
        // có thì XANH, ko thì ĐỎ
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(6, MathUtility.getFactorial(3));
    } // tui muon thay xanh tren GitHub, ko xem xanh o day
    // Mặc định code test độc lập với code chính
    // độc lập với quá trình clean & build.
    // Tức là dù code xanh hay đỏ, miễn là ko bị error cú pháp
    // bạn luôn đóng gói build ra file .jar .war (chấp xanh đỏ)
    
    // Để hợp logic thì chỉ mhi màu xanh code mới ra file .jar .war
    // Vậy ta cần có cách cài xanh đỏ vào quy trình build .jar .war
    // cách khác: nếu ode test đang màu đỏ thì disable cái nút bấm clean & build
}
