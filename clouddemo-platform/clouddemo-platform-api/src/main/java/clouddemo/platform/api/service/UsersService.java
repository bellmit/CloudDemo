package clouddemo.platform.api.service;

import clouddemo.platform.api.pojo.Users;

public interface UsersService {
    Users selectByPrimaryKey(Integer id);
}
