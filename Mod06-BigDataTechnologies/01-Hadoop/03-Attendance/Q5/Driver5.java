package q5;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;



public class Driver5 {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		Configuration conf = new Configuration();
		FileSystem hdfs = FileSystem.get(conf);
		Job job = Job.getInstance(conf, "Max Temperature");
		job.setJarByClass(Driver5.class);
		job.setMapperClass(Mapper5.class);
		job.setReducerClass(Reducer5.class);
		
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(IntWritable.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		Path workDirectory=hdfs.getWorkingDirectory();
		Path working=new Path(workDirectory,"/Attendance_4PM_Report.csv");
		Path outputDir=new Path(workDirectory,"/attendenceOutput5n");
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		FileInputFormat.addInputPath(job, working);
		FileOutputFormat.setOutputPath(job, outputDir);
		System.exit(job.waitForCompletion(true)?0:1);

	}

}