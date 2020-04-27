package com.yy.bbs.service;


import com.yy.bbs.dao.DiscussPostMapper;
import com.yy.bbs.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostService {

    @Autowired
    private DiscussPostMapper discussPostMapper;

     //获取帖子列表并分页
    public List<DiscussPost> findDiscussPosts(int userId, int offset, int limit) {
        return discussPostMapper.selectDiscussPosts(userId, offset, limit);
    }

    //查询一共的帖子数
    public int findDiscussPostRows(int userId) {
        return discussPostMapper.selectDiscussPostRows(userId);
    }

}
