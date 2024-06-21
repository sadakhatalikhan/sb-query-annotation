package com.sb.sdjpa.crud.repository;

import com.sb.sdjpa.crud.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<CustomerModel, Long> {

    @Query("SELECT c FROM CustomerModel c WHERE c.customerName =?1 and c.customerAge =?2")
    Optional<CustomerModel> findByCustomers(String customerName, int customerAge);

    @Query("SELECT c FROM CustomerModel c WHERE c.customerName = :name and c.customerAge = :age")
    Optional<CustomerModel> findByNamedParameters(@Param("name") String customerName, @Param("age") int customerAge);

    @Query(value = "SELECT * from customer_details c WHERE c.customer_mobile_number = :mobileNumber", nativeQuery = true)
    Optional<CustomerModel> findBasedOnMobileNumber(@Param("mobileNumber") String mobileNumber);

    @Query(value = "SELECT count(*) FROM customer_details", nativeQuery = true)
    Long findAllCustomersCount();
}
