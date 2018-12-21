package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import java.util.HashMap



@RestController
class ApiController{

    @GetMapping("/")
    @ResponseBody
    fun doThis(): HashMap<String, String>{
        val map = HashMap<String, String>()
        map.put("key", "value")
        map.put("this", "that'")
        return map
    }
}
