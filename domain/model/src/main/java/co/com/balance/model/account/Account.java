package co.com.balance.model.account;

import co.com.balance.model.retrieveTransactions.transaction.TransactionResponse;
import co.com.balance.model.retriveBalances.balance.BalanceResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Account {

    private BalanceResponse Balance;
    private TransactionResponse Movements;
}
