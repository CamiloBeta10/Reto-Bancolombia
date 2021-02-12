package co.com.balance.model.retriveBalances;

import co.com.balance.model.retriveBalances.object.ObjectRequest;
import co.com.balance.model.retriveBalances.object.ObjectResponse;
import reactor.core.publisher.Mono;

public interface RetriveBalanceGateway {

   Mono<ObjectResponse> getBalanceAccount(ObjectRequest objectRequest);
}
