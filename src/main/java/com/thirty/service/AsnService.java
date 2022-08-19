package com.thirty.service;

import com.thirty.annotation.Service;
import com.thirty.exception.ServiceException;
import com.thirty.orm.BaseRequestParam;
import com.thirty.orm.EccangResponse;
import com.thirty.orm.CreateAsn;
import com.thirty.orm.GetAsnList;

public class AsnService extends BaseService {

      public AsnService(BaseRequestParam param) {
            super(param);
      }

      /**
       * 获取入库单列表
       * @param list
       * @return
       * @throws ServiceException
       */
      @Service(apiMethod = "getAsnList", needToken = true)
      public EccangResponse<String> getAsnList(GetAsnList list) throws ServiceException {
            return callByBody(list);
      }

      /**
       * 创建入库单
       * @param createAsn
       * @return
       * @throws ServiceException
       */
      @Service(apiMethod = "createAsn", needToken = true)
      public EccangResponse<String> createAsn(CreateAsn createAsn) throws ServiceException {
            return callByBody(createAsn);
      }

}
