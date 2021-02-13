package co.com.balance.model.retriveBalances.object;

import co.com.balance.model.retriveBalances.data2.DataResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ObjectResponse {
    private DataResponse data;

}
