package org.minpoint.muxige.store.controller;

import org.minpoint.muxige.core.controller.MuXiGeController;
import org.minpoint.muxige.store.service.MallService;
import org.minpoint.muxige.store.core.pojo.query.MallQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.minpoint.muxige.core.controller.MuXiGeController.CTRL_PRODUCT;

/*
 * @ClassName MallController
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/23 22:41
 */
@RestController
@RequestMapping(value = MuXiGeController.ADMIN_PATH + "mall", produces = CTRL_PRODUCT)
public class MallController extends MuXiGeController {

    final private MallService mallService;

    @Autowired
    public MallController(MallService mallService) {
        this.mallService = mallService;
    }

    @PostMapping("add")
    public Object add(@RequestBody MallQuery query){
        return mallService.add(query);
    }

    @PostMapping("del")
    public Object del(@RequestBody List<String> idList){
        return mallService.del(idList);
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
        return mallService.listInfo(query);
    }
}
