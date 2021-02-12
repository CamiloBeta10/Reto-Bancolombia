package co.com.balance.model.retriveBalances.balance;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class BalanceResponse {

    private Number available;
    private Number availableOverdraftBalance;
    private Number overdraftValue;
    private Number availableOverdraftQuota;
    private Number cash;
    private Number unavailableClearing;
    private Number receivable;
    private Number blocked;
    private Number unavailableStartDayClearingStartDay;
    private Number cashStartDay;
    private Number pockets;
    private Number remittanceQuota;
    private Number agreedRemittanceQuota;
    private Number remittanceQuotaUsage;
    private Number normalInterest;
    private Number suspensionInterest;

}
