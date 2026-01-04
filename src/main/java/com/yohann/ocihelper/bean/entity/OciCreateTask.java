package com.yohann.ocihelper.bean.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName oci_create_task
 */
@TableName(value ="oci_create_task")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OciCreateTask implements Serializable {

    @TableId
    private String id;

    private String userId;

    private String ociRegion;

    private Float ocpus;

    private Float memory;

    private Integer disk;

    private String architecture;

    private Integer interval;

    private Integer createNumbers;

    /**
     * root密码 - 当提供有效的SSH公钥时可选
     * PASSWORD_ACCESS: 当只有SSH公钥时，此字段可为空，实例将仅支持SSH密钥认证
     */
    private String rootPassword;

    /**
     * SSH公钥 - 用于实例的SSH密钥认证
     * 当提供有效的SSH公钥时，root密码变为可选
     */
    private String sshPublicKey;

    private String operationSystem;

    private LocalDateTime createTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}