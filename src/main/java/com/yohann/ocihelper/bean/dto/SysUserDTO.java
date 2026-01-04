package com.yohann.ocihelper.bean.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * <p>
 * SysUser
 * </p >
 *
 * @author yohann
 * @since 2024/11/7 14:34
 */
@Data
@Builder
public class SysUserDTO {

    private String taskId;
    private OciCfg ociCfg;
    private String username;
    private float ocpus = 1F;
    private float memory = 6F;
    private Long disk;
    private String architecture = "ARM";
    private Long interval = 60L;
    private volatile int createNumbers = 0;
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
    private String operationSystem = "Ubuntu";
    private List<CloudInstance> instanceList;
    private boolean joinChannelBroadcast = true;

    @Data
    @Builder
    public static class OciCfg {
        private String tenantId;
        private String userId;
        private String fingerprint;
        private String privateKeyPath;
        private String region;
        private String compartmentId;
    }

    @Builder
    @Data
    public static class CloudInstance {
        private String region;
        private String name;
        private String ocId;
        private List<String> publicIp;
        private String shape;
//    private String volumeSize;
    }
}
