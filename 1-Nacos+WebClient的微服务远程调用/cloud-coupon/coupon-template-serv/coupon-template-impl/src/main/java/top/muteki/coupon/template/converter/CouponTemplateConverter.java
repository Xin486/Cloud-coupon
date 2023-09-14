package top.muteki.coupon.template.converter;

import top.muteki.coupon.template.api.beans.CouponTemplateInfo;

/**
 * @author muteki
 * @date 2023/9/8
 * @description CouponTemplateConverter
 **/
public class CouponTemplateConverter {

    public static CouponTemplateInfo convertToTemplateInfo(top.muteki.coupon.template.dao.entity.CouponTemplate template) {

        return CouponTemplateInfo.builder()
                .id(template.getId())
                .name(template.getName())
                .desc(template.getDescription())
                .type(template.getCategory().getCode())
                .shopId(template.getShopId())
                .available(template.getAvailable())
                .rule(template.getRule())
                .build();
    }
}