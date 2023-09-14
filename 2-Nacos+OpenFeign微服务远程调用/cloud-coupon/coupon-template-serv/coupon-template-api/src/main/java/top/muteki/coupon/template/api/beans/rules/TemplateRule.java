package top.muteki.coupon.template.api.beans.rules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemplateRule {
    private Discount discount;
    private Integer limitation;
    private Long deadline;
}
