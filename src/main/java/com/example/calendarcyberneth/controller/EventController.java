package com.example.calendarcyberneth.controller;

import com.example.calendarcyberneth.payload.request.EventCreateRequest;
import com.example.calendarcyberneth.payload.response.EventCreateResponse;
import com.example.calendarcyberneth.service.EventService;
import com.example.calendarcyberneth.utility.DataResult;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/events")
public class EventController {
    private final EventService eventService;

    @PostMapping("/create")
    public ResponseEntity<DataResult<EventCreateResponse>> create(@RequestBody EventCreateRequest eventCreateRequest){
        return ResponseEntity.ok(eventService.create(eventCreateRequest));
    }
}
