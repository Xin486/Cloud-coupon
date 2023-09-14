package top.muteki.coupon.calculation.service;

import org.springframework.web.bind.annotation.RequestBody;
import top.muteki.coupon.calculation.api.beans.ShoppingCart;
import top.muteki.coupon.calculation.api.beans.SimulationOrder;
import top.muteki.coupon.calculation.api.beans.SimulationResponse;

public interface CouponCalculationService {
    ShoppingCart calculateOrderPrice(@RequestBody ShoppingCart cart);
    SimulationResponse simulateOrder(@RequestBody SimulationOrder cart);
}
