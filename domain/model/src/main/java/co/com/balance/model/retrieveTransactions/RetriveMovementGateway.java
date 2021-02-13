package co.com.balance.model.retrieveTransactions;

import co.com.balance.model.retriveBalances.object.ObjectRequest;
import co.com.balance.model.retriveBalances.object.ObjectResponse;
import reactor.core.publisher.Mono;

public interface RetriveMovementGateway {

   Mono<ObjectResponse> getBalanceAccount(ObjectRequest objectRequest);
}
