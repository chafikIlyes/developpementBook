package com.smartiqa.developpementBook.controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;

@AutoConfigureMockMvc
@SpringBootTest
public class BascketControllerTest {

    //Inject Support Utils
    private MockHttpServletRequest request;

    // Inject services
    @Mock
    BascketService bascketService ;

    @Test
    public  void  placeHolderTest(){

    }

}
