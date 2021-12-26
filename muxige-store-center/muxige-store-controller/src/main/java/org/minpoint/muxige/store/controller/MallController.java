package org.minpoint.muxige.store.controller;

import org.minpoint.muxige.core.controller.MuXiGeController;
import org.minpoint.muxige.core.pojo.Result;
import org.minpoint.muxige.store.core.pojo.query.MallQuery;
import org.minpoint.muxige.store.service.MallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.minpoint.muxige.core.controller.MuXiGeController.ADMIN_PATH;
import static org.minpoint.muxige.core.controller.MuXiGeController.CTRL_PRODUCT;

/*
 * @ClassName MallController
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/23 22:41
 */
@RestController
@RequestMapping(value = ADMIN_PATH + "mall", produces = CTRL_PRODUCT)
public class MallController extends MuXiGeController {

    final private MallService mallService;

    @Autowired
    public MallController(MallService mallService) {
        this.mallService = mallService;
    }

    @PostMapping("add")
    public Object add(MallQuery query){
        return Result.set(mallService.add(query));
    }

    /**
     * @Author BabyBlackSkin
     * @Description 查询门店信息
     * @Date 22:45 2021/12/23
     * @Param [query]
     * @return java.lang.Object
     **/
    @GetMapping("list/paging")
    public Object listPaging(MallQuery query){
        return Result.set(mallService.listInfo(query));
    }
}
