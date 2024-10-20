package com.adeesha.order_service.service.impl;

import com.adeesha.order_service.dto.RomanceMovieDto;
import com.adeesha.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private WebClient webClient;
    @Override
    public Flux<RomanceMovieDto> orderRomanceMovies() {
        return webClient.get()
                .uri("http://localhost:8080/api/movies/romance")
                .retrieve()
                .bodyToFlux(RomanceMovieDto.class);
    }
}
