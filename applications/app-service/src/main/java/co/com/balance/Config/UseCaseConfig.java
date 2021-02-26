package co.com.balance.Config;

import co.com.balance.model.retrieveTransactions.RetriveMovementGateway;
import co.com.balance.model.retriveBalances.RetriveBalanceGateway;
import co.com.balance.usecase.BalanceUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public BalanceUseCase balanceUseCase (RetriveBalanceGateway retriveBalanceGateway, RetriveMovementGateway retriveMovementGateway){
        return new BalanceUseCase(retriveBalanceGateway,retriveMovementGateway);
    }

}
