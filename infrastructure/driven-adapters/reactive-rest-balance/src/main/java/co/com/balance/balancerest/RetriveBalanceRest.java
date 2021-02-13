package co.com.balance.balancerest;


import co.com.balance.model.retriveBalances.RetriveBalanceGateway;
import co.com.balance.model.retriveBalances.object.ObjectRequest;
import co.com.balance.model.retriveBalances.object.ObjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Component
public class RetriveBalanceRest implements RetriveBalanceGateway {

    @Autowired
    private WebClient webClient;

    @Override
    public Mono<ObjectResponse> getBalanceAccount(ObjectRequest objectRequest) {
        Mono<ObjectResponse> balance = webClient
                .post()
                .uri("/consulta/saldos")
                .body(Mono.just(objectRequest),ObjectRequest.class)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(ObjectResponse.class);

        return balance;
    }
}
