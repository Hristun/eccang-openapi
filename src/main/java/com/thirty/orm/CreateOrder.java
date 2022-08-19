package com.thirty.orm;

import java.util.List;

public class CreateOrder {

      private String reference_no;//Require订单参考号(建议使用平台单号)
      private String aliexpress_order_no;//Option平台订单号(例如速卖通平台订单号)
      private String lp_order_number;//OptionLP订单号
      private String platform;//Option平台， ALIEXPRESS, AMAZON, B2C, EBAY, OTHER 默认OTHER
      private String allocated_auto;//Option自动分仓:0无,1自动分仓
      private String shipping_method;//Require配送方式，参考getShippingMethod
      private String warehouse_code;//Require配送仓库，参考getWarehouse
      private String country_code;//Require收件人国家，参考getCountry
      private String province;//Option省/州/府
      private String city;//Option城市/区
      private String district;//Option收件人区
      private String address1;//Require地址1 (length:30)
      private String address2;//Option地址2 (length:30)
      private String address3;//Option地址3 (length:30)
      private String zipcode;//Require邮编；收件人国家为菲律宾，邮编非必填
      private String license;//Option收件人证件号
      private String doorplate;//Option门牌号
      private String company;//Option公司名
      private String name;//Require收件人姓名
      private String phone;//Require收件人联系方式
      private String cell_phone;//Option收件人联系方式2
      private String email;//Option收件人邮箱
      private String platform_shop;//Option平台店铺
      private Integer is_order_cod;//OptionCOD订单：0:否 1:是
      private float order_cod_price;//OptionCOD Value
      private String order_cod_currency;//Option币种
      private Integer order_age_limit;//Option年龄: 0:无 1:16岁-18岁 2:18岁以上
      private Integer is_signature;//Option签名服务: 0:否 1:是
      private Integer is_insurance;//Option保险服务: 0:否 1:是
      private Integer insurance_value;//Option投保金额，默认：美元
      private String channel_code;//Option渠道编码
      private String packageCenterCode;//Option集包地中心代码
      private String packageCenterName;//Option集包地中心名称
      private String QrCode;//Option二维码
      private String shortAddress;//Option三段码
      private String order_desc;//Option订单说明
      private String remark;//Option操作员留言-同步WMS订单备注中
      private String order_business_type;//Option保税:订单模式(bbc/b2c)
      private String receiver_id_type_code;//Option保税:收货人证件类型
      private String receiver_id_number;//Option保税:收货人身份证
      private String pay_no;//Option保税:支付人(订购人)编码
      private String payer_name;//Option保税:支付人(订购人)姓名,也即订购人
      private String id_type_code;//Option保税:支付人证件类型(1身份证)
      private String id_number;//Option保税:证件号码
      private String payer_phone;//Option保税:支付人电话
      private String tax;//Option保税:税费，没有填0
      private String other_payment;//Option保税:抵扣费用，没有填0
      private String pro_amount;//Option保税:优惠金额，没有填0
      private String transport_fee;//Option保税:运费，没有填0
      private String valuation_fee;//Option保税:保价费，没有填0
      private String trans_type_id;//Option保税:运输方式编号
      private String trans_tool_id;//Option保税:运输工具编号
      private String voyages;//Option保税:航班航次号
      private String pack_type_id;//Option保税:包装种类编号
      private String trans_sum_no;//Option保税:货运总单号
      private String lading_bill_no;//Option保税:提单号
      private Integer verify;//Option是否审核,0新建不审核(草稿状态)，1新建并审核， 默认为0， 审核通过之后，不可编辑
      private Integer forceVerify;//Option是否强制审核(如欠费，缺货时是否审核到仓配系统), 0不强制，1强制， 默认为0 当verify==1时生效
      private List<CreateOrderItems> items;//Require订单明细
      private List<CreateOrderReport> report;//Option海关申报信息(开启仅走物流的时候需要传该字段)
      private String tracking_no;//Option跟踪号
      private Object label;//Option标签信息
      private Integer is_pack_box;//Option装箱服务: 0:否 1:是
      private String seller_id;//Option卖家id(非必填-分销EDIS物流使用)
      private String buyer_id;//Option买家id(非必填-分销EDIS物流使用)
      private Integer only_logistics;//Option是否开启仅走物流模式(非必填-前海云途客户定制)
      private Integer is_release_cargo;//OptionDEDHL额外服务【强制放货】,0否,1是,默认为0
      private Integer is_vip;//Option是否为VIP订单 1是 0不是 默认为0
      private String order_kind;//Option订单类型 BC,CC 默认为BC
      private String order_payer_name;//Option订购人
      private String order_id_number;//Option订购人证件号码
      private String order_payer_phone;//Option订购人电话
      private String order_country_code_originOption;//原产国
      private String order_sale_amount;//Option订单销售金额（不填默认为0）
      private String order_sale_currency;//Option订单销售金额币种
      private String is_platform_ebay;//Option是否ebay平台，1是，0否，默认为0
      private String ebay_item_id;//Optionebay物品编码ebay平台交易id(eBay Item ID)，is_platform_ebay为1时必填
      private String ebay_transaction_id;//Optionebay交易编号(eBay Transaction ID)ebay平台交易号(eBay Transaction ID)，is_platform_ebay为1时必填
      private String tax_payment_method;//Option税金付款方式，可以为空，不为空的时候为其中一项（"CFR_OR_CPT", "CIF_OR_CIP", "DDP", "DDU", "DAP", "DAT", "EXW", "FOB_OR_FCA"）
      private String customs_company_name;//Option清关公司名称
      private String customs_address;//Option清关地址
      private String customs_contact_name;//Option清关联系人
      private String customs_email;//Option清关邮箱
      private String customs_tax_code;//Option清关税号
      private String customs_phone;//Option清关电话
      private String customs_city;//Option清关城市
      private String customs_state;//Option清关省/州
      private String customs_country_code;//Option清关国家编码
      private String customs_postcode;//Option清关邮编
      private String customs_doorplate;//Option清关门牌号
      private String consignee_tax_number;//Option收件人税号
      private String order_battery_type;//Option电池型号
      private String vat_tax_code;//OptionVAT税号
      private String distribution_informationOption;//配货信息
      private Integer consignee_tax_type;//Option收件人税号类型0无 1个人 2公司 3护照 4其他
      private String consignee_eori;//Option收件人EORI号
      private String api_source;//Optionerp回调平台
      private String assign_date;//Option配送指定日期；例如2021-01-01
      private String assign_time;//Option配送指定时间；"00"：无指定； "01"：午前中 ；"12"：12時~14時 ；"14"：14時~16時 ；"16"：16時~18時 ；"18"：18時~20時 ；"19"：19時~21時 ；"04"：18時~21時
      private String lp_code;//Option菜鸟lp单号（非必填，不填默认为空）
      private Integer is_merge;//Option是否是合单订单，0不是，1是，默认为0
      private String IOSS;//Option欧盟一站式进口编码(IOSS)
      private Integer merge_order_count;//Option合单订单数量，不填默认为0 注意：非合单订单时（is_merge为0），合单订单数量无效为0
      private Integer insurance_type;//Option保险类型 1:通达保&一件代发(保签收) ，3:通达保&一件代发(保签收后7天)，4:通达保&一件代发(保签收后14天),5:通达保&一件代发(保签收后21天) 不填默认为0
      private String insurance_type_goods_valueOption;//保留2位小数
      private Integer is_ju_order;//Option是否为聚水潭下发的订单，1表示是，0表示否。默认值0

      public String getReference_no() {
            return reference_no;
      }

      public void setReference_no(String reference_no) {
            this.reference_no = reference_no;
      }

      public String getAliexpress_order_no() {
            return aliexpress_order_no;
      }

      public void setAliexpress_order_no(String aliexpress_order_no) {
            this.aliexpress_order_no = aliexpress_order_no;
      }

      public String getLp_order_number() {
            return lp_order_number;
      }

      public void setLp_order_number(String lp_order_number) {
            this.lp_order_number = lp_order_number;
      }

      public String getPlatform() {
            return platform;
      }

      public void setPlatform(String platform) {
            this.platform = platform;
      }

      public String getAllocated_auto() {
            return allocated_auto;
      }

      public void setAllocated_auto(String allocated_auto) {
            this.allocated_auto = allocated_auto;
      }

      public String getShipping_method() {
            return shipping_method;
      }

      public void setShipping_method(String shipping_method) {
            this.shipping_method = shipping_method;
      }

      public String getWarehouse_code() {
            return warehouse_code;
      }

      public void setWarehouse_code(String warehouse_code) {
            this.warehouse_code = warehouse_code;
      }

      public String getCountry_code() {
            return country_code;
      }

      public void setCountry_code(String country_code) {
            this.country_code = country_code;
      }

      public String getProvince() {
            return province;
      }

      public void setProvince(String province) {
            this.province = province;
      }

      public String getCity() {
            return city;
      }

      public void setCity(String city) {
            this.city = city;
      }

      public String getDistrict() {
            return district;
      }

      public void setDistrict(String district) {
            this.district = district;
      }

      public String getAddress1() {
            return address1;
      }

      public void setAddress1(String address1) {
            this.address1 = address1;
      }

      public String getAddress2() {
            return address2;
      }

      public void setAddress2(String address2) {
            this.address2 = address2;
      }

      public String getAddress3() {
            return address3;
      }

      public void setAddress3(String address3) {
            this.address3 = address3;
      }

      public String getZipcode() {
            return zipcode;
      }

      public void setZipcode(String zipcode) {
            this.zipcode = zipcode;
      }

      public String getLicense() {
            return license;
      }

      public void setLicense(String license) {
            this.license = license;
      }

      public String getDoorplate() {
            return doorplate;
      }

      public void setDoorplate(String doorplate) {
            this.doorplate = doorplate;
      }

      public String getCompany() {
            return company;
      }

      public void setCompany(String company) {
            this.company = company;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public String getPhone() {
            return phone;
      }

      public void setPhone(String phone) {
            this.phone = phone;
      }

      public String getCell_phone() {
            return cell_phone;
      }

      public void setCell_phone(String cell_phone) {
            this.cell_phone = cell_phone;
      }

      public String getEmail() {
            return email;
      }

      public void setEmail(String email) {
            this.email = email;
      }

      public String getPlatform_shop() {
            return platform_shop;
      }

      public void setPlatform_shop(String platform_shop) {
            this.platform_shop = platform_shop;
      }

      public Integer getIs_order_cod() {
            return is_order_cod;
      }

      public void setIs_order_cod(Integer is_order_cod) {
            this.is_order_cod = is_order_cod;
      }

      public float getOrder_cod_price() {
            return order_cod_price;
      }

      public void setOrder_cod_price(float order_cod_price) {
            this.order_cod_price = order_cod_price;
      }

      public String getOrder_cod_currency() {
            return order_cod_currency;
      }

      public void setOrder_cod_currency(String order_cod_currency) {
            this.order_cod_currency = order_cod_currency;
      }

      public Integer getOrder_age_limit() {
            return order_age_limit;
      }

      public void setOrder_age_limit(Integer order_age_limit) {
            this.order_age_limit = order_age_limit;
      }

      public Integer getIs_signature() {
            return is_signature;
      }

      public void setIs_signature(Integer is_signature) {
            this.is_signature = is_signature;
      }

      public Integer getIs_insurance() {
            return is_insurance;
      }

      public void setIs_insurance(Integer is_insurance) {
            this.is_insurance = is_insurance;
      }

      public Integer getInsurance_value() {
            return insurance_value;
      }

      public void setInsurance_value(Integer insurance_value) {
            this.insurance_value = insurance_value;
      }

      public String getChannel_code() {
            return channel_code;
      }

      public void setChannel_code(String channel_code) {
            this.channel_code = channel_code;
      }

      public String getPackageCenterCode() {
            return packageCenterCode;
      }

      public void setPackageCenterCode(String packageCenterCode) {
            this.packageCenterCode = packageCenterCode;
      }

      public String getPackageCenterName() {
            return packageCenterName;
      }

      public void setPackageCenterName(String packageCenterName) {
            this.packageCenterName = packageCenterName;
      }

      public String getQrCode() {
            return QrCode;
      }

      public void setQrCode(String qrCode) {
            QrCode = qrCode;
      }

      public String getShortAddress() {
            return shortAddress;
      }

      public void setShortAddress(String shortAddress) {
            this.shortAddress = shortAddress;
      }

      public String getOrder_desc() {
            return order_desc;
      }

      public void setOrder_desc(String order_desc) {
            this.order_desc = order_desc;
      }

      public String getRemark() {
            return remark;
      }

      public void setRemark(String remark) {
            this.remark = remark;
      }

      public String getOrder_business_type() {
            return order_business_type;
      }

      public void setOrder_business_type(String order_business_type) {
            this.order_business_type = order_business_type;
      }

      public String getReceiver_id_type_code() {
            return receiver_id_type_code;
      }

      public void setReceiver_id_type_code(String receiver_id_type_code) {
            this.receiver_id_type_code = receiver_id_type_code;
      }

      public String getReceiver_id_number() {
            return receiver_id_number;
      }

      public void setReceiver_id_number(String receiver_id_number) {
            this.receiver_id_number = receiver_id_number;
      }

      public String getPay_no() {
            return pay_no;
      }

      public void setPay_no(String pay_no) {
            this.pay_no = pay_no;
      }

      public String getPayer_name() {
            return payer_name;
      }

      public void setPayer_name(String payer_name) {
            this.payer_name = payer_name;
      }

      public String getId_type_code() {
            return id_type_code;
      }

      public void setId_type_code(String id_type_code) {
            this.id_type_code = id_type_code;
      }

      public String getId_number() {
            return id_number;
      }

      public void setId_number(String id_number) {
            this.id_number = id_number;
      }

      public String getPayer_phone() {
            return payer_phone;
      }

      public void setPayer_phone(String payer_phone) {
            this.payer_phone = payer_phone;
      }

      public String getTax() {
            return tax;
      }

      public void setTax(String tax) {
            this.tax = tax;
      }

      public String getOther_payment() {
            return other_payment;
      }

      public void setOther_payment(String other_payment) {
            this.other_payment = other_payment;
      }

      public String getPro_amount() {
            return pro_amount;
      }

      public void setPro_amount(String pro_amount) {
            this.pro_amount = pro_amount;
      }

      public String getTransport_fee() {
            return transport_fee;
      }

      public void setTransport_fee(String transport_fee) {
            this.transport_fee = transport_fee;
      }

      public String getValuation_fee() {
            return valuation_fee;
      }

      public void setValuation_fee(String valuation_fee) {
            this.valuation_fee = valuation_fee;
      }

      public String getTrans_type_id() {
            return trans_type_id;
      }

      public void setTrans_type_id(String trans_type_id) {
            this.trans_type_id = trans_type_id;
      }

      public String getTrans_tool_id() {
            return trans_tool_id;
      }

      public void setTrans_tool_id(String trans_tool_id) {
            this.trans_tool_id = trans_tool_id;
      }

      public String getVoyages() {
            return voyages;
      }

      public void setVoyages(String voyages) {
            this.voyages = voyages;
      }

      public String getPack_type_id() {
            return pack_type_id;
      }

      public void setPack_type_id(String pack_type_id) {
            this.pack_type_id = pack_type_id;
      }

      public String getTrans_sum_no() {
            return trans_sum_no;
      }

      public void setTrans_sum_no(String trans_sum_no) {
            this.trans_sum_no = trans_sum_no;
      }

      public String getLading_bill_no() {
            return lading_bill_no;
      }

      public void setLading_bill_no(String lading_bill_no) {
            this.lading_bill_no = lading_bill_no;
      }

      public Integer getVerify() {
            return verify;
      }

      public void setVerify(Integer verify) {
            this.verify = verify;
      }

      public Integer getForceVerify() {
            return forceVerify;
      }

      public void setForceVerify(Integer forceVerify) {
            this.forceVerify = forceVerify;
      }

      public List<CreateOrderItems> getItems() {
            return items;
      }

      public void setItems(List<CreateOrderItems> items) {
            this.items = items;
      }

      public List<CreateOrderReport> getReport() {
            return report;
      }

      public void setReport(List<CreateOrderReport> report) {
            this.report = report;
      }

      public String getTracking_no() {
            return tracking_no;
      }

      public void setTracking_no(String tracking_no) {
            this.tracking_no = tracking_no;
      }

      public Object getLabel() {
            return label;
      }

      public void setLabel(Object label) {
            this.label = label;
      }

      public Integer getIs_pack_box() {
            return is_pack_box;
      }

      public void setIs_pack_box(Integer is_pack_box) {
            this.is_pack_box = is_pack_box;
      }

      public String getSeller_id() {
            return seller_id;
      }

      public void setSeller_id(String seller_id) {
            this.seller_id = seller_id;
      }

      public String getBuyer_id() {
            return buyer_id;
      }

      public void setBuyer_id(String buyer_id) {
            this.buyer_id = buyer_id;
      }

      public Integer getOnly_logistics() {
            return only_logistics;
      }

      public void setOnly_logistics(Integer only_logistics) {
            this.only_logistics = only_logistics;
      }

      public Integer getIs_release_cargo() {
            return is_release_cargo;
      }

      public void setIs_release_cargo(Integer is_release_cargo) {
            this.is_release_cargo = is_release_cargo;
      }

      public Integer getIs_vip() {
            return is_vip;
      }

      public void setIs_vip(Integer is_vip) {
            this.is_vip = is_vip;
      }

      public String getOrder_kind() {
            return order_kind;
      }

      public void setOrder_kind(String order_kind) {
            this.order_kind = order_kind;
      }

      public String getOrder_payer_name() {
            return order_payer_name;
      }

      public void setOrder_payer_name(String order_payer_name) {
            this.order_payer_name = order_payer_name;
      }

      public String getOrder_id_number() {
            return order_id_number;
      }

      public void setOrder_id_number(String order_id_number) {
            this.order_id_number = order_id_number;
      }

      public String getOrder_payer_phone() {
            return order_payer_phone;
      }

      public void setOrder_payer_phone(String order_payer_phone) {
            this.order_payer_phone = order_payer_phone;
      }

      public String getOrder_country_code_originOption() {
            return order_country_code_originOption;
      }

      public void setOrder_country_code_originOption(String order_country_code_originOption) {
            this.order_country_code_originOption = order_country_code_originOption;
      }

      public String getOrder_sale_amount() {
            return order_sale_amount;
      }

      public void setOrder_sale_amount(String order_sale_amount) {
            this.order_sale_amount = order_sale_amount;
      }

      public String getOrder_sale_currency() {
            return order_sale_currency;
      }

      public void setOrder_sale_currency(String order_sale_currency) {
            this.order_sale_currency = order_sale_currency;
      }

      public String getIs_platform_ebay() {
            return is_platform_ebay;
      }

      public void setIs_platform_ebay(String is_platform_ebay) {
            this.is_platform_ebay = is_platform_ebay;
      }

      public String getEbay_item_id() {
            return ebay_item_id;
      }

      public void setEbay_item_id(String ebay_item_id) {
            this.ebay_item_id = ebay_item_id;
      }

      public String getEbay_transaction_id() {
            return ebay_transaction_id;
      }

      public void setEbay_transaction_id(String ebay_transaction_id) {
            this.ebay_transaction_id = ebay_transaction_id;
      }

      public String getTax_payment_method() {
            return tax_payment_method;
      }

      public void setTax_payment_method(String tax_payment_method) {
            this.tax_payment_method = tax_payment_method;
      }

      public String getCustoms_company_name() {
            return customs_company_name;
      }

      public void setCustoms_company_name(String customs_company_name) {
            this.customs_company_name = customs_company_name;
      }

      public String getCustoms_address() {
            return customs_address;
      }

      public void setCustoms_address(String customs_address) {
            this.customs_address = customs_address;
      }

      public String getCustoms_contact_name() {
            return customs_contact_name;
      }

      public void setCustoms_contact_name(String customs_contact_name) {
            this.customs_contact_name = customs_contact_name;
      }

      public String getCustoms_email() {
            return customs_email;
      }

      public void setCustoms_email(String customs_email) {
            this.customs_email = customs_email;
      }

      public String getCustoms_tax_code() {
            return customs_tax_code;
      }

      public void setCustoms_tax_code(String customs_tax_code) {
            this.customs_tax_code = customs_tax_code;
      }

      public String getCustoms_phone() {
            return customs_phone;
      }

      public void setCustoms_phone(String customs_phone) {
            this.customs_phone = customs_phone;
      }

      public String getCustoms_city() {
            return customs_city;
      }

      public void setCustoms_city(String customs_city) {
            this.customs_city = customs_city;
      }

      public String getCustoms_state() {
            return customs_state;
      }

      public void setCustoms_state(String customs_state) {
            this.customs_state = customs_state;
      }

      public String getCustoms_country_code() {
            return customs_country_code;
      }

      public void setCustoms_country_code(String customs_country_code) {
            this.customs_country_code = customs_country_code;
      }

      public String getCustoms_postcode() {
            return customs_postcode;
      }

      public void setCustoms_postcode(String customs_postcode) {
            this.customs_postcode = customs_postcode;
      }

      public String getCustoms_doorplate() {
            return customs_doorplate;
      }

      public void setCustoms_doorplate(String customs_doorplate) {
            this.customs_doorplate = customs_doorplate;
      }

      public String getConsignee_tax_number() {
            return consignee_tax_number;
      }

      public void setConsignee_tax_number(String consignee_tax_number) {
            this.consignee_tax_number = consignee_tax_number;
      }

      public String getOrder_battery_type() {
            return order_battery_type;
      }

      public void setOrder_battery_type(String order_battery_type) {
            this.order_battery_type = order_battery_type;
      }

      public String getVat_tax_code() {
            return vat_tax_code;
      }

      public void setVat_tax_code(String vat_tax_code) {
            this.vat_tax_code = vat_tax_code;
      }

      public String getDistribution_informationOption() {
            return distribution_informationOption;
      }

      public void setDistribution_informationOption(String distribution_informationOption) {
            this.distribution_informationOption = distribution_informationOption;
      }

      public Integer getConsignee_tax_type() {
            return consignee_tax_type;
      }

      public void setConsignee_tax_type(Integer consignee_tax_type) {
            this.consignee_tax_type = consignee_tax_type;
      }

      public String getConsignee_eori() {
            return consignee_eori;
      }

      public void setConsignee_eori(String consignee_eori) {
            this.consignee_eori = consignee_eori;
      }

      public String getApi_source() {
            return api_source;
      }

      public void setApi_source(String api_source) {
            this.api_source = api_source;
      }

      public String getAssign_date() {
            return assign_date;
      }

      public void setAssign_date(String assign_date) {
            this.assign_date = assign_date;
      }

      public String getAssign_time() {
            return assign_time;
      }

      public void setAssign_time(String assign_time) {
            this.assign_time = assign_time;
      }

      public String getLp_code() {
            return lp_code;
      }

      public void setLp_code(String lp_code) {
            this.lp_code = lp_code;
      }

      public Integer getIs_merge() {
            return is_merge;
      }

      public void setIs_merge(Integer is_merge) {
            this.is_merge = is_merge;
      }

      public String getIOSS() {
            return IOSS;
      }

      public void setIOSS(String IOSS) {
            this.IOSS = IOSS;
      }

      public Integer getMerge_order_count() {
            return merge_order_count;
      }

      public void setMerge_order_count(Integer merge_order_count) {
            this.merge_order_count = merge_order_count;
      }

      public Integer getInsurance_type() {
            return insurance_type;
      }

      public void setInsurance_type(Integer insurance_type) {
            this.insurance_type = insurance_type;
      }

      public String getInsurance_type_goods_valueOption() {
            return insurance_type_goods_valueOption;
      }

      public void setInsurance_type_goods_valueOption(String insurance_type_goods_valueOption) {
            this.insurance_type_goods_valueOption = insurance_type_goods_valueOption;
      }

      public Integer getIs_ju_order() {
            return is_ju_order;
      }

      public void setIs_ju_order(Integer is_ju_order) {
            this.is_ju_order = is_ju_order;
      }
}
