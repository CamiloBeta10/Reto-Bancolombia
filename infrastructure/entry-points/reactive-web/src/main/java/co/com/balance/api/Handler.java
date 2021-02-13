package co.com.balance.api;

import co.com.balance.model.retriveBalances.object.ObjectRequest;
import co.com.balance.model.retriveBalances.object.ObjectResponse;
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

    public Mono<ServerResponse> getBalanceAccount(ServerRequest serverRequest) {

       Mono<ObjectResponse>  result =  serverRequest
                .bodyToMono(ObjectRequest.class)
                .flatMap(objectRequest -> balanceUseCase.getBalanceAccount(objectRequest));


        return ServerResponse
                .ok()
                .body(result,ObjectResponse.class);

    }

}
