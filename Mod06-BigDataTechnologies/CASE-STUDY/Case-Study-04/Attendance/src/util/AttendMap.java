package util;

import java.io.IOException;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class AttendMap extends Mapper<LongWritable, Text, Text, FloatWritable>{
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, FloatWritable>.Context context)
			throws IOException, InterruptedException {
		float number=0;
		String [] inputValues = value.toString().split(",");
		try {
			number=Float.parseFloat(inputValues[inputValues.length-1]);
		}
		catch(NumberFormatException nfe) {
			//approach 1: replace information
			number = 0;
			
			//approach 2: ignore data
			//return;
		}
		context.write(new Text("All Data"),new FloatWritable(number));
		}
	}