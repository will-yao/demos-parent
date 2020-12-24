package com.xuantuo.portal.excel;

import java.io.FileWriter;

/**
 * @Author:xuantuo
 * @Date: Created on 2020/11/19
 **/
public class GenSQL {

    static String  fileName1="sqla47.sql";
    static String  fileName2="sqla48.sql";

    /**
     *999999999900000L 1000
     *999999999800000L 2000
     * 999999999700000L 2000
     * 999999999600000L 2000
     * 999999999500000L 2000
     * 999999999400000L
     * 999999999300000L
     * 999999999200000L
     * 999999999000000L
     * 999999998900000L
     * 999999998800000L
     * 999999998700000L
     * 999999998500000L
     * 999999998400000L
     * 999999998300000L
     * 999999998200000L
     * 999999998000000L
     * 999999997600000L
     * 999999997500000L
     * 999999997400000L
     * 999999997300000L
     * 999999997100000L
     * 999999997000000L
     */
    private static long begin = 999999997000000L;

    private static String sql1 = "insert into `reverse_order`(`reverse_order_id`,`trade_order_id`,`buyer_id`,`buyer_nickname`,`reverse_type`,`refund_payment_method`,`fund_detail`,`merchant_id`,`store_id`,`store_name`,`merchant_name`,`payment_data`,`creator_nickname`,`creator_id`,`shipping_type`,`display_status`,`apply_comment`,`create_role`,`features`,`sync_version`,`tenant_id`,`gmt_create`,`gmt_modified`,`trade_order_deal_time`,`is_deleted`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values" +
            " ('%s','100019060126192','CRM000000000043136192','15010200896',1,null,'{\"actualPaidFee\":0,\"postFee\":0,\"disCountFee\":0}','15043','10000156221','陈飞店铺','陈飞商家',null,'测试企业负责人（勿删）','1',1,1,null,3,'',1,'fh01','2020-10-29 19:26:02','2020-10-29 19:26:03','2020-10-29 19:23:27',0,null,null,null,null,null);";

    private static String sql2 = "insert into `reverse_order_line`(`reverse_order_line_id`,`reverse_order_id`,`reverse_order_logistic_id`,`trade_order_id`,`trade_order_line_id`,`reverse_type`,`buyer_id`,`buyer_nickname`,`merchant_id`,`merchant_name`,`refund_amount`,`remaining_amount`,`paid_amount`,`reverse_status`,`goods_status`,`reason_id`,`reason_text`,`item_id`,`item_title`,`item_pic_url`,`item_unit_price`,`item_unit_noncash_price`,`sku_id`,`buy_quantity`,`refund_quantity`,`remaining_quantity`,`payment_method`,`refund_payment_method`,`price_type`,`noncash_refund_amount`,`noncash_remaining_amount`,`noncash_paid_amount`,`warehouse_qc`,`store_id`,`store_name`,`display_status`,`currency_code`,`features`,`sync_version`,`tenant_id`,`gmt_create`,`gmt_modified`,`biz_code`,`reverse_period_type`,`dispute_features`,`reverse_desc`,`timeout_type`,`timeout_trigger`,`reject_reason_id`,`fund_features`,`source`,`clawback_features`,`fund_detail`,`is_deleted`,`ext1`,`ext2`,`ext3`,`ext4`,`ext5`) values" +
            " ('%s','%s',null,'100019060126192','100019060136192',1,'CRM000000000043136192','15010200896','15043','陈飞商家',0,0,0,5,4,718,'其他原因','165986040238948352','阿黄1234','http://img-dev.feihe.com/fh01/item/itemImage/20201029/10256ffffa1172804301b928dfea9931.jpg',0,7,'165986040238948353',1,1,1,null,null,'INTEGRAL',7,7,7,null,'10000156221','陈飞店铺',1,'CNY','tradeLogisticDetail:{\"logisticFullAddr\"#3B\"北京市11市辖区11昌平区紫金园林圆明园\",\"logisticMethod\"#3B\"快递\",\"logisticContact\"#3B\"15010200896\",\"logisticRecv\"#3B\"高泽明\"};refundByQuantity:1;invoiceInfo:{};fastRefund:1;customParams:{};deliveryMethod:1;flowInst:1|theEnd|^~100;lastOrder:1;other_shared_discount_fee:0;costPrice:500;outerSkuIdType:{};orderTags:0;pointRate:0.04;osr:{\"splitInfos\"#3B[{\"split\"#3Bfalse,\"splitId\"#3B\"c16a5619956c61fef52eec908435eb4b_0\",\"splitReason\"#3B\"delivery\"}]};msgIds:e0a4eefa8919caec2b6069749be5f6ad,7c3bf4c568115266612d10c379aa6214;rpmr2:1;outerSkuId:R205101001;stopAgree:0;mainOrderAttrs:{\"traceId\"#3B\"ac11b3c316039706057484193d5e80\",\"useBbq\"#3B\"false\",\"bc\"#3B\"normal_trade\",\"oar\"#3B\"买家留言哎呦呦\",\"checkAndPay\"#3B\"1\",\"wechatOpenId\"#3B\"oc63ewtIzK1CC6OWS5jhsDbnz-9o\",\"os\"#3B\"H5\",\"flowInst\"#3B\"1|resume|^\",\"mcType\"#3B\"2\",\"oId\"#3B\"c16a5619956c61fef52eec908435eb4b\",\"supportInvoice\"#3B\"false\",\"ptod\"#3B\"2020-10-30 19#3B23#3B25\",\"orderTags\"#3B\"0\",\"payMethod\"#3B\"ONLINE_PAYMENT\",\"payChannel\"#3B\"JDPAY_WEPAY\",\"ptos\"#3B\"86400\",\"flowId\"#3B\"100\",\"aopt\"#3B\"INTEGRAL\"};shared_discount_fee:0;currencyRate:1;whid:[];sku:口味#3B原味#3A上市年份#3B2018年#3A规格#3B100ml#3A;lastRefund:1',1,'fh01','2020-10-29 19:26:02','2020-10-29 19:26:03','com.feihe.youxuan',1,null,null,'RP_SELLER_AGREE_REFUND_TIMEOUT','2020-11-01 19:26:02',null,null,'TP',null,'{\"assetsType\":\"INTEGRAL\",\"goodsAmount\":0,\"maxAmount\":0,\"minAmount\":0,\"nonCashGoodsAmount\":7,\"nonCashMaxAmount\":7,\"nonCashMinAmount\":0,\"nonCashRefundAmount\":7,\"nonCashRemainAmount\":7,\"postAmount\":0,\"refundAmount\":0,\"remainAmount\":0,\"reverseOrderId\":2663379261,\"reverseOrderLineId\":2663389261,\"tradeOrderId\":\"100019060126192\",\"tradeOrderLineId\":\"100019060136192\"}',0,null,null,null,null,null);";


    public static void main(String[] args) {

        try (FileWriter writer1 = new FileWriter(fileName1);
             FileWriter writer2 = new FileWriter(fileName2)
        ) {
            for (int i = 0; i < 2000; i++) {
                begin++;
                writer1.write(String.format(sql1, begin));
                writer1.write("\n");

                writer2.write(String.format(sql2, begin, begin));
                writer2.write("\n");
            }

        } catch (Exception e) {

        }

    }
}
