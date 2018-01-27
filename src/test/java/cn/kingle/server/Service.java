package cn.kingle.server;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Component;

import cn.kingle.runnable.TcpRunnable;

@Component
public class Service implements Lifecycle {
	@Autowired
	private TcpRunnable tcpRunnable;
	private boolean started = false;
	private Future tcpFuture;
	private final static ExecutorService threadPool = Executors
			.newCachedThreadPool();

	public boolean isRunning() {
		// TODO Auto-generated method stub
		return started;
	}

	public void start() {
		// TODO Auto-generated method stub
		  tcpFuture = threadPool.submit(tcpRunnable);

	}

	public void stop() {
		// TODO Auto-generated method stub

	}

}
