package cn.kingle.runnable;

import io.netty.bootstrap.ServerBootstrap;
import java.io.PrintStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TcpRunnable implements Runnable
{
  @Autowired
  private ServerBootstrap serverBootstrap;
  
  public void run()
  {
    if (this.serverBootstrap == null) {
      System.out.println("null");
    } else {
      System.out.println("!null");
    }
  }
}
