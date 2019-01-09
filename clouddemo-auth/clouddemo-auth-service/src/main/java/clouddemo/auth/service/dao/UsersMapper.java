package clouddemo.auth.service.dao;

import clouddemo.auth.api.pojo.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer id);

    Users selectByUid(String uid);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}