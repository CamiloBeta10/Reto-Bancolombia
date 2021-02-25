package co.com.balance.model.retrieveTransactions;

import co.com.balance.model.retrieveTransactions.object.ObjectMovementRequest;
import co.com.balance.model.retrieveTransactions.object.ObjectMovementResponse;
import reactor.core.publisher.Mono;

public interface RetriveMovementGateway {

   Mono<ObjectMovementResponse> getMovement(ObjectMovementRequest objectMovementRequest);
}
