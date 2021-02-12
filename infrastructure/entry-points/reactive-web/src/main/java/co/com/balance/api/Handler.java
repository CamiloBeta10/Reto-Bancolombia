package co.com.balance.api;

import co.com.balance.model.retriveBalances.object.ObjectRequest;
import co.com.balance.model.retriveBalances.object.ObjectResponse;
import co.com.balance.usecase.balance.BalanceUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {

    private BalanceUseCase balanceUseCase;

    public Mono<ServerResponse> getBalanceAccount(ServerRequest serverRequest) {

        Mono<ObjectResponse>  result =  balanceUseCase.getBalanceAccount();

        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(result,BalanceUseCase.class);
    }

}
