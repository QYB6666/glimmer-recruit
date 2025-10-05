package com.Example;
/*------------------------------------*/
import com.Example.tool.Print;
/*------------------------------------*/
public class HelloWorld {
        public static void main(String[] args){
            // 打印所有命令行参数
            for (String arg : args) {
                System.out.println(arg);
            }//for增强
            Test.test();
        }
}
/*------------------------------------*/
class Test{
    public static void test(){
        Print.print("Hello World");
    }
}