package co.com.balance.model.retrieveTransactions.transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class TransactionRequest {
    private String startDate;
    private String endDate;
    private String minAmount;
    private String maxAmount;
    private String type;
    private String checkNumber;
    private String group;
    private String description;



}
