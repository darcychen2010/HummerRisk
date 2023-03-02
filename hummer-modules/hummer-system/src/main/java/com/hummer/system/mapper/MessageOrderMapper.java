package com.hummer.system.mapper;

import com.hummer.common.core.domain.MessageOrder;
import com.hummer.common.core.domain.MessageOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessageOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order
     *
     * @mbg.generated Sun Jul 10 14:04:32 CST 2022
     */
    long countByExample(MessageOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order
     *
     * @mbg.generated Sun Jul 10 14:04:32 CST 2022
     */
    int deleteByExample(MessageOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order
     *
     * @mbg.generated Sun Jul 10 14:04:32 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order
     *
     * @mbg.generated Sun Jul 10 14:04:32 CST 2022
     */
    int insert(MessageOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order
     *
     * @mbg.generated Sun Jul 10 14:04:32 CST 2022
     */
    int insertSelective(MessageOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order
     *
     * @mbg.generated Sun Jul 10 14:04:32 CST 2022
     */
    List<MessageOrder> selectByExample(MessageOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order
     *
     * @mbg.generated Sun Jul 10 14:04:32 CST 2022
     */
    MessageOrder selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order
     *
     * @mbg.generated Sun Jul 10 14:04:32 CST 2022
     */
    int updateByExampleSelective(@Param("record") MessageOrder record, @Param("example") MessageOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order
     *
     * @mbg.generated Sun Jul 10 14:04:32 CST 2022
     */
    int updateByExample(@Param("record") MessageOrder record, @Param("example") MessageOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order
     *
     * @mbg.generated Sun Jul 10 14:04:32 CST 2022
     */
    int updateByPrimaryKeySelective(MessageOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order
     *
     * @mbg.generated Sun Jul 10 14:04:32 CST 2022
     */
    int updateByPrimaryKey(MessageOrder record);
}
