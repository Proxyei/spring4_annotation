package com.xywei.spring4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

import com.xywei.spring4.asyn.DeferredResultOrderQueue;

/**
 * 主要测试Spring MVC异步消息
 * 
 * @author future
 *
 */
@Controller
public class OrderController {

	@RequestMapping("/createOrderAsyn")
	@ResponseBody
	public DeferredResult<String> createOrderAsyn() {

		DeferredResult<String> deferredResult = new DeferredResult<String>(10000L, "fail");

		// 模拟丢给消息队列
		DeferredResultOrderQueue.saveDeferredResult(deferredResult);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>收到处理完毕的订单号: "+deferredResult.getResult());
		return deferredResult;
	}

	/**
	 * 模拟创建订单的应用，实际是由监听器完成
	 * 
	 * @return
	 */
	@RequestMapping("/createOrder")
	@ResponseBody
	public String createOreder() {

		String orderNumber = "1900AABBCC";
		// 从消息队列中获取deferredResult
		DeferredResult<String> deferredResult = DeferredResultOrderQueue.getDeferredResult();
		// 完成设值
		deferredResult.setResult(orderNumber);
		return orderNumber;
	}

}
