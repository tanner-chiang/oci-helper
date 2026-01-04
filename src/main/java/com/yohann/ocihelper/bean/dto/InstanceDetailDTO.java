package com.yohann.ocihelper.bean.dto;

import com.oracle.bmc.core.model.Instance;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * InstanceDetailDTO
 * </p >
 *
 * @author yuhui.fan
 * @since 2024/11/7 14:40
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InstanceDetailDTO {

    private String taskId;
    private boolean isNoShape = false;
    private boolean isSuccess = false;
    private boolean isOut = false;
    private boolean isNoPubVcn = false;
    private boolean isTooManyReq = false;
    private boolean isDie = false;
    private String publicIp;
    private String image;
    private String shape;
    private String architecture;
    private String username;
    private String region;
    private Float ocpus = 1F;
    private Float memory = 6F;
    private Long disk = 50L;
    /**
     * root密码 - 当只有SSH公钥时可能为空
     * PASSWORD_ACCESS: 当使用SSH公钥认证时，此字段可能为null
     */
    private String rootPassword;
    /**
     * SSH公钥 - 用于实例的SSH密钥认证
     */
    private String sshPublicKey;
    private long createNumbers = 0;
    Instance instance;

}
