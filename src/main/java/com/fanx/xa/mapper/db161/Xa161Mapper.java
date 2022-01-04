package com.fanx.xa.mapper.db161;

import com.fanx.xa.entity.Xa161;
import com.fanx.xa.entity.Xa161Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Xa161Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_161
     *
     * @mbg.generated Tue Jan 04 16:30:43 CST 2022
     */
    long countByExample(Xa161Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_161
     *
     * @mbg.generated Tue Jan 04 16:30:43 CST 2022
     */
    int deleteByExample(Xa161Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_161
     *
     * @mbg.generated Tue Jan 04 16:30:43 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_161
     *
     * @mbg.generated Tue Jan 04 16:30:43 CST 2022
     */
    int insert(Xa161 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_161
     *
     * @mbg.generated Tue Jan 04 16:30:43 CST 2022
     */
    int insertSelective(Xa161 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_161
     *
     * @mbg.generated Tue Jan 04 16:30:43 CST 2022
     */
    List<Xa161> selectByExample(Xa161Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_161
     *
     * @mbg.generated Tue Jan 04 16:30:43 CST 2022
     */
    Xa161 selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_161
     *
     * @mbg.generated Tue Jan 04 16:30:43 CST 2022
     */
    int updateByExampleSelective(@Param("record") Xa161 record, @Param("example") Xa161Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_161
     *
     * @mbg.generated Tue Jan 04 16:30:43 CST 2022
     */
    int updateByExample(@Param("record") Xa161 record, @Param("example") Xa161Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_161
     *
     * @mbg.generated Tue Jan 04 16:30:43 CST 2022
     */
    int updateByPrimaryKeySelective(Xa161 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_161
     *
     * @mbg.generated Tue Jan 04 16:30:43 CST 2022
     */
    int updateByPrimaryKey(Xa161 record);
}