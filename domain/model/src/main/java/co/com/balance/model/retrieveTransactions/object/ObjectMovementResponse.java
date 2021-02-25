package co.com.balance.model.retrieveTransactions.object;

import co.com.balance.model.retrieveTransactions.data.DataMovementRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ObjectMovementResponse {
    private DataMovementRequest data;
}
