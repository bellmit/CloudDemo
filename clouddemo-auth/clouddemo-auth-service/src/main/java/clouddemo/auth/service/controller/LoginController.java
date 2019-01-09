package clouddemo.auth.service.controller;

import clouddemo.auth.api.pojo.ApiResponse;
import clouddemo.auth.api.pojo.Users;
import clouddemo.auth.api.service.UsersService;
import clouddemo.auth.api.util.JwtUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Title       : LoginController
 * Package     : clouddemo.auth.service.controller
 * Description :
 * Create on   : 2018/12/23 21:56
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
@RestController
@RequestMapping("/")
public class LoginController {
    @Resource
    private UsersService usersService;

//    private static final Logger _logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value="login", method = RequestMethod.POST)
    @ApiOperation("登陆")
    public ApiResponse login(
            @ApiParam(name = "username", value = "用户名", required = true)
            @RequestParam("username") String username,
            @ApiParam(name = "password", value = "密码", required = true)
            @RequestParam("password") String password
    ) {
        Users user = usersService.selectByUid(username);
//        //盐（用户名+随机数）
//        String salt = "yan";
//        //原密码
//        String encodedPassword = ShiroKit.md5(password, username + salt);
        if (user.getPassword().equals(password)) {
            return new ApiResponse(true, "Login success", JwtUtil.sign(username, password));
        } else {
            throw new UnauthorizedException();
        }
    }

//    @RequestMapping(path = "401")
//    @ResponseStatus(HttpStatus.UNAUTHORIZED)
//    public ApiResponse unauthorized() {
//        return new ApiResponse(false, "Unauthorized", null);
//    }
}
