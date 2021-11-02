package com.example.calendarcyberneth.service;

import com.example.calendarcyberneth.dao.EventDAO;
import com.example.calendarcyberneth.model.Event;
import com.example.calendarcyberneth.payload.converter.EventConverter;
import com.example.calendarcyberneth.payload.request.EventCreateRequest;
import com.example.calendarcyberneth.payload.response.EventCreateResponse;
import com.example.calendarcyberneth.utility.DataResult;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class EventServiceTest {
    private EventService eventService;

    private  EventDAO eventDAO;
    private  EventConverter eventConverter;
    @Before
    public void setUp() throws Exception {
        eventDAO = Mockito.mock(EventDAO.class);
        eventConverter = Mockito.mock(EventConverter.class);
        eventService = new EventService(eventDAO,eventConverter);
    }
    @Test
    public void whenCreateEventCalledWithValidRequest_itShouldReturnValidEventDto(){
        EventCreateRequest eventCreateRequest = EventCreateRequest.builder()
                .description("descrip")
                .finish_date(LocalDate.of(2020,4,5))
                .startDate(LocalDate.of(2000,5,8))
                .title("title").build();

    Event event = new Event(
            eventCreateRequest.getDescription()
            , eventCreateRequest.getTitle()
            , eventCreateRequest.getStartDate()
            , eventCreateRequest.getFinish_date()
    );
     EventCreateResponse eventCreateResponse = EventCreateResponse.builder()
                .description("descrip")
                .finish_date(LocalDate.of(2020,4,5))
                .startDate(LocalDate.of(2000,5,8))
                .title("title").build();
    Mockito.when(eventDAO.save(event)).thenReturn(event);
    Mockito.when(eventConverter.convertToEventResponse(event)).thenReturn(eventCreateResponse);

    DataResult<EventCreateResponse>  response = eventService.create(eventCreateRequest);
        Assert.assertEquals(response,eventCreateResponse);
        Mockito.verify(eventDAO).save(event);
        Mockito.verify(eventConverter).convertToEventResponse(event);
    }
}