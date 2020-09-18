package os.progress.arithmetic;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ProgressDispatch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//设置PID  到达时间、运行时间
		Progress p1=new Progress(1,new Time(0,40));
		Progress p2=new Progress(2,new Time(20,30));
		Progress p3=new Progress(3,new Time(30,12));
		Progress p4=new Progress(4,new Time(60, 18));
		Progress p5=new Progress(5,new Time(70, 5));
		DispatchArithmetic da1=new DispatchArithmetic();
		da1.load(p1,p2,p3,p4,p5);
		da1.FCFS();
		da1.SJF();
//		Progress p1=new Progress(1,new Time(8,1));
//		Progress p2=new Progress(2,new Time(8.5,0.5));
//		Progress p3=new Progress(3,new Time(9,0.2));
//		Progress p4=new Progress(4,new Time(9.7, 0.1));
//		DispatchArithmetic da1=new DispatchArithmetic();
//		da1.load(p1,p2,p3,p4);
//		da1.FCFS();
//		da1.SJF();
		}
}

class Progress {
	int pid;
	int priority;
	Time time=new Time();
	
	public Progress(int pid, Time time) {
		super();
		this.pid = pid;
		this.time = time;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	
}
class DispatchArithmetic{
	ArrayList<Progress> progArrayList=new ArrayList<Progress>();
	ArrayList<Progress> done=new ArrayList<Progress>();
	ArrayList<Progress> undo=new ArrayList<Progress>();
	double currentTime=0;//设置当前时间，判断进程是否准备好作业
	
	void load(Progress p) {
		progArrayList.add(p);
	}
	void load(Progress ... p) {
		List<Progress> plist=Arrays.asList(p);
		progArrayList.addAll(plist);
	}
	void FCFS() {
		currentTime=0;
		undo.clear();
		done.clear();
		undo.addAll(progArrayList);
		while (undo.size()!=0) {//按到达顺序，为进程服务
			Progress p=undo.get(0);
			while(p.time.arriveTime>currentTime) {
				currentTime+=0.1;
			}
			done.add(p);
			p.time.setStartTime(currentTime);//设置开始时间，并将进程添加至done
			currentTime=currentTime+p.time.runTime;
			undo.remove(0);
		}
		System.out.println("\n------FCFS-----");
		this.show();	
		
	}
	void SJF() {
		currentTime=0;
		undo.clear();
		done.clear();
		undo.addAll(progArrayList);
		while (undo.size()!=0) {
			Progress shortJobProgress=undo.get(0);
			for (int i = 1; i < undo.size(); i++) {//筛选除ShorJob 已到达，且运行时间最短
				if(undo.get(i).time.arriveTime<=currentTime&&undo.get(i).time.runTime<shortJobProgress.time.runTime) {
					shortJobProgress=undo.get(i);
				}
			}
			while(shortJobProgress.time.arriveTime>currentTime) {
				currentTime+=0.1;
			}
			done.add(shortJobProgress);
			shortJobProgress.time.setStartTime(currentTime);
			currentTime=currentTime+shortJobProgress.time.runTime;
			undo.remove(shortJobProgress);
		}
		System.out.println("\n------SJF-----");
		this.show();	
		
	}
	private void show() {
		DecimalFormat df=new DecimalFormat("0.00");
		System.out.println("pid"+"\t 到达时间"+"\t 开始时间"+"\t 运行时间"+"\t 结束时间"+"\t 周转时间");
		for (Iterator<Progress> iterator = done.iterator(); iterator.hasNext();) {
			Progress progress = (Progress) iterator.next();
			System.out.println(progress.pid+"\t"+df.format(progress.time.arriveTime)+"\t "+df.format(progress.time.startTime)+"\t "+df.format(progress.time.runTime)+"\t "+df.format(progress.time.endTime)+"\t "+df.format(progress.time.revolveTime));
		}
		double totalTime=0;
		for (Progress progress : done) {
			totalTime+=progress.time.revolveTime;
		}
		System.out.println("平均周转时间"+df.format(totalTime/done.size()));
	}
}
class Time{
	double arriveTime;
	double runTime;
	double startTime;
	double	endTime;
	double revolveTime;
	
	public Time() {
		super();
	}
	public Time(double arriveTime, double runTime) {
		super();
		this.arriveTime = arriveTime;
		this.runTime = runTime;
	}
	public double getArriveTime() {
		return arriveTime;
	}
	public void setArriveTime(double arriveTime) {
		this.arriveTime = arriveTime;
	}
	public double getRunTime() {
		return runTime;
	}
	public void setRunTime(double runTime) {
		this.runTime = runTime;
	}
	public double getStartTime() {
		return startTime;
	}
	public void setStartTime(double startTime) {
		this.startTime = startTime;
		this.endTime=this.startTime+this.runTime;
		this.revolveTime=this.endTime-this.arriveTime;
	}
	public double getEndTime() {
		return endTime;
	}
	public void setEndTime(double endTime) {
		this.endTime = endTime;
	}
	public double getRevolveTime() {
		return revolveTime;
	}
	public void setRevolveTime(double revolveTime) {
		this.revolveTime = revolveTime;
	}
	
}

