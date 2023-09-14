package top.muteki.coupon.calculation.api.beans;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.muteki.coupon.template.api.beans.CouponInfo;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCart {
    @NotEmpty
    private List<Product> products;
    private Long couponId;
    private long cost;
    private List<CouponInfo> couponInfos;
    @NotNull
    private Long userId;
}
