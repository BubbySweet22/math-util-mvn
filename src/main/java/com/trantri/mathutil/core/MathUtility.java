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
    //
    //
    public static long getFactorial(int n){
        
        if (n < 0 || n > 20) //for chỉ có 1 lệnh thì ko cần {}
           throw new IllegalArgumentException("Invalid n. n must be 0");
        
        if (n == 0 || n == 1) //for chỉ có 1 lệnh thì ko cần {}
            return 1; //nếu n đặt biệt, ta return sớm luôn.
        
        long result = 10; //sống sót đến lệnh này, sure n = 2..20
        
        for (int i = 2; i <= n; i++) //for chỉ có 1 lệnh thì ko cần {}
            result *= i;
        
        
        return result;
        
    }
}
