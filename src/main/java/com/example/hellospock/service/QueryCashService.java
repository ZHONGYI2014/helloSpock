package com.example.hellospock.service;

import com.example.hellospock.dao.QueryCashDao;
import com.example.hellospock.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Administartor
 * @description: TODO
 * @date 2021/10/13 21:49
 */
@Component
public class QueryCashService {

    @Autowired
    private QueryCashDao queryCashDao;

    public User queryCashDao(Integer id) throws Exception {
        try {
            return queryCashDao.selectById(id);
        } catch (Exception e) {
            throw new Exception();
        }
    }
}
