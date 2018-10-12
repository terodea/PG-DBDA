package util;
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

public class Weather {

	public static void main(String[] args) throws IOException,InterruptedException,ClassNotFoundException
	{
		Configuration config=new Configuration();
		FileSystem hdfs=FileSystem.get(config);
		Job job=Job.getInstance(config,"MaxTemp");
		job.setJarByClass(Weather.class);
		job.setMapperClass(Map.class);
		job.setReducerClass(Reduce.class);
		job.setOutputKeyClass(Text.class);						//data types for output or how the data is to be stored in file
		job.setOutputValueClass(DoubleWritable.class);
		
		Path workDirectory=hdfs.getWorkingDirectory();
		System.out.println(workDirectory);
		Path working=new Path("/Weather.csv");
		Path outputDir= new Path(workDirectory,"/weatherdir1");
		job.setInputFormatClass(TextInputFormat.class);  // output format of the file
		job.setOutputFormatClass(TextOutputFormat.class);
		FileInputFormat.addInputPath(job,working);
		FileOutputFormat.setOutputPath(job,outputDir);
		System.exit(job.waitForCompletion(true)?0:1);
	}
}