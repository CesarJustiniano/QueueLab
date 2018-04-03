package testers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import classes.ArrayQueue;
import classes.SLLQueue;
import classes.Job;

public class JobTester {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayQueue<Integer> inputQueue = new ArrayQueue<Integer>(); 
		ArrayQueue<Integer> processingQueue = new ArrayQueue<Integer>(); 
		Job[] terminatedJobs = new Job[inputQueue.size()];
		Scanner scan = new Scanner(new File("inputFiles", "input.txt")); 
		int t = 0;
		
		while(scan.hasNext()){
			if(scan.hasNextInt())
				inputQueue.enqueue(scan.nextInt());
			else
				scan.next();
		}
		
		inputQueue.toPrint();
		
		
		while(!inputQueue.isEmpty() || !processingQueue.isEmpty()){
			if(!processingQueue.isEmpty()){
				//something here
//				if(terminatedJobs.getRemainingTime() == 0){
//					terminatedJobs.setDepartureTime(t);
//					processingQueue.enqueue(t);
//					
//				}
//				else{
//					
//				}
			}
		}
		
		scan.close();

	}

}
