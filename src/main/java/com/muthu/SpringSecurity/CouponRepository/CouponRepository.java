package com.muthu.SpringSecurity.CouponRepository;


import com.muthu.SpringSecurity.Entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CouponRepository  extends JpaRepository<Coupon,Integer> {
     Coupon findByCode(String code);
}
