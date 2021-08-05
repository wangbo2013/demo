package com.example.demo.utils;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;
import org.springframework.util.StringUtils;


/**
 * @author : mac
 * create at:  2019-12-11  16:13
 * @description: 加密解密工具类
 */
public class CryptoUtils {

    /**
     * 加密，在一个字符串在原有基础上+1
     *
     * @param data
     * @return
     */
    public static String encode(String data) {
        byte[] bytes = data.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] += 1;
        }
        return new String(bytes);
    }

    /**
     * 解密，在一个字符串的原有基础上-1
     * @param data
     * @return
     */
    public static String decode(String data) {
        byte[] bytes = data.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] -= 1;
        }
        return new String(bytes);
    }

    /**
     * Base64 加密
     * @param data
     * @return
     */
    public static String encodeBase64(String data) {
        if (StringUtils.isEmpty(data)) {
            return null;
        }
        return new String(Base64.encode(data.getBytes()));
    }

    /**
     * Base64 解密
     * @param data
     * @return
     */
    public static String decodeBase64(String data) {
        if (StringUtils.isEmpty(data)) {
            return null;
        }
        try {
            return new String(Base64.decode(data.getBytes()));
        } catch (Base64DecodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String str = "woshzhongguoren";
        String str1 = encodeBase64(str);
        System.out.println(str1);
        String str2 = decodeBase64(str1);
        System.out.println(str2);
    }


}
