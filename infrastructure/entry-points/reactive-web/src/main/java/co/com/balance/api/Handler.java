package co.com.balance.api;

import co.com.balance.model.retriveBalances.object.ObjectRequest;
import co.com.balance.model.retriveBalances.object.ObjectResponse;
import co.com.balance.usecase.BalanceUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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

        Mono<ObjectRequest> body = serverRequest
                .bodyToMono(ObjectRequest.class);
            body.subscribe(x->System.out.println(x.toString()));

        Mono<ObjectResponse>  result =  serverRequest
                .bodyToMono(ObjectRequest.class)
                .flatMap(objectRequest -> balanceUseCase.getBalanceAccount(objectRequest));

        return ServerResponse
                .ok()
                //.contentType(MediaType.APPLICATION_JSON)
                .body(result,BalanceUseCase.class);
    }

}
