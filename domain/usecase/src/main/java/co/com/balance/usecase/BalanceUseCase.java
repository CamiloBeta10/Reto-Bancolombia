package co.com.balance.usecase;

import co.com.balance.model.retriveBalances.RetriveBalanceGateway;
import co.com.balance.model.retriveBalances.object.ObjectRequest;
import co.com.balance.model.retriveBalances.object.ObjectResponse;
import reactor.core.publisher.Mono;

public class BalanceUseCase {

    private RetriveBalanceGateway retriveBalanceGateway;

    public BalanceUseCase(RetriveBalanceGateway retriveBalanceGateway) {
        this.retriveBalanceGateway = retriveBalanceGateway;
    }

    public Mono<ObjectResponse> getBalanceAccount(ObjectRequest objectRequest){
        return retriveBalanceGateway
                .getBalanceAccount(objectRequest);
                //.flatMap(objectResponse -> retriveBalanceGateway.getBalanceAccount(objectRequest));

    }


}