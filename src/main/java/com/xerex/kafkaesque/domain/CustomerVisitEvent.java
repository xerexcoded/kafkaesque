package com.xerex.kafkaesque.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CustomerVisitEvent {
    private String customerId;
    private LocalDateTime dateTime;
}
