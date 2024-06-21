package com.sb.sdjpa.crud.service;

import com.sb.sdjpa.crud.request.CustomerRequest;
import com.sb.sdjpa.crud.response.APIResponse;
import org.springframework.http.ResponseEntity;

public interface CustomerService {
    ResponseEntity<APIResponse> createCustomer(CustomerRequest request);
    ResponseEntity<APIResponse> getAllCustomers();
    ResponseEntity<APIResponse> getByCustomerId(long customerId);
    ResponseEntity<APIResponse> deleteByCustomerId(long customerId);
    ResponseEntity<APIResponse> updateCustomerDetails(long customerId, CustomerRequest request);
    ResponseEntity<APIResponse> getCustomerUsingPositionBasedParameters(String customerName, int customerAge);
    ResponseEntity<APIResponse> getCustomerUsingNamedParameters(String customerName, int customerAge);
    ResponseEntity<APIResponse> getCustomerUsingNativeQuery(String mobileNumber);
    ResponseEntity<APIResponse> getTotalCustomerCount();

}
