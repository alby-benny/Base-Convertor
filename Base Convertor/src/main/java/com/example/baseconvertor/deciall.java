package com.example.baseconvertor;

import java.lang.*;

public class deciall {
    public String deci(int dec,String text){
        String result= new String();
        if (text == "Binary")
            result = Integer.toBinaryString(dec);
        else if(text == "Octal")
            result = Integer.toOctalString(dec);
        else if(text == "Hexadecimal") {
            result = Integer.toHexString(dec);
            result = result.toUpperCase();
        }
            return result;
    }

    public String bina(int temp,String text){
        String result= new String();
        if (text == "Decimal") {
            result = String.valueOf(temp);
        }
        else if (text == "Octal")
            result = Integer.toOctalString(temp);
        else if (text == "Hexadecimal"){
            result = Integer.toHexString(temp);
            result = result.toUpperCase();
        }

        return result;
    }

    public String octal(int temp,String text){
        String result= new String();
        if (text == "Decimal") {
            result = String.valueOf(temp);
        }
        else if (text == "Binary")
            result = Integer.toBinaryString(temp);
        else if (text == "Hexadecimal"){
            result = Integer.toHexString(temp);
            result = result.toUpperCase();
        }

        return result;
    }
    public String hexa(int dec,String text){
        String result = new String();
        if (text == "Decimal") {
            result = String.valueOf(dec);
        }
        else if (text == "Binary")
            result = Integer.toBinaryString(dec);
        else if (text == "Octal"){
            result = Integer.toOctalString(dec);
        }

        return result;
    }
}
