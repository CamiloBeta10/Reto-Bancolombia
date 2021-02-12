package co.com.balance.model.retriveBalances.account;
import co.com.balance.model.retriveBalances.data2.DataRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class AccountRequest {
    private DataRequest dataRequest;
    private String type;
    private String number;
}
