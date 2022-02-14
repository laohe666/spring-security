package com.laohe;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String a = passwordEncoder.encode("1223333");
        System.out.println(a);
        boolean matches = passwordEncoder.matches("123333", a);
        System.out.println(matches);
    }
}
