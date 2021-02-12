package co.com.balance.usecase.balance;

import co.com.balance.model.retriveBalances.RetriveBalanceGateway;
import co.com.balance.model.retriveBalances.object.ObjectRequest;
import co.com.balance.model.retriveBalances.object.ObjectResponse;
import reactor.core.publisher.Mono;

public class BalanceUseCase {

    private RetriveBalanceGateway retriveBalanceGateway;


    private String route;

    public BalanceUseCase(RetriveBalanceGateway retriveBalanceGateway) {
        this.retriveBalanceGateway = retriveBalanceGateway;
    }

    public Mono<ObjectResponse> getBalanceAccount(){
        return retriveBalanceGateway.getBalanceAccount(ObjectRequest.builder().build());
    }


}