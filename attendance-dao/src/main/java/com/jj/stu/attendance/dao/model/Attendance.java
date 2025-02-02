package com.jj.stu.attendance.dao.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 考勤表
 */
@Data
@TableName("s_attendance")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Attendance {
    private static final long serialVersionUID = 1L;
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 课程Id
     */
    private Integer courseId;

    /**
     * 学生Id
     */
    private Integer studentId;

    /**
     * 考勤状态
     */
    private String type;

    /**
     * 课程时间
     */
    private Date date;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建用户id
     */
    private Integer createUserId;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新用户id
     */
    private Integer updateUserId;
}