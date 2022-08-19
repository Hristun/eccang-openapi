package com.thirty.service;

import com.thirty.annotation.Service;
import com.thirty.exception.ServiceException;
import com.thirty.orm.BaseRequestParam;
import com.thirty.orm.EccangResponse;
import com.thirty.orm.GetProductList;

public class ProductService extends BaseService {

      public ProductService(BaseRequestParam param) {
            super(param);
      }

      /**
       * 获取入库单列表
       * @param list
       * @return
       * @throws ServiceException
       */
      @Service(apiMethod = "getProductList", needToken = true)
      public EccangResponse<String> getProductList(GetProductList list) throws ServiceException {
            return callByBody(list);
      }
}
