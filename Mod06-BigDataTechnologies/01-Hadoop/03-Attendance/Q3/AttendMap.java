package util;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class AttendMap extends Mapper<LongWritable, Text, Text, Text>{
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, Text>.Context context)
			throws IOException, InterruptedException {
		
		try {
		
		if(value.toString().contains("SCHOOL_YEAR")) {
			return;
		}
		else 
		{
		String [] str=value.toString().split(",");
		
		
		context.write(new Text(str[2]), new Text(str[1]+" "+str[str.length-1]));
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}