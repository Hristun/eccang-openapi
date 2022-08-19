package com.thirty.service;

import com.thirty.annotation.Service;
import com.thirty.exception.ServiceException;
import com.thirty.orm.*;

import java.util.HashMap;
import java.util.Map;

public class OrderService extends BaseService {

      public OrderService(BaseRequestParam param) {
            super(param);
      }

      /**
       * 地址校验
       * @param address
       * @return
       * @throws ServiceException
       */
      @Service(apiMethod = "checkAddress", needToken = true)
      public EccangResponse<String> checkAddress(CheckAddress address) throws ServiceException {
            return callByBody(address);
      }

      /**
       * 获取订单列表
       * @param list
       * @return
       * @throws ServiceException
       */
      @Service(apiMethod = "getOrderList", needToken = true)
      public EccangResponse<String> getOrderList(GetOrderList list) throws ServiceException {
            return callByBody(list);
      }

      /**
       * 添加订单
       * @param order
       * @return
       * @throws ServiceException
       */
      @Service(apiMethod = "createOrder", needToken = true)
      public EccangResponse<String> createOrder(CreateOrder order) throws ServiceException {
            return callByBody(order);
      }

      /**
       * 修改订单
       * @param order
       * @return
       * @throws ServiceException
       */
      @Service(apiMethod = "modifyOrder", needToken = true)
      public EccangResponse<String> modifyOrder(ModifyOrder order) throws ServiceException {
            return callByBody(order);
      }

      /**
       * 取消订单
       * @param order
       * @return
       * @throws ServiceException
       */
      @Service(apiMethod = "cancelOrder", needToken = true)
      public EccangResponse<String> cancelOrder(CancelOrder order) throws ServiceException {
            return callByBody(order);
      }

      /**
       * 添加订单
       * @param order
       * @return
       * @throws ServiceException
       */
      @Service(apiMethod = "createReturnOrder", needToken = true)
      public EccangResponse<String> createReturnOrder(CreateReturnOrder order) throws ServiceException {
            return callByBody(order);
      }

      /**
       * 查询退仓订单列表
       * @param order
       * @return
       * @throws ServiceException
       */
      @Service(apiMethod = "getReturnOrderList", needToken = true)
      public EccangResponse<String> getReturnOrderList(GetOrderList order) throws ServiceException {
            return callByBody(order);
      }

      /**
       * 根据订单号获取单票订单信息
       * @param order_code
       * @return
       * @throws ServiceException
       */
      @Service(apiMethod = "getOrderByCode", needToken = true)
      public EccangResponse<String> getOrderByCode(String order_code) throws ServiceException {
            Map<String, String> map = new HashMap<>();
            map.put("order_code", order_code);
            return callByBody(map);
      }

      /**
       * 根据参考号获取单票订单信息
       * @param reference_no
       * @return
       * @throws ServiceException
       */
      @Service(apiMethod = "getOrderByRefCode", needToken = true)
      public EccangResponse<String> getOrderByRefCode(String reference_no) throws ServiceException {
            Map<String, String> map = new HashMap<>();
            map.put("reference_no", reference_no);
            return callByBody(map);
      }

      /**
       * 订单号获取订单轨迹详情
       * @param order_numbers
       * @return
       * @throws ServiceException
       */
      @Service(apiMethod = "getOrderTracking", needToken = true)
      public EccangResponse<String> getOrderTracking(String order_numbers) throws ServiceException {
            Map<String, String> map = new HashMap<>();
            map.put("order_numbers", order_numbers);
            return callByBody(map);
      }

      /**
       * 添加轨迹详情
       * @param tracking
       * @return
       * @throws ServiceException
       */
      @Service(apiMethod = "addTracking", needToken = true)
      public EccangResponse<String> addTracking(AddTracking tracking) throws ServiceException {
            return callByBody(tracking);
      }

      /**
       * 添加轨迹详情
       * @param param
       * @return
       * @throws ServiceException
       */
      @Service(apiMethod = "getTransferOrderList", needToken = true)
      public EccangResponse<String> getTransferOrderList(GetTransferOrderList param) throws ServiceException {
            return callByBody(param);
      }

      /**
       * 新建|修改转仓单
       * @param param
       * @return
       * @throws ServiceException
       */
      @Service(apiMethod = "createTransferOrder", needToken = true)
      public EccangResponse<String> createTransferOrder(CreateTransferOrder param) throws ServiceException {
            return callByBody(param);
      }

      /**
       * 获取订单状态
       * @param order_code
       * @return
       * @throws ServiceException
       */
      @Service(apiMethod = "getOrderStatusByCode", needToken = true)
      public EccangResponse<String> getOrderStatusByCode(String order_code) throws ServiceException {
            Map<String, String> map = new HashMap<>();
            map.put("order_code", order_code);
            return callByBody(map);
      }

}
