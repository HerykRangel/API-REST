package com.nrsgroup.config;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAsync
@EnableScheduling
public class AsyncConfig extends AsyncConfigurerSupport{
	
	@Bean (name = "taskExecutor")
	public Executor taskExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(5);										// MINO NUMERO DE PROCESOS VIVOS
		executor.setMaxPoolSize(10);										// MAXIMO NUMERO DE PROCESOS QUE SE PUEDEN CREAR
		executor.setQueueCapacity(100);										// CAPACIDAD DEL TASK QUEQUE (CONTENEDOR DE TAREAS)
		executor.setThreadNamePrefix("vehiculoThread-");
		executor.initialize();
		return executor;
	}
}
