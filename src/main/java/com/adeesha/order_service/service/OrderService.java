package com.adeesha.order_service.service;

import com.adeesha.order_service.dto.RomanceMovieDto;
import reactor.core.publisher.Flux;

public interface OrderService {
    Flux<RomanceMovieDto> orderRomanceMovies();
}
