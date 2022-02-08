package com.ani.drools.decision.demo;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.ani.drools.decision.demo.controller.OrderOutputController;
import com.ani.drools.decision.demo.model.OrderOutput;
import com.ani.drools.decision.demo.model.OrderRequest;
import com.ani.drools.decision.demo.model.PaymentType;

@ExtendWith(MockitoExtension.class)
public class OrderOutputControllerTest {
	
	@InjectMocks
    OrderOutputController orderOutputController;
     

     
    @Test
    public void testAddEmployee() 
    {
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        OrderRequest orderRequest = new OrderRequest();
        orderRequest.setPaymentType(PaymentType.BOOK);

        ResponseEntity<OrderOutput> responseEntity  = orderOutputController.getOutput(orderRequest);
         
        assertThat(responseEntity.getStatusCodeValue()).isEqualTo(201);
        assertThat(responseEntity.getHeaders().getLocation().getPath()).isEqualTo("/1");
    }

}
