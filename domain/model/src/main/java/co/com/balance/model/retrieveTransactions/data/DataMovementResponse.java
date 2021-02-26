package co.com.balance.model.retrieveTransactions.data;

import co.com.balance.model.retrieveTransactions.relatedTransferAccount.RelatedTransferAccountResponse;
import co.com.balance.model.retrieveTransactions.transaction.TransactionResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class DataMovementResponse {
    private float _responseSize;
    private boolean _flagMoreRecords;
    private List<TransactionResponse> transaction;
    private RelatedTransferAccountResponse relatedTransferAccount;
}
