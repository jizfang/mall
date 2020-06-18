package com.iguangjie.mall.pojo;

import lombok.Data;

/**
 * @description: 商品分类
 * @author: fang
 * @create: 2020-06-18 21:36
 **/
@Data
public class Category {
    /**
     * 分类id
     */
    private Integer id;
    /**
     * 分类父id，id=0为根节点
     */
    private Integer parentId;
    /**
     * 分类名称
     */
    private String name;
    /**
     * 分类状态（1-正常，2-废弃）
     */
    private Integer status;
    /**
     * 排序编号
     */
    private Integer sortOrder;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 更新时间
     */
    private Long updateTime;
}
