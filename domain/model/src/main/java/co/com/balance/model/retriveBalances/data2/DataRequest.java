package co.com.balance.model.retriveBalances.data2;

import co.com.balance.model.retriveBalances.account.AccountRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DataRequest {
    private AccountRequest account;

}
