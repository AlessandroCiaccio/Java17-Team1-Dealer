package com.develhope.spring.features.orders.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TotalSalesPricePeriodRequest {
    private String startDate;
    private String endDate;
}