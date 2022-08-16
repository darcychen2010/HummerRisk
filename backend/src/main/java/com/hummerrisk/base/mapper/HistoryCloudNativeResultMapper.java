package com.hummerrisk.base.mapper;

import com.hummerrisk.base.domain.HistoryCloudNativeResult;
import com.hummerrisk.base.domain.HistoryCloudNativeResultExample;
import com.hummerrisk.base.domain.HistoryCloudNativeResultWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HistoryCloudNativeResultMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Wed Aug 17 03:08:41 CST 2022
     */
    long countByExample(HistoryCloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Wed Aug 17 03:08:41 CST 2022
     */
    int deleteByExample(HistoryCloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Wed Aug 17 03:08:41 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Wed Aug 17 03:08:41 CST 2022
     */
    int insert(HistoryCloudNativeResultWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Wed Aug 17 03:08:41 CST 2022
     */
    int insertSelective(HistoryCloudNativeResultWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Wed Aug 17 03:08:41 CST 2022
     */
    List<HistoryCloudNativeResultWithBLOBs> selectByExampleWithBLOBs(HistoryCloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Wed Aug 17 03:08:41 CST 2022
     */
    List<HistoryCloudNativeResult> selectByExample(HistoryCloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Wed Aug 17 03:08:41 CST 2022
     */
    HistoryCloudNativeResultWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Wed Aug 17 03:08:41 CST 2022
     */
    int updateByExampleSelective(@Param("record") HistoryCloudNativeResultWithBLOBs record, @Param("example") HistoryCloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Wed Aug 17 03:08:41 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") HistoryCloudNativeResultWithBLOBs record, @Param("example") HistoryCloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Wed Aug 17 03:08:41 CST 2022
     */
    int updateByExample(@Param("record") HistoryCloudNativeResult record, @Param("example") HistoryCloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Wed Aug 17 03:08:41 CST 2022
     */
    int updateByPrimaryKeySelective(HistoryCloudNativeResultWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Wed Aug 17 03:08:41 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(HistoryCloudNativeResultWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Wed Aug 17 03:08:41 CST 2022
     */
    int updateByPrimaryKey(HistoryCloudNativeResult record);
}