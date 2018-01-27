package cn.kingle.conf;

import io.netty.bootstrap.ServerBootstrap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class NettyConfig
{
  @Bean(name={"serverBootstrap"})
  @Scope("prototype")
  public ServerBootstrap getServerBootstrap()
  {
	System.out.println("NettyConfig");
    return new ServerBootstrap();
  }
}
