package clouddemo.auth.api.pojo;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * Title       : JwtToken
 * Package     : clouddemo.platform.api.pojo
 * Description :
 * Create on   : 2018/12/23 15:34
 *
 * @author Yinglong.Hu
 * @version v1.0.0
 * <p>
 * 修改历史:
 * 修改人  :
 * 修改日期:
 * 修改描述:
 * -------------------------------------------
 */
public class JwtToken implements AuthenticationToken {
    private String token;

    public JwtToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
