package co.com.balance.model.retrieveTransactions.data;

import co.com.balance.model.retrieveTransactions.office.OfficeMovement;
import co.com.balance.model.retrieveTransactions.pagination.PaginationMovementRequest;
import co.com.balance.model.retrieveTransactions.transaction.TransactionRequest;
import co.com.balance.model.retriveBalances.account.AccountRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class DataMovementRequest {
    private OfficeMovement office;
    private TransactionRequest transaction;
    private AccountRequest account;
    private PaginationMovementRequest pagination;
}
