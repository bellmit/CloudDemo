package clouddemo.platform.service.controller;

import clouddemo.platform.api.pojo.Users;
import clouddemo.platform.api.service.UsersService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Title       : UsersController
 * Package     : clouddemo.platform.service.controller
 * Description :
 * Create on   : 2018/12/19 14:12
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
@RequestMapping("/users/")
public class UsersController {
    @Resource
    private UsersService usersService;

    @RequestMapping(value = "selectById", method = RequestMethod.GET)
    @ApiOperation("通过id查询用户")
    public Users selectByPrimaryKey(
            @ApiParam(name = "id", value = "系统主键", required = true)
            @RequestParam(name = "id") Integer id
    ) {
        return usersService.selectByPrimaryKey(id);
    }
}
