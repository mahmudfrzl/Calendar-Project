package com.example.calendarcyberneth.payload.request;

import lombok.*;

import javax.persistence.Column;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class EventCreateRequest {
    private String description;
    private String title;
    private LocalDate startDate;
    private LocalDate  finish_date;
}
