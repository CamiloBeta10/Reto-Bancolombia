package co.com.balance.model.responseApi;

import co.com.balance.model.retrieveTransactions.relatedTransferAccount.RelatedTransferAccountResponse;
import co.com.balance.model.retrieveTransactions.transaction.TransactionResponse;
import co.com.balance.model.retriveBalances.account.AccountResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class DataApi {
    private AccountResponse account;
    private float _responseSize;
    private boolean _flagMoreRecords;
    private List<TransactionResponse> transaction;
    private RelatedTransferAccountResponse relatedTransferAccount;
}
