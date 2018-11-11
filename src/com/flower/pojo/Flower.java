package com.flower.pojo;

import java.io.Serializable;

/**
 * CREATE TABLE `flower` (
 *   `flw_id` varchar(36) NOT NULL,
 *   `flw_name` varchar(36) NOT NULL,
 *   `flw_price` double NOT NULL,
 *   `flw_type` varchar(36) NOT NULL COMMENT '花卉品种',
 *   `flw_num` int(11) NOT NULL DEFAULT '0' COMMENT '花卉数量',
 *   `flw_delete` int(2) NOT NULL DEFAULT '1' COMMENT '1正常2删除',
 *   PRIMARY KEY (`flw_id`)
 * ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 */
public class Flower implements Serializable {

    private String flwId;
    private String flwName;
    private Double flwPrice;
//    private String flwType;
    private Type type;
    private Integer flwNum;
    private Integer flwDelete;

    public String getFlwId() {
        return flwId;
    }

    public void setFlwId(String flwId) {
        this.flwId = flwId;
    }

    public String getFlwName() {
        return flwName;
    }

    public void setFlwName(String flwName) {
        this.flwName = flwName;
    }

    public Double getFlwPrice() {
        return flwPrice;
    }

    public void setFlwPrice(Double flwPrice) {
        this.flwPrice = flwPrice;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Integer getFlwNum() {
        return flwNum;
    }

    public void setFlwNum(Integer flwNum) {
        this.flwNum = flwNum;
    }

    public Integer getFlwDelete() {
        return flwDelete;
    }

    public void setFlwDelete(Integer flwDelete) {
        this.flwDelete = flwDelete;
    }
}
