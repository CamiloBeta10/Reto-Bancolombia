package co.com.balance.model.retrieveTransactions.relatedTransferAccount;

import co.com.balance.model.retrieveTransactions.customer.CustomerResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class RelatedTransferAccountResponse {
    private String type;
    private String name;
    private CustomerResponse customer;

}
