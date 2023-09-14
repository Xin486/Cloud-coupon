package top.muteki.coupon.calculation.template.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.muteki.coupon.calculation.api.beans.ShoppingCart;
import top.muteki.coupon.calculation.template.AbstractRuleTemplate;
import top.muteki.coupon.calculation.template.RuleTemplate;
@Slf4j
@Component
public class DummyTemplate extends AbstractRuleTemplate implements RuleTemplate {
    @Override
    public ShoppingCart calculate(ShoppingCart order){
        long orderTotalAmount=getTotalPrice(order.getProducts());
        order.setCost(orderTotalAmount);
        return order;
    }
    @Override
    protected Long calculateNewPrice(Long orderTotalAmount, Long shopTotalAmount, Long quota) {
        return null;
    }
}
