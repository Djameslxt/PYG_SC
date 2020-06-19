package com.pinyougou.mapper;

import com.pinyougou.pojo.TbBrand;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Date:2020/6/15
 * Author:  james L
 * Desc:
 */
public interface BrandMapper extends Mapper<TbBrand>{
    public List<TbBrand> findAll() ;

}
