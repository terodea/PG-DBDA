package util;

import org.apache.hadoop.io.Text;

import java.io.IOException;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Mapper;

public class AttendMap extends Mapper<LongWritable, Text, Text, FloatWritable> {
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, FloatWritable>.Context context)
			throws IOException, InterruptedException {
		float number = 0;
		String [] inputValues = value.toString().split(",");
		String year=inputValues[0].trim();
		try {
			number=Float.parseFloat(inputValues[inputValues.length-1]);
		}
		catch(NumberFormatException nfe) {
			number = 0; 
		}
		context.write(new Text(year), new FloatWritable(number));
	}
}