package com.smartiqa.developpementBook.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

@AutoConfigureMockMvc
@SpringBootTest
public class BascketControllerTest {

    //Inject Support Utils
    private static MockHttpServletRequest request;
    @Autowired
    MockMvc mockMvc;
    @Autowired
    ObjectMapper objectMapper;
    public static final MediaType APPLICATION_JSON_UTF8 = MediaType.APPLICATION_JSON;

    // Inject services
    @Mock
    BascketService bascketService;

    @BeforeAll
    public static void setup() {

        request = new MockHttpServletRequest();

    }
    @Test
    public Double calculateDiscountBascketTest (){
        List<Book> bookList = new ArrayList<Book>();
    }

}
