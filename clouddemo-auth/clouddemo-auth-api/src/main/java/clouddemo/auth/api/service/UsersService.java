package clouddemo.auth.api.service;

import clouddemo.auth.api.pojo.Users;

public interface UsersService {
    Users selectByPrimaryKey(Integer id);

    Users selectByUid(String uid);
}
