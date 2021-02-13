package co.com.balance.model.retriveBalances.data2;

import co.com.balance.model.retriveBalances.account.AccountRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataRequest {
    private AccountRequest account;

}
