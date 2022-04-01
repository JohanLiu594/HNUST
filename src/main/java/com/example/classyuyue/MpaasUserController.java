package com.example.classyuyue;

import com.definesys.mpaas.log.SWordLogger;
import com.definesys.mpaas.query.MpaasQueryFactory;
import com.definesys.mpaas.query.db.PageQueryResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MpaasUserController {
    @Autowired
    private MpaasQueryFactory sw;

    @Autowired
    private SWordLogger logger;

    //查询全表
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public List<MpaasUser> queryUser() {
        List<MpaasUser> users = sw.buildQuery().doQuery(MpaasUser.class);
        return users;
    }

    //分页查询
    @RequestMapping(value = "/pageQuery", method = RequestMethod.GET)
    public List<MpaasUser> pageQueryUser(@RequestParam(value = "page") Integer page,
                                         @RequestParam(value = "pageSize") Integer pageSize) {
        PageQueryResult<MpaasUser> result = sw.buildQuery()
                .doPageQuery(page, pageSize, MpaasUser.class);
        logger.debug("total count ==> %d",result.getCount());
        return result.getResult();
    }
}