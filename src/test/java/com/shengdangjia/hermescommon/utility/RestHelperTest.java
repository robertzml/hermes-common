package com.shengdangjia.hermescommon.utility;

import com.shengdangjia.hermescommon.model.ResponseData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestHelperTest {

    @Test
    void makeResponse() {
        var result = RestHelper.makeResponse("jack", 0, "maybe");

        System.out.println(result.time);
        assertEquals("jack", result.result);
    }
}