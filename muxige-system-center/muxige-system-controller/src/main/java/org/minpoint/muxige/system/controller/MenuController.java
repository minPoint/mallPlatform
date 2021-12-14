package org.minpoint.muxige.system.controller;

import cn.hutool.core.bean.BeanUtil;
import org.minpoint.muxige.core.controller.MuXiGeController;
import org.minpoint.muxige.core.util.JsonUtils;
import org.minpoint.muxige.system.core.pojo.bo.MenuBo;
import org.minpoint.muxige.system.core.pojo.query.MenuQuery;
import org.minpoint.muxige.system.core.pojo.vo.MenuVo;
import org.minpoint.muxige.system.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.minpoint.muxige.core.controller.MuXiGeController.ADMIN_PATH;
import static org.minpoint.muxige.core.controller.MuXiGeController.CTRL_PRODUCT;

/*
 * @ClassName MenuController
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/8 17:58
 */
@RestController
@RequestMapping(value = ADMIN_PATH + "menu", produces = CTRL_PRODUCT)
public class MenuController extends MuXiGeController {

    @Autowired
    private MenuService menuService;

    @PostMapping("add")
    public Object addMenu(@RequestBody MenuVo vo){
        MenuBo menuBo = BeanUtil.copyProperties(vo, MenuBo.class);
        return menuService.addMenu(menuBo);
    }

    @GetMapping("list")
    public Object listMenu(MenuQuery query){
        return menuService.listMenuVoTree(query);
    }

}
