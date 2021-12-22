package org.minpoint.muxige.system.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.minpoint.muxige.core.exception.MuXiGeException;
import org.minpoint.muxige.core.exception.SystemStatusEnum;
import org.minpoint.muxige.core.page.ListData;
import org.minpoint.muxige.core.util.JsonUtils;
import org.minpoint.muxige.system.core.pojo.bo.MenuBo;
import org.minpoint.muxige.system.core.pojo.entity.MenuEntity;
import org.minpoint.muxige.system.core.pojo.query.MenuQuery;
import org.minpoint.muxige.system.manager.MenuManager;
import org.minpoint.muxige.system.service.MenuService;
import org.minpoint.muxige.system.service.constants.MenuConstants;
import org.minpoint.muxige.system.service.util.MenuUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * @ClassName MenuServiceImpl
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/8 17:56
 */
@Service
public class MenuServiceImpl implements MenuService{

    @Autowired
    private MenuManager menuManager;

    /**
     * @Author BabyBlackSkin
     * @Description  新增菜单
     * @Date 23:22 2021/12/8
     * @Param [menuBo]
     * @return int
     **/
    @Override
    public int addMenu(MenuBo menuBo) {
        MenuEntity menuEntity = BeanUtil.copyProperties(menuBo, MenuEntity.class);
        if(null == menuEntity){
            throw new MuXiGeException(SystemStatusEnum.NULL_ERROR);
        }
        return menuManager.insert(menuEntity);
    }

    @Override
    public int delMenu(String id) {
        return menuManager.deleteById(id);
    }

    /**
     * @Author BabyBlackSkin
     * @Description  查询菜单配置，并以树形结构返回
     * @Date 21:49 2021/12/8
     * @Param [query] 查询模板
     * @return java.util.List<org.minpoint.muxige.system.core.pojo.bo.MenuBo>
     **/
    @Override
    public List<MenuBo> listMenuVoTree(MenuQuery query) {
        QueryWrapper<MenuEntity> queryWrapper = new QueryWrapper<>();
        List<MenuEntity> menuEntity = menuManager.listPaging(queryWrapper);
        List<MenuBo> menuBoList = JsonUtils.listToList(menuEntity, MenuBo.class);
        return MenuUtils.getMenuTree(menuBoList, MenuConstants.MenuLevel.ONE);
    }

    @Override
    public ListData<MenuBo> listMenu(MenuQuery query) {
        return ListData.setContent(menuManager.listPaging(query));
    }
}
