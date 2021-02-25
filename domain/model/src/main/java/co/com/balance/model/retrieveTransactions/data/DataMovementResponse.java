package co.com.balance.model.retrieveTransactions.data;

import co.com.balance.model.retrieveTransactions.pagination.PaginationMovementRequest;
import co.com.balance.model.retriveBalances.account.AccountRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class DataMovementResponse {
    private float _responseSize;
    private float _flagMoreRecords;
    private AccountRequest account;
    private PaginationMovementRequest pagination;
}
