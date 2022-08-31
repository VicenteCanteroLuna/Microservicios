package com.bosonit.serviceproducts.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
public class ErrorMessage {
    private String code ;
    private List<Map<String, String >> messages ;
}


//https://www.youtube.com/watch?v=BZl4_LuYhm4&list=PLxy6jHplP3Hi_W8iuYSbAeeMfaTZt49PW&index=9
