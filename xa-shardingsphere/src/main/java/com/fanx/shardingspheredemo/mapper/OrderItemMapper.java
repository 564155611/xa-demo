package com.fanx.shardingspheredemo.mapper;

import com.fanx.shardingspheredemo.entity.OrderItem;
import com.fanx.shardingspheredemo.entity.OrderItemExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface OrderItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Wed Dec 29 21:34:58 CST 2021
     */
    long countByExample(OrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Wed Dec 29 21:34:58 CST 2021
     */
    int deleteByExample(OrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Wed Dec 29 21:34:58 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Wed Dec 29 21:34:58 CST 2021
     */
    int insert(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Wed Dec 29 21:34:58 CST 2021
     */
    int insertSelective(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Wed Dec 29 21:34:58 CST 2021
     */
    List<OrderItem> selectByExample(OrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Wed Dec 29 21:34:58 CST 2021
     */
    OrderItem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Wed Dec 29 21:34:58 CST 2021
     */
    int updateByExampleSelective(@Param("record") OrderItem record, @Param("example") OrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Wed Dec 29 21:34:58 CST 2021
     */
    int updateByExample(@Param("record") OrderItem record, @Param("example") OrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Wed Dec 29 21:34:58 CST 2021
     */
    int updateByPrimaryKeySelective(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Wed Dec 29 21:34:58 CST 2021
     */
    int updateByPrimaryKey(OrderItem record);

    @Select("select o.user_id,o.order_id,i.id from t_order o left join t_order_item i on o.order_id=i.order_id where o.order_id=#{id}")
    List<Map<String,Object>> selectOrderJoinItemsByOrderId(Long orderId);
}