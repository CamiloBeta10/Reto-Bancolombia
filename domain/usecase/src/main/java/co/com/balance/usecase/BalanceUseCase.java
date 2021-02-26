package co.com.balance.usecase;

import co.com.balance.model.retrieveTransactions.RetriveMovementGateway;
import co.com.balance.model.retrieveTransactions.object.ObjectMovementRequest;
import co.com.balance.model.retrieveTransactions.object.ObjectMovementResponse;
import co.com.balance.model.retriveBalances.RetriveBalanceGateway;
import co.com.balance.model.retriveBalances.data2.DataRequest;
import co.com.balance.model.retriveBalances.object.ObjectRequest;
import co.com.balance.model.retriveBalances.object.ObjectResponse;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@RequiredArgsConstructor
public class BalanceUseCase {

    private final RetriveBalanceGateway retriveBalanceGateway;
    private final RetriveMovementGateway retriveMovementGateway;

    public Mono<ObjectMovementResponse> getBalanceAndMovement(ObjectMovementRequest objectMovementRequest) {
        ObjectRequest balanceRequest = ObjectRequest.builder()
                .data(DataRequest.builder()
                        .account(objectMovementRequest.getData().getAccount())
                        .build())
                .build();
        Mono<Tuple2<ObjectResponse,ObjectMovementResponse>> tupla = Mono.zip(retriveBalanceGateway.getBalanceAccount(balanceRequest)
                ,retriveMovementGateway.getMovementAccount(objectMovementRequest));

        tupla.subscribe(
                response -> {System.out.println(response.getT1());
                    System.out.println(response.getT2());}
        );
        return  Mono.just(ObjectMovementResponse.builder().build());

     }

}




