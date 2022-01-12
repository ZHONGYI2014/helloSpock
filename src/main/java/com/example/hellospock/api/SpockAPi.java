package com.example.hellospock.api;

import com.example.hellospock.entity.User;
import com.example.hellospock.service.QueryCashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administartor
 * @description: TODO
 * @date 2021/10/13 21:25
 */
@RestController
public class SpockAPi {

    @Autowired
    private QueryCashService queryCashService;

    @GetMapping("/spock")
    public String sayHi(String name) {
        return "Hi~ " + name;
    }

    @GetMapping("/queryCash")
    public User queryCash(Integer id) throws Exception {
        return queryCashService.queryCashDao(id);
    }
}
