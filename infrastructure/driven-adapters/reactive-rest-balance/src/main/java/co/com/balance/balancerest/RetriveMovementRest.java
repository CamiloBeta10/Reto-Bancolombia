package co.com.balance.balancerest;


import co.com.balance.model.retrieveTransactions.RetriveMovementGateway;
import co.com.balance.model.retrieveTransactions.object.ObjectMovementRequest;
import co.com.balance.model.retrieveTransactions.object.ObjectMovementResponse;
import co.com.balance.model.retriveBalances.RetriveBalanceGateway;
import co.com.balance.model.retriveBalances.object.ObjectRequest;
import co.com.balance.model.retriveBalances.object.ObjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Component
public class RetriveMovementRest implements RetriveMovementGateway {

    @Autowired
    private WebClient webClient;

    @Override
    public Mono<ObjectMovementResponse> getMovementAccount(ObjectMovementRequest objectMovementRequest) {
        Mono<ObjectMovementResponse> movement = webClient
                .post()
                .uri("/consulta/movimientos")
                .body(Mono.just(objectMovementRequest),ObjectMovementRequest.class)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(ObjectMovementResponse.class)
                .log();

        return movement;
    }
}
