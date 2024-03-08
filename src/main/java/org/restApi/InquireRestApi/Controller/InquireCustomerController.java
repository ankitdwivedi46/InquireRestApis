package org.restApi.InquireRestApi.Controller;

import org.restApi.InquireRestApi.Pojo.Customer;
import org.restApi.InquireRestApi.Structure.InquireCustomerReq;
import org.restApi.InquireRestApi.Structure.InquireCustomerResp;
import org.restApi.InquireRestApi.Utilities.ResponseConverterUtility;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@RestController
public class InquireCustomerController {

    @GetMapping("/inquireCustomer")
    public InquireCustomerResp inquireStudent(@RequestBody InquireCustomerReq inquireCustomerReq) throws SQLException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        Customer customer = new Customer();
        List<Customer> customerList = customer.queryCustomerByCustId(inquireCustomerReq.getCustomerId());

        ResponseConverterUtility responseConverterUtility = new ResponseConverterUtility();
        return responseConverterUtility.composeInquireCustomerResponse(customerList);

    }

}
