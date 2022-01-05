package org.minpoint.muxige.store.service.constants;

/*
 * @ClassName MallConstants
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2022/1/5 22:26
 */
public interface MallConstants {

    /**
     * 审核状态
     */
    interface AUDIT_STATUS {
        /**
         * 待审核
         */
        byte PENDING_APPROVAL = 0x00000001;

        /**
         * 审核通过
         */
        short APPROVED =        0x00000002;

        /**
         * 上架
         */
        short ON_SHELVES =      0x00000004;

        /**
         * 下架
         */
        short OFF_SHELVES =     0x00000006;
    }


}
