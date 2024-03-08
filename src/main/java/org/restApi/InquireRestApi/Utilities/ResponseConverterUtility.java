package org.restApi.InquireRestApi.Utilities;

import org.restApi.InquireRestApi.Pojo.Customer;
import org.restApi.InquireRestApi.Structure.InquireCustomerResp;

import java.io.IOException;
import java.util.List;

public class ResponseConverterUtility {

    public InquireCustomerResp composeInquireCustomerResponse(List<Customer> customerList) throws IOException {

        InquireCustomerResp inquireCustomerResp = new InquireCustomerResp();
        inquireCustomerResp.setCustomerId(customerList.get(0).getCustomer_id());
        inquireCustomerResp.setActive(customerList.get(0).getActive());
        inquireCustomerResp.setAddressId(customerList.get(0).getAddress_id());
        inquireCustomerResp.setEmail(customerList.get(0).getEmail());
        inquireCustomerResp.setFirstName(customerList.get(0).getFirst_name());
        inquireCustomerResp.setStoreId(customerList.get(0).getStore_id());
        return inquireCustomerResp;

    }

}
