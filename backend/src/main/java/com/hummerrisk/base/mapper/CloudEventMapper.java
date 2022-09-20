package com.hummerrisk.base.mapper;

import com.hummerrisk.base.domain.CloudEvent;
import com.hummerrisk.base.domain.CloudEventExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CloudEventMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_event
     *
     * @mbg.generated Tue Sep 20 12:30:41 CST 2022
     */
    long countByExample(CloudEventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_event
     *
     * @mbg.generated Tue Sep 20 12:30:41 CST 2022
     */
    int deleteByExample(CloudEventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_event
     *
     * @mbg.generated Tue Sep 20 12:30:41 CST 2022
     */
    int insert(CloudEvent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_event
     *
     * @mbg.generated Tue Sep 20 12:30:41 CST 2022
     */
    int insertSelective(CloudEvent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_event
     *
     * @mbg.generated Tue Sep 20 12:30:41 CST 2022
     */
    List<CloudEvent> selectByExampleWithBLOBs(CloudEventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_event
     *
     * @mbg.generated Tue Sep 20 12:30:41 CST 2022
     */
    List<CloudEvent> selectByExample(CloudEventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_event
     *
     * @mbg.generated Tue Sep 20 12:30:41 CST 2022
     */
    int updateByExampleSelective(@Param("record") CloudEvent record, @Param("example") CloudEventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_event
     *
     * @mbg.generated Tue Sep 20 12:30:41 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") CloudEvent record, @Param("example") CloudEventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_event
     *
     * @mbg.generated Tue Sep 20 12:30:41 CST 2022
     */
    int updateByExample(@Param("record") CloudEvent record, @Param("example") CloudEventExample example);
}