package com.test.quartz;

import java.rmi.RemoteException;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class SchedulerJob implements Job{

	private static Logger logger = Logger.getLogger(SchedulerJob.class);
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
//		System.out.println("JSF 2 + Quartz 2 example");		
//		logger.info("JSF 2 + Quartz 2 example");
//		logger.debug("JSF 2 + Quartz 2 example");
		
		WSUtil util = new WSUtil();
		try {
			util.invokeWs();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
