package com.sb.sdjpa.crud.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder(toBuilder = true)
public class CustomersCount {
    private long totalCustomers;
}
