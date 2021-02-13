package co.com.balance.model.retriveBalances.account;
import co.com.balance.model.retriveBalances.balance.BalanceResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class AccountResponse {
    private BalanceResponse balances;
}
