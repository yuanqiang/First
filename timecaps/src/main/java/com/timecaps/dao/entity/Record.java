package com.timecaps.dao.entity;

import java.util.Date;

public class Record {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.expiration_time
     *
     * @mbggenerated
     */
    private Date expirationTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.id
     *
     * @return the value of record.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.id
     *
     * @param id the value for record.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.expiration_time
     *
     * @return the value of record.expiration_time
     *
     * @mbggenerated
     */
    public Date getExpirationTime() {
        return expirationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.expiration_time
     *
     * @param expirationTime the value for record.expiration_time
     *
     * @mbggenerated
     */
    public void setExpirationTime(Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.create_time
     *
     * @return the value of record.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.create_time
     *
     * @param createTime the value for record.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}