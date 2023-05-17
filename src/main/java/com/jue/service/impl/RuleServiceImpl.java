package com.jue.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jue.dao.RuleDao;
import com.jue.domain.Model;
import com.jue.domain.Rule;
import com.jue.service.IRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Pride
 */
@Service
public class RuleServiceImpl extends ServiceImpl<RuleDao, Rule> implements IRuleService {
    @Autowired
    private RuleDao ruleDao;

    @Override
    public boolean save(Rule rule) {
        return ruleDao.insert(rule) > 0;
    }

    @Override
    public boolean modify(Rule rule) {
        return ruleDao.updateById(rule) >0;
    }

    @Override
    public boolean delete(Integer id) {
        return ruleDao.deleteById(id) >0 ;
    }

    @Override
    public Rule getById(Integer id) {
        return ruleDao.selectById(id);
    }

    @Override
    public List<Rule> getAll() {
        return ruleDao.selectList(null);
    }
}
