package com.xiaosong.community;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CommunityApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    public void test(){
        String classPaths = ClassPath.getClassPath();
        String[] classPath = classPaths.split(";");
        for(String s: classPath) {
            System.out.println(s);
        }
    }

}
