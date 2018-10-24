package q4;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

import utility.DemoDriver;
import utility.DemoMapper;
import utility.DemoReducer;

public class Driver4 {

	public static void main(String[] args) throws Exception 
	{
		//step 1: create a job
				Configuration cfg=new Configuration();
				Job job=new Job(cfg,"Find Avg");
				
				//step 2: Set the components
				
				job.setJarByClass(Driver4.class);
				job.setMapperClass(Mapper4.class);
				job.setReducerClass(Reducer4.class);
				
				//step 3: Set the key-value classes
				
				job.setMapOutputKeyClass(Text.class);
				job.setMapOutputValueClass(Text.class);
				job.setOutputKeyClass(Text.class);
				job.setOutputValueClass(FloatWritable.class);
				
				//step 4: Set the input/output paths
				
				Path inputPath=new Path("/",new Path("Attendance_4PM_Report.csv"));
				Path outputPath=new Path("/",new Path("attendanceOutput"));
				
				//step : Set the files to the job
				FileInputFormat.addInputPath(job, inputPath);
				FileOutputFormat.setOutputPath(job, outputPath);
				
				//step 6: Set the input/output format of class
				job.setInputFormatClass(TextInputFormat.class);
				job.setOutputFormatClass(TextOutputFormat.class);
				
				//Step 7: Submit the job 
				System.exit(job.waitForCompletion(true)?0:1);

	}

}