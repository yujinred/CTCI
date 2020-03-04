package com.company.ctci;

public class TestUtil {

    public static void assertEquals(String msg, Object obj1, Object obj2) throws Exception {
        if (!obj1.equals(obj2)) {
            throw new Exception(msg);
        }
    }
}
