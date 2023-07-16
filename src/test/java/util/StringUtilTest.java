package util;

import org.junit.jupiter.api.Test;

class StringUtilTest {

    @Test
    void getUUID() {
        String uuid = StringUtil.getUUID();
        System.out.println(uuid);
    }

    @Test
    void md5() {
        String md5 = StringUtil.md5("123456");
        System.out.println(md5);
    }
}