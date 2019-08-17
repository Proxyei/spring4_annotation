package com.xywei.spring4.asyn;

import java.util.LinkedList;
import java.util.Queue;

import org.springframework.web.context.request.async.DeferredResult;

public class DeferredResultOrderQueue {

	// 放置deferredResult对象
	private static Queue<DeferredResult<String>> deferredResults = new LinkedList<DeferredResult<String>>();

	public static void saveDeferredResult(DeferredResult<String> deferredResult) {
		deferredResults.add(deferredResult);
	}

	public static DeferredResult<String> getDeferredResult() {

		return deferredResults.poll();
	}

}
