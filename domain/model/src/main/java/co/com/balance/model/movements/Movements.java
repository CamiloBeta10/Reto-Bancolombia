package co.com.balance.model.movements;

import co.com.balance.model.responseApi.DataApi;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Movements{
    private DataApi data;
}
