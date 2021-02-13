package co.com.balance.model.retriveBalances.data2;

import co.com.balance.model.retriveBalances.account.AccountResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class DataResponse {
    private AccountResponse account;

}
