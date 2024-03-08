package org.restApi.InquireRestApi.Structure;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude
public class InquireCustomerResp {

    private String customerId,
            storeId,
            firstName,
            lastName,
            email,
            addressId,
            active;

}
