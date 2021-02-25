package co.com.balance.model.retrieveTransactions.transaction;

import co.com.balance.model.retrieveTransactions.office.OfficeMovementResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class TransactionResponse {
    private String id;
    private String decription;
    private String amount;
    private String type;
    private String reference1;
    private String reference2;
    private String reference3;
    private String checkNumber;
    private OfficeMovementResponse office;



}
