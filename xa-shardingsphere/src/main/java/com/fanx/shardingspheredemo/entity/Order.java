package com.fanx.shardingspheredemo.entity;

import java.math.BigDecimal;

public class Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.order_id
     *
     * @mbg.generated Wed Dec 29 21:34:58 CST 2021
     */
    private Long orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.total_amount
     *
     * @mbg.generated Wed Dec 29 21:34:58 CST 2021
     */
    private BigDecimal totalAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.user_id
     *
     * @mbg.generated Wed Dec 29 21:34:58 CST 2021
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.order_id
     *
     * @return the value of t_order.order_id
     *
     * @mbg.generated Wed Dec 29 21:34:58 CST 2021
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.order_id
     *
     * @param orderId the value for t_order.order_id
     *
     * @mbg.generated Wed Dec 29 21:34:58 CST 2021
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.total_amount
     *
     * @return the value of t_order.total_amount
     *
     * @mbg.generated Wed Dec 29 21:34:58 CST 2021
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.total_amount
     *
     * @param totalAmount the value for t_order.total_amount
     *
     * @mbg.generated Wed Dec 29 21:34:58 CST 2021
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.user_id
     *
     * @return the value of t_order.user_id
     *
     * @mbg.generated Wed Dec 29 21:34:58 CST 2021
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.user_id
     *
     * @param userId the value for t_order.user_id
     *
     * @mbg.generated Wed Dec 29 21:34:58 CST 2021
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}