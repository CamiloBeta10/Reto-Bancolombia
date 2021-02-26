package co.com.balance.usecase;

import co.com.balance.model.movements.Movements;
import co.com.balance.model.responseApi.DataApi;
import co.com.balance.model.retrieveTransactions.RetriveMovementGateway;
import co.com.balance.model.retrieveTransactions.object.ObjectMovementRequest;
import co.com.balance.model.retriveBalances.RetriveBalanceGateway;
import co.com.balance.model.retriveBalances.data2.DataRequest;
import co.com.balance.model.retriveBalances.object.ObjectRequest;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class BalanceUseCase {

    private final RetriveBalanceGateway retriveBalanceGateway;
    private final RetriveMovementGateway retriveMovementGateway;

    public Mono<Movements> getBalanceAndMovement(ObjectMovementRequest objectMovementRequest) {
        ObjectRequest balanceRequest = ObjectRequest.builder()
                .data(DataRequest.builder()
                        .account(objectMovementRequest.getData().getAccount())
                        .build())
                .build();
        Mono<Movements> tupla = Mono.zip(retriveBalanceGateway.getBalanceAccount(balanceRequest)
                ,retriveMovementGateway.getMovementAccount(objectMovementRequest))
                .flatMap(tuplas -> Mono.just(Movements.builder()
                        .data(DataApi.builder()
                                ._flagMoreRecords(tuplas.getT2().getData().is_flagMoreRecords())
                                ._responseSize(tuplas.getT2().getData().get_responseSize())
                                .relatedTransferAccount(tuplas.getT2().getData().getRelatedTransferAccount())
                                .transaction(tuplas.getT2().getData().getTransaction())
                                .account(tuplas.getT1().getData().getAccount())
                                .build())
                        .build()));

        return tupla;

     }

}




