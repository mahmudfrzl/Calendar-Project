package com.example.calendarcyberneth.payload.response;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EventCreateResponse {
    private String description;
    private String title;
    private LocalDate startDate;
    private LocalDate  finish_date;
}
