/*******************************************************************************
* Copyright (c) 2013 Leonardo Aniello, Roberto Baldoni, Leonardo Querzoni.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
* Leonardo Aniello, Roberto Baldoni, Leonardo Querzoni
*******************************************************************************/
package backtype.storm.scheduler.adaptive;

import java.util.Map;

import backtype.storm.scheduler.Cluster;
import backtype.storm.scheduler.EvenScheduler;
import backtype.storm.scheduler.IScheduler;
import backtype.storm.scheduler.Topologies;

public class DefaultScheduler implements IScheduler {
	
	private AssignmentTracker assignmentTracker = new AssignmentTracker();
	private EvenScheduler evenScheduler = new EvenScheduler();

	@Override
	public void schedule(Topologies topologies, Cluster cluster) {
		evenScheduler.schedule(topologies, cluster);
		assignmentTracker.checkAssignment(topologies, cluster);
	}

	@Override
	public void prepare(Map conf) {
		// TODO Auto-generated method stub
		
	}

}
