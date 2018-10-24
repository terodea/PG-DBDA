package util;

import java.io.IOException;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class AttendReduce extends Reducer<Text, Text, Text, FloatWritable> {
	@Override
	protected void reduce(Text arg0, Iterable<Text> arg1,
			Reducer<Text, Text, Text, FloatWritable>.Context arg2) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
	  float max=0;
	  String date="";
		for(Text i:arg1) {
			
			if(Float.parseFloat(i.toString().split(" ")[1]) > max) {
				
				max=Float.parseFloat(i.toString().split(" ")[1]);
				date=i.toString().split(" ")[0];
				}
			
			}
		arg2.write(new Text(arg0+" "+date), new FloatWritable(max));
	}
	
}