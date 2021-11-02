package com.example.calendarcyberneth.payload.converter;

import com.example.calendarcyberneth.model.Event;
import com.example.calendarcyberneth.payload.response.EventCreateResponse;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
public class EventConverter {


   public EventCreateResponse convertToEventResponse(Event event){
       return EventCreateResponse.builder()
               .description(event.getDescription())
               .finish_date((event.getFinish_date()))
               .startDate(event.getStartDate())
               .title(event.getTitle())
               .build();
   }

}
