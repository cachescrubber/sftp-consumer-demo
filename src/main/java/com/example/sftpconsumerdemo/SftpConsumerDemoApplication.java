package com.example.sftpconsumerdemo;

import java.util.function.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.fn.consumer.sftp.SftpConsumerConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.messaging.Message;

@SpringBootApplication
@Import(SftpConsumerConfiguration.class)
public class SftpConsumerDemoApplication {

  @Autowired
  @Qualifier("sftpConsumer")
  private Consumer<Message<?>> sftpConsumer;

  public static void main(String[] args) {
    SpringApplication.run(SftpConsumerDemoApplication.class, args);
  }

}
