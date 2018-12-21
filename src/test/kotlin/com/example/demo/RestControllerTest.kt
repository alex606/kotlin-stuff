package com.example.demo

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RestControllerTest {

    @Autowired
    lateinit var testRestTemplate: TestRestTemplate

    @Test
    fun `small test for the rest controller`(){
        val response = testRestTemplate.getForEntity("/", String::class.java)
        assert(response.statusCode == HttpStatus.OK) {"Response not OK"}
        val expectedValue = response.body?.contains("this") ?: false
        assert(expectedValue) {"Response doesn't have expected content."}
    }
}
