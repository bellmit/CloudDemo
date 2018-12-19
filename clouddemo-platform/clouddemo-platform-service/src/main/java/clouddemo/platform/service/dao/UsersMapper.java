package clouddemo.platform.service.dao;

import clouddemo.platform.api.pojo.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}