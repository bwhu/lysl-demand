package com.whu.lysl.service.institution;

import com.whu.lysl.entity.condition.InstCondition;
import com.whu.lysl.entity.dto.Institution;

import java.util.List;

/**
 * 机构服务
 * @author Visionary
 * @since 2020/2/8 9:42 PM
 */
public interface InstitutionService {

    /**
     * 查询符合条件的机构
     * @param instCondition 查询条件
     * @return 机构 list
     */
    List<Institution> getInstsByCondition(InstCondition instCondition);

}
