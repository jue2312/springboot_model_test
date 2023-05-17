package com.jue.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jue.domain.Model;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author Pride
 */
@Mapper
public interface ModelDao extends BaseMapper<Model> {

}
