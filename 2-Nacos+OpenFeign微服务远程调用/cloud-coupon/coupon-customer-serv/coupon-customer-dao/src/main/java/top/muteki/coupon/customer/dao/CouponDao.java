package top.muteki.coupon.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.muteki.coupon.customer.dao.entity.Coupon;

public interface CouponDao extends JpaRepository<Coupon,Long> {
    long countByUserIdAndTemplateId(Long userId,Long templateId);
}
