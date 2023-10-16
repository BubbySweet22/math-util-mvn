/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trantri.mathutil.core;

/**
 *
 * @author trant
 */

//class này chứa các hàm static dùng chung cho mọi nơi.
//khi nào dùng static: khi ta làm các hàm mà chỉ xử lí xong rồi return.
//ko cần lưu trữ lại thông tin vào instane variable - đặt tính của ojb

public class MathUtility {
    
    public static  final double PI = 3.14;
    
    //C# public static  final double PI = 3.14; static hiểu ngầm luôn
    
    
    //
    //
    //
    




    //5! = 1.2.3.4      5
    //5! =       4! X 5 = 5 X 4!
    //4! = 1.2.3. 4
    //4! =     3!. 4 = 4 X 3!
    //3! = 3 X 2!
    //2! = 2 X 1! = 1 
    //1! = 1
        public static long getFactorial(int n){
        
        if (n < 0 || n > 20) //for chỉ có 1 lệnh thì ko cần {}
           throw new IllegalArgumentException("Invalid n. n must be 0");
        
        if (n == 0 || n == 1) //for chỉ có 1 lệnh thì ko cần {}
            return 1; //nếu n đặt biệt, ta return sớm luôn.
        
        return n* getFactorial(n -1);
        
        
       // tối ưu code, thay ruột của cái hàm đeẻ chạy ngon hơn
       // nhanh hơn, hoặc code vt đẹp hon
       // hoặc fix bug thì phải sửa code
       // dù bạn sửa code vì lí do gì, thì code phải đc test lại
       // và test lại để đảm bảo rằng nó vẫn xanh như lần trc
       // nếu ta vt code đi kèm test script thì vc test lại cái
       // sai, mà chỉ nhìn màu xanh là đủ - vì 
        }
}
//    public static long getFactorial(int n){
//        
//        if (n < 0 || n > 20) //for chỉ có 1 lệnh thì ko cần {}
//           throw new IllegalArgumentException("Invalid n. n must be 0");
//        
//        if (n == 0 || n == 1) //for chỉ có 1 lệnh thì ko cần {}
//            return 1; //nếu n đặt biệt, ta return sớm luôn.
//        
//        long result = 1; //sống sót đến lệnh này, sure n = 2..20
//        
//        for (int i = 2; i <= n; i++) //for chỉ có 1 lệnh thì ko cần {}
//            result *= i;
//        
//        
//        return result;
//        
//    }

