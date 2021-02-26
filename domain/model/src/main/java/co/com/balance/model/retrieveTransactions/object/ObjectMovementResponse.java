package co.com.balance.model.retrieveTransactions.object;

import co.com.balance.model.retrieveTransactions.data.DataMovementResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ObjectMovementResponse {
    private DataMovementResponse data;
}
