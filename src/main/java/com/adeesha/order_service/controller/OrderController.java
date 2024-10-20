package com.adeesha.order_service.controller;

import com.adeesha.order_service.dto.RomanceMovieDto;
import com.adeesha.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequestMapping("api/order")
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/romance")
    public Flux<RomanceMovieDto> getRomanceMovies(){
        return orderService.orderRomanceMovies();
    }

}
