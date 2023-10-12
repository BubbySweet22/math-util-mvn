
package com.trantri.mathutil.main;

import com.trantri.mathutil.core.MathUtility;

/**
 *
 * @author trant
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Test case #1 - Xem chi tiết mô tả ở dưới (case n = 0 | 0!)
        int n = 0;  //tình huống ktr 0!
        long expected = 1;//0! hy vọng là 1; ko cần lập trình cx ra kq này
        long actual = MathUtility.getFactorial(n);//0! thực tế là mấy, gọi là hàm và run là biết ngay
        
        //so sánh giữa expected == actual hay ko???
        System.out.println("0!  -> expected = " + expected +
                                              " | actual =" + actual);
        
        
        //Cách 1: kiểm thử = sức người: mắt nhìn, não nghĩ
        
        //TEST CASE #2:
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
         System.out.println("1!  -> expected = " + expected +
                                              " | actual =" + actual);
         
         //TEST CASE #3:
          System.out.println("5!  -> expected = 120" + expected +
                                              " | actual = " + MathUtility.getFactorial(5));
         
        
    }
    
}


//TEST CASE #3: Check getFatorial(with n = 5)
//STEPS/procedures:
//      1. given n = 5;
//      2. call/invoke getFactorial(n = 5)

//EXPECTED RESULT
//              The methol return 120 (standing for 5! = 120)

//STATUS: PASSED? or FALLED? - To be update later, when finishing TEST CASE



//TEST CASE #2: Check getFatorial(with n = 1)
//STEPS/procedures:
//      1. given n = 1;
//      2. call/invoke getFactorial(n = 1)

//EXPECTED RESULT
//              The methol return 1 (standing for 1! = 1)

//STATUS: PASSED? or FALLED? - To be update later, when finishing TEST CASE








//DEV phải test code của mik, có 3 cách
        //Sau đây là cách 1: in kq xlí ra màn hình
        
        //Nhắc lạiL công vc của QC bao gồm
        //Thiết kế test case, run test case, ghe laị bug nếu có
        //         Test case   Test run            Log bug > đưa lên Jira, Bugzilla
        //Test case => nói ra bạn sẽ test app thế nào 
        //Bằng cách đưa vào data, giá trị kì vọng, cách dùng app với
        //Bộ data đó như thế nào
        //Lát rồi run thử app xem sao!!! -> TEST RUN
        
        //Đề thi PE lun ở đây!!! thiết kế test case
        //Ta thiết kế test case đề test hàm tính giai thừa ta vừa viết
        //Test code thì đc gọi là unit test
        //Test case cho unit test thì gọi là "UNIT TEST" TEST CASE
        
        //TEST CASE #1: Check getFactorial() with n = 0
        //STEP/PROCEDURES:
        //             1. Given n = 0
        //             2. Invoke/call getFactorial(n = 0)
        
        //EXPECTED RESULT: the method returns 1 stands for 0!=1
        //STATUS         : PASSED? OR FALLED? --> lúc chạy hàm
                                               //mới bt kq, gọi là
                                               //TEST RUN, có thể 
                                               //