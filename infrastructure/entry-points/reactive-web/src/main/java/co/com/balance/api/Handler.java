package co.com.balance.api;

import co.com.balance.model.movements.Movements;
import co.com.balance.model.retrieveTransactions.object.ObjectMovementRequest;
import co.com.balance.usecase.BalanceUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {

    @Autowired
    private BalanceUseCase balanceUseCase;

    public Mono<ServerResponse> getBalanceAndMovement(ServerRequest serverRequest) {

       Mono<Movements>  result =  serverRequest
                .bodyToMono(ObjectMovementRequest.class)
                .flatMap(objectMovementRequest -> balanceUseCase.getBalanceAndMovement(objectMovementRequest));
        return ServerResponse
                .ok()
                .body(result,Movements.class);

    }

}
