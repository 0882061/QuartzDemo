package com.ybase.quart;

import java.util.Date;

//import org.quartz.Job;
//import org.quartz.JobExecutionContext;
//import org.quartz.JobExecutionException;

/**
 * @author Tom Yang
 * @version 1.0
 */
public class SimpleQuartJobBean{

	public void execute(){
		System.out.println("執行Job...,時間:"+new Date());
	}
	
}
