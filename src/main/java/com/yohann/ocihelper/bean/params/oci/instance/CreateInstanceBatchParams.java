package com.yohann.ocihelper.bean.params.oci.instance;

import jakarta.validation.Valid;
import lombok.Data;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.List;

/**
 * @projectName: oci-helper
 * @package: com.yohann.ocihelper.bean.params
 * @className: CreateInstanceBatchParams
 * @author: Yohann
 * @date: 2024/11/16 0:04
 */
@Data
public class CreateInstanceBatchParams {

    @NotEmpty(message = "用户配置id列表不能为空")
    private List<String> userIds;
    @Valid
    private InstanceInfo instanceInfo;

    @Data
    public static class InstanceInfo {
        @NotBlank(message = "CPU不能为空")
        private String ocpus;
        @NotBlank(message = "内存不能为空")
        private String memory;
        @NotNull(message = "磁盘空间不能为空")
        private Integer disk;
        @NotBlank(message = "系统架构不能为空")
        private String architecture;
        @NotNull(message = "时间间隔不能为空")
        private Integer interval;
        @NotNull(message = "创建数目不能为空")
        private Integer createNumbers;
        @NotBlank(message = "系统类型不能为空")
        private String operationSystem;
        /**
         * root密码 - 当提供有效的SSH公钥时可选
         * PASSWORD_ACCESS: 当只有SSH公钥时，此字段可为空，实例将仅支持SSH密钥认证
         * 注意: rootPassword和sshPublicKey至少需要提供一个，此验证在OciServiceImpl.createInstance()中进行
         */
        private String rootPassword;
        /**
         * SSH公钥 - 用于实例的SSH密钥认证
         * 当提供有效的SSH公钥时，root密码变为可选
         * 注意: rootPassword和sshPublicKey至少需要提供一个，此验证在OciServiceImpl.createInstance()中进行
         */
        private String sshPublicKey;
    }
}
