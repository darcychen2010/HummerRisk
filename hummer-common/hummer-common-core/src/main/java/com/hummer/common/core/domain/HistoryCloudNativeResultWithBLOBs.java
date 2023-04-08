package com.hummer.common.core.domain;

import java.io.Serializable;

public class HistoryCloudNativeResultWithBLOBs extends HistoryCloudNativeResult implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_cloud_native_result.vulnerability_report
     *
     * @mbg.generated Sat Apr 08 08:55:55 CST 2023
     */
    private String vulnerabilityReport;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_cloud_native_result.config_audit_report
     *
     * @mbg.generated Sat Apr 08 08:55:55 CST 2023
     */
    private String configAuditReport;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_cloud_native_result.kube_bench
     *
     * @mbg.generated Sat Apr 08 08:55:55 CST 2023
     */
    private String kubeBench;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Sat Apr 08 08:55:55 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_cloud_native_result.vulnerability_report
     *
     * @return the value of history_cloud_native_result.vulnerability_report
     *
     * @mbg.generated Sat Apr 08 08:55:55 CST 2023
     */
    public String getVulnerabilityReport() {
        return vulnerabilityReport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_cloud_native_result.vulnerability_report
     *
     * @param vulnerabilityReport the value for history_cloud_native_result.vulnerability_report
     *
     * @mbg.generated Sat Apr 08 08:55:55 CST 2023
     */
    public void setVulnerabilityReport(String vulnerabilityReport) {
        this.vulnerabilityReport = vulnerabilityReport == null ? null : vulnerabilityReport.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_cloud_native_result.config_audit_report
     *
     * @return the value of history_cloud_native_result.config_audit_report
     *
     * @mbg.generated Sat Apr 08 08:55:55 CST 2023
     */
    public String getConfigAuditReport() {
        return configAuditReport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_cloud_native_result.config_audit_report
     *
     * @param configAuditReport the value for history_cloud_native_result.config_audit_report
     *
     * @mbg.generated Sat Apr 08 08:55:55 CST 2023
     */
    public void setConfigAuditReport(String configAuditReport) {
        this.configAuditReport = configAuditReport == null ? null : configAuditReport.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_cloud_native_result.kube_bench
     *
     * @return the value of history_cloud_native_result.kube_bench
     *
     * @mbg.generated Sat Apr 08 08:55:55 CST 2023
     */
    public String getKubeBench() {
        return kubeBench;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_cloud_native_result.kube_bench
     *
     * @param kubeBench the value for history_cloud_native_result.kube_bench
     *
     * @mbg.generated Sat Apr 08 08:55:55 CST 2023
     */
    public void setKubeBench(String kubeBench) {
        this.kubeBench = kubeBench == null ? null : kubeBench.trim();
    }
}
