package co.com.balance.model.retrieveTransactions.object;

import co.com.balance.model.retrieveTransactions.data.DataMovementRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ObjectMovementRequest {
    private DataMovementRequest data;
}
