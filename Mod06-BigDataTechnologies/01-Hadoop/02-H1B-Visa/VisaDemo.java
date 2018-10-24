package apps;

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

public class VisaDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		Configuration conf = new Configuration();
		FileSystem hdfs = FileSystem.get(conf);
		Job job = Job.getInstance(conf, "Visa Data");
		job.setJarByClass(VisaDemo.class);
		job.setMapperClass(Map.class);
		job.setReducerClass(Reduce.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(LongWritable.class);
		
		Path workDirectory=hdfs.getWorkingDirectory();
		Path working=new Path(workDirectory ,"/h1b_kaggle.csv");
		Path outputDir=new Path(workDirectory,"/Visa");
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		FileInputFormat.addInputPath(job, working);
		FileOutputFormat.setOutputPath(job, outputDir);
		System.exit(job.waitForCompletion(true)?0:1);
	}
}