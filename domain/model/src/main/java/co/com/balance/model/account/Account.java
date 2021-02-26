package co.com.balance.model.account;

import co.com.balance.model.retrieveTransactions.object.ObjectMovementResponse;
import co.com.balance.model.retriveBalances.object.ObjectResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Account {

    private ObjectResponse Balance;
    private ObjectMovementResponse Movements;
}
