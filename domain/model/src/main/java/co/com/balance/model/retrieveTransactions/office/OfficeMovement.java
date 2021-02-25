package co.com.balance.model.retrieveTransactions.office;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)

public class OfficeMovement {
    private String code;
    private String name;

}
