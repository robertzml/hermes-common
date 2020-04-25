package com.shengdangjia.hermescommon.utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JwtHelperTest {

    @Test
    void decodeIdJWT() {
        var token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzM4NCJ9.eyJzdWIiOiJpZCB0b2tlbiIsInVpZCI6IjgzNzM4YjVlLTZiNWYtNGM3YS1iY2QyLTM2YmY4Nzc5NmQ4NSIsImlzcyI6ImF1dGgiLCJleHAiOjE1NzY1ODQ4MTd9.hbf1ojCBUBQqNUcG7ExPhbR9rcg7X0TurH_w2l_GwQUmfIZaf20ORDLKp0l8Z0gm";

        var jwt = JwtHelper.decodeIdJWT(token);

        assertEquals(false, jwt.isSuccess());
    }
}