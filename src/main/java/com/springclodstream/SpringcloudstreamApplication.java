package com.springclodstream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;

@SpringBootApplication
@EnableBinding(Sink.class)
public class SpringcloudstreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudstreamApplication.class, args);
	}


	@StreamListener(Sink.INPUT)
	@SendTo(Source.OUTPUT)
	public Object reciece(@Payload String msg){
		System.out.println("msg:"+msg);
		return msg;

	}
}
