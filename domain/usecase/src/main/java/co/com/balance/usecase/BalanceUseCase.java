package co.com.balance.usecase;

import co.com.balance.model.account.Account;
import co.com.balance.model.retrieveTransactions.RetriveMovementGateway;
import co.com.balance.model.retrieveTransactions.object.ObjectMovementRequest;
import co.com.balance.model.retrieveTransactions.object.ObjectMovementResponse;
import co.com.balance.model.retrieveTransactions.transaction.TransactionRequest;
import co.com.balance.model.retrieveTransactions.transaction.TransactionResponse;
import co.com.balance.model.retriveBalances.RetriveBalanceGateway;
import co.com.balance.model.retriveBalances.balance.BalanceResponse;
import co.com.balance.model.retriveBalances.object.ObjectRequest;
import co.com.balance.model.retriveBalances.object.ObjectResponse;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

public class BalanceUseCase {

    private RetriveBalanceGateway retriveBalanceGateway;
    private  RetriveMovementGateway retriveMovementGateway;


    public BalanceUseCase(RetriveBalanceGateway retriveBalanceGateway, RetriveMovementGateway retriveMovementGateway) {
        this.retriveBalanceGateway = retriveBalanceGateway;
        this.retriveMovementGateway = retriveMovementGateway;
    }

    public Mono<ObjectResponse> getBalanceAccount(ObjectRequest objectRequest){
        System.out.println(objectRequest);
        return retriveBalanceGateway
                .getBalanceAccount(objectRequest);

    }

    public Mono <ObjectMovementResponse> getMovement (ObjectMovementRequest objectMovementRequest){
        return retriveMovementGateway
                .getMovement(objectMovementRequest);
    }

    public Mono<Account> getBalanceAndMovement() {
        Mono<Tuple2<BalanceResponse, TransactionResponse>> tupla = Mono.zip(retriveBalanceGateway.getBalanceAccount()
                ,retriveMovementGateway.getMovement());
        Mono<Account> account = tupla.flatMap( t -> {
            return Mono.just(Account.builder().Balance(t.getT1()).Movements(t.getT2()).build());
        });
        return account;
    }
    /*
    public Mono<Account> getBalanceAndMovement() {
        Mono<Tuple2<Balance,Movements>> tupla = Mono.zip(balanceGateway.getBalance()
                ,movementsGateway.getMovements());
        Mono<Account> account = tupla.flatMap( t -> {
            return Mono.just(Account.builder().balance(t.getT1()).movements(t.getT2()).build());
        });
        return account; */
    }




