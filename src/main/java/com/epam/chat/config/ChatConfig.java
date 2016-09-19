package com.epam.chat.config;

public class ChatConfig {
	public final static String JNDI_FACTORY = "org.apache.activemq.jndi.ActiveMQInitialContextFactory";	
	public final static String JMS_FACTORY = "ConnectionFactory";	
	public final static String TOPIC = "dynamicTopics/chatTopic";	
	public static final String DEFAULT_URL = "tcp://localhost:61616";
}
