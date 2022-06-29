package com.smartiqa.tdd;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;

@AutoConfigureMockMvc
@SpringBootTest
class BascketDiscountPriceCalculatorTest {

    // Inject Support Utils
private static MockHttpServletRequest request;

// Inject services 
@Mock
BascketServices bascketServicesMock;

@Test
    public void placeHolderTest (){

}


}
