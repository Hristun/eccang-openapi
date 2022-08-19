package com.thirty.service;

import com.thirty.annotation.Service;
import com.thirty.exception.ServiceException;
import com.thirty.orm.*;

public class FeeService extends BaseService {
      public FeeService(BaseRequestParam param) {
            super(param);
      }

      /**
       * 运费试算
       * @param param
       * @return
       * @throws ServiceException
       */
      @Service(apiMethod = "getCalculateFee", needToken = true)
      public EccangResponse<String> getCalculateFee(GetCalculateFee param) throws ServiceException {
            return callByBody(param);
      }

      /**
       * 运费试算(批量)
       * @param param
       * @return
       * @throws ServiceException
       */
      @Service(apiMethod = "getCalculateFeeBatch", needToken = true)
      public EccangResponse<String> getCalculateFeeBatch(GetCalculateFeeBatch param) throws ServiceException {
            return callByBody(param);
      }

      /**
       * 费用流水
       * @param param
       * @return
       * @throws ServiceException
       */
      @Service(apiMethod = "getCostWater", needToken = true)
      public EccangResponse<String> getCostWater(GetCostWater param) throws ServiceException {
            return callByBody(param);
      }

      /**
       * 费用账单
       * @param param
       * @return
       * @throws ServiceException
       */
      @Service(apiMethod = "getBillingDetail", needToken = true)
      public EccangResponse<String> getBillingDetail(GetBillingDetail param) throws ServiceException {
            return callByBody(param);
      }

      /**
       * 订单费用试算
       * @param param
       * @return
       * @throws ServiceException
       */
      @Service(apiMethod = "getOrderOperateFees", needToken = true)
      public EccangResponse<String> getOrderOperateFees(GetOrderOperateFees param) throws ServiceException {
            return callByBody(param);
      }

      /**
       * 订单费用试算(批量)
       * @param param
       * @return
       * @throws ServiceException
       */
      @Service(apiMethod = "getOrderOperateFeesBatch", needToken = true)
      public EccangResponse<String> getOrderOperateFeesBatch(GetOrderOperateFeesBatch param) throws ServiceException {
            return callByBody(param);
      }
}
