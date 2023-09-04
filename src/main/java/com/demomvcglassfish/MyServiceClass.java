package com.demomvcglassfish;

import org.springframework.stereotype.Service;

@Service
public class MyServiceClass {
    public int factorial(int n)
    {
        // Base case
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }
}
