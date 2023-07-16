package util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.UUID;

import static java.nio.charset.StandardCharsets.UTF_8;

public class StringUtil {

    // 作为主键、图片名称
    // 无法排序（无法建立有效索引）
    public static String getUUID() {
        // 得到32位uuid
        return UUID.randomUUID().toString().replaceAll("-", "");
    }


    // 对字符串进行md5加密
    public static String md5(String str) {
        byte[] digest;
        try {
            MessageDigest md5 = MessageDigest.getInstance("md5");
            digest = md5.digest(str.getBytes(UTF_8));
        } catch (Exception e) {
            throw new RuntimeException("编码失败", e);
        }
        return new BigInteger(1, digest).toString(16);
    }
}
