package com.zerobank.step_definitions;

import com.zerobank.utilities.Driver;
import org.junit.After;

public class Hooks {
    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}
