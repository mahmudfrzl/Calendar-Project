package com.example.calendarcyberneth.service;

import com.example.calendarcyberneth.dao.EventDAO;
import com.example.calendarcyberneth.model.Event;
import com.example.calendarcyberneth.payload.converter.EventConverter;
import com.example.calendarcyberneth.payload.request.EventCreateRequest;
import com.example.calendarcyberneth.payload.response.EventCreateResponse;
import com.example.calendarcyberneth.utility.DataResult;
import com.example.calendarcyberneth.utility.SuccessDataResult;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class EventService {
    private final EventDAO eventDAO;
    private final EventConverter eventConverter;
    public DataResult<EventCreateResponse> create(EventCreateRequest eventCreateRequest) {
        Event event = new Event(
                  eventCreateRequest.getDescription()
                , eventCreateRequest.getTitle()
                , eventCreateRequest.getStartDate()
                , eventCreateRequest.getFinish_date()
        );
        EventCreateResponse eventCreateResponse = eventConverter.convertToEventResponse(eventDAO.save(event));
        return new SuccessDataResult<>(eventCreateResponse,
                "Event has been succesfully created"
                , LocalDateTime.now()
                , HttpStatus.CREATED
                ,HttpStatus.CREATED.value()
        );
    }
}
