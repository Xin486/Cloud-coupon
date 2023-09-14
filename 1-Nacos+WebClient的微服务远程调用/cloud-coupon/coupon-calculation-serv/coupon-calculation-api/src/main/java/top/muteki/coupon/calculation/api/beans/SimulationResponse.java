package top.muteki.coupon.calculation.api.beans;

import com.google.common.collect.Maps;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimulationResponse {
    private Long bestCouponId;
    private Map<Long,Long> couponToOrderPrice = Maps.newHashMap();
}
