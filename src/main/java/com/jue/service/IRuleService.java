package com.jue.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jue.domain.Model;
import com.jue.domain.Rule;

import java.util.List;

public interface IRuleService extends IService<Rule>  {
    /**
     * 添加一条记录
     * @param rule
     * @return
     */
    @Override
    boolean save(Rule rule);

    /**
     * 根据model修改记录
     * @param rule
     * @return
     */
    boolean modify(Rule rule);

    /**
     * 根据id删除记录
     * @param id
     * @return
     */
    boolean delete(Integer id);

    /**
     * 根据id查询记录
     * @param id
     * @return
     */
    Rule getById(Integer id);

    /**
     * 查询所有记录
     * @return
     */
    List<Rule> getAll();
}
