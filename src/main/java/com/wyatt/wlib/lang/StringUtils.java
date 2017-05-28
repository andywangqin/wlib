package com.wyatt.wlib.lang;

/**
 * Created by wyatt on 2017/4/17.
 */
public class StringUtils {

    public static String reverse(String str){
        if ((null == str) || (str.length()  <= 1)) {
            return str;
        }
        StringBuilder stringBuffer=new StringBuilder(str);
        return stringBuffer.reverse().toString();
    }

    /**
     * TODO:尾(Tail)递归，字符串“+”操作的效率
     */
    public static String reserseRecursive(String str){
        if ((null == str) || (str.length()  <= 1)) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args){
        System.out.println(reserseRecursive("从前有座山，山上有座庙，庙里有个老和尚，一天老和尚对小和尚讲故事"));
    }

}
