package cn.tedu.Home;

import java.util.Scanner;

/**
 *  实现会员注册
 *  要求用户名长度不小于 3，
 *  密码长度不小于 6，
 *  注册时两次输入密码必须相同 （字符串）
 */
public class Register {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名(长度不小于三个字符)：");
            String username = sc.next();
            if (username.length() >= 3) {
                System.out.println("请输入密码（长度不小于6位）：");
                String password = sc.next();
                if (password.length() >= 6) {
                    System.out.println("请再一次输入密码");
                    String newpassword = sc.next();
                    if(password.equals(newpassword)){
                        System.out.println("注册成功");
                        break;
                    }
                }else{
                    System.out.println("输入的密码长度不够");
                }
            } else {
                System.out.println("请按规定输入用户名");
            }
        }
        sc.close();
    }
}
