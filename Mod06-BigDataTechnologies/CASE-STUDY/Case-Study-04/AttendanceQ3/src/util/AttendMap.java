package util;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class AttendMap extends Mapper<LongWritable, Text, Text, Text>{
	
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, Text>.Context context)
			throws IOException, InterruptedException {
		float number = 0;
		String [] inputValues = value.toString().split(",");
		String date = "";
		String school = "";
		String concat = "";
		try {
			number = Float.parseFloat(inputValues[inputValues.length-1]);
			date = inputValues[inputValues.length - 4];
			school = inputValues[inputValues.length -3];
			concat = date+" "+number;
		}
		catch(NumberFormatException nfe) {
			number = 0;
			}
		context.write(new Text(school),new Text(concat));
	}
}