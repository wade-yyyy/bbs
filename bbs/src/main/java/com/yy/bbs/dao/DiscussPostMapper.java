package com.yy.bbs.dao;


import com.yy.bbs.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    //获取帖子集合
    List<DiscussPost> selectDiscussPosts(@Param("userId")int userId,@Param("offset") int offset,@Param("limit") int limit);

    //获取一共的帖子数
    // @Param注解用于给参数取别名,
    // 如果只有一个参数,并且在<if>里使用,则必须加别名.
    int selectDiscussPostRows(@Param("userId") int userId);

}
