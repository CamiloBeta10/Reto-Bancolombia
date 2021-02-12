package co.com.balance.model.retriveBalances.object;

import co.com.balance.model.retriveBalances.data2.DataRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ObjectRequest {
    public DataRequest data;

}
 